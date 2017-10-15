package com.mili.onlineShopping.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mili.onlineShopping.dao.CategoryDao;
import com.mili.onlineShopping.model.Category;
import com.mili.onlineShopping.service.CategoryService;

@Service("categoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDao categoryDao;
	@Override
	
	public boolean addCategory(Category category) {
		categoryDao.addCategory(category);
		return true;
	}

	@Override
	
	public List<Category> list() {
		return categoryDao.list();
		
	}

	@Override
	public Category get(int id) {
		return categoryDao.get(id);
	}

}
