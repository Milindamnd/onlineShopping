package com.mili.onlineShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mili.onlineShopping.dao.CategoryDao;
import com.mili.onlineShopping.dao.ProductDao;
import com.mili.onlineShopping.model.Category;
import com.mili.onlineShopping.model.Product;
import com.mili.onlineShopping.service.CategoryService;
import com.mili.onlineShopping.service.ProductService;

@Controller
public class HomeController {
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value= {"/" , "/index" , "/home"})
	public ModelAndView index() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("categories",categoryService.list());
		mv.addObject("title","Home");
		mv.addObject("onClickHome",true);
		return mv;
		
	}
	@RequestMapping(value= {"/about"})
	public ModelAndView about() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("onClickAbout",true);
		return mv;
		
	}
	@RequestMapping(value= {"/show/all/product"})
	public ModelAndView listOfProduct() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("categories",categoryService.list());
		mv.addObject("title","View Products");
		mv.addObject("onClickAllProduct",true);
		return mv;
		
	}
	@RequestMapping(value= {"/contact"})
	public ModelAndView contactUs() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("onClickContact",true);
		return mv;
		
	}
	/*public ModelAndView category() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","category");
		mv.addObject("onClickCategory",true);
		return mv;
		
	}*/
	@RequestMapping(value= {"/show/category/{id}/product"})
	public ModelAndView filterCatagoryById(@PathVariable("id")int id) {
		ModelAndView mv=new ModelAndView("page");
		Category category = null;
		category = categoryService.get(id);
		mv.addObject("title",category.getName());
		mv.addObject("categories",categoryService.list());
		mv.addObject("category",category);
		mv.addObject("onClickCategoryProduct",true);
		return mv;
		
	}
	@RequestMapping(value= {"/show/{id}/product"})
	public ModelAndView viewProductById(@PathVariable int id) {
		ModelAndView modelAndView=new ModelAndView("page");
		Product product=productService.getSingleProductById(id);
		product.setViews(product.getViews() + 1);
		productService.updateProduct(product);
		modelAndView.addObject("title",product.getName());
		modelAndView.addObject("product",product);
		modelAndView.addObject("OnClickSingleProdcut",true);
		return modelAndView;
		
	}
	
}
