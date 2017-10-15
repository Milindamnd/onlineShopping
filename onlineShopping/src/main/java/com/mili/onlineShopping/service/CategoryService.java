package com.mili.onlineShopping.service;

import java.util.List;

import com.mili.onlineShopping.model.Category;

public interface CategoryService {

	boolean addCategory(Category category);
	List<Category>list();
	Category get(int id);
}
