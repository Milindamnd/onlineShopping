package com.mili.onlineShopping.dao;

import java.util.List;

import com.mili.onlineShopping.model.Category;

public interface CategoryDao {

	boolean addCategory(Category category);
	List<Category>list();
	Category get(int id);
}
