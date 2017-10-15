package com.mili.onlineShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mili.onlineShopping.model.Category;
import com.mili.onlineShopping.service.CategoryService;

@Controller
@RequestMapping(value = "/manageCategory")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(value = "/category")
	public ModelAndView addCategory(@ModelAttribute Category category) {
		categoryService.addCategory(category);
		return new ModelAndView("category");
	}
}
