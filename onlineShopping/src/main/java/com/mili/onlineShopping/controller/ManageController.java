package com.mili.onlineShopping.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mili.onlineShopping.model.Category;
import com.mili.onlineShopping.model.Product;
import com.mili.onlineShopping.service.CategoryService;
import com.mili.onlineShopping.service.ProductService;
import com.mili.onlineShopping.util.FileUploadUtil;


@Controller
@RequestMapping("/manage")
public class ManageController {

	@Autowired
	CategoryService categoryService;
	@Autowired
	ProductService productService;
	
	
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public ModelAndView manageProduct(@RequestParam(name="operation",required=false)String operation) {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("onClickManageProduct",true);
		mv.addObject("title","Manage Products");
		Product nProduct=new Product();
		nProduct.setSupplier_id(1);
		nProduct.setActive(true);
		mv.addObject("product",nProduct);
		
		if(operation!=null) {
			if(operation.equals("product")) {
				mv.addObject("message","Product Added Successfully...!!!");
			}
			
		}
		return mv;
		
	}
	//hadling product submit
	@RequestMapping(value="/products",method=RequestMethod.POST)
	public String hadleProductSubmit(@Valid @ModelAttribute("product")Product product,BindingResult result,Model model,
			HttpServletRequest request) {
		if(result.hasErrors()) {
			model.addAttribute("onClickManageProduct",true);
			model.addAttribute("title","Manage Product");
			model.addAttribute("messageError","Sorry..Product Added Failed..!!!");
			return "page";
		}
		if(!product.getImage_file().getOriginalFilename().equals("")) {
			FileUploadUtil.uploadImageFile(request,product.getImage_file(),product.getCode());
		}
		productService.addProduct(product);
		
		return "redirect:/manage/products?operation=product";
	}
	@ModelAttribute("categories")
	public List<Category>getListOfCategory(){
		return categoryService.list() ;
		
	}
	
}
