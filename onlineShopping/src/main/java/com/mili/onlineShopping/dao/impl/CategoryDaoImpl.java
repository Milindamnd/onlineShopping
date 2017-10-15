package com.mili.onlineShopping.dao.impl;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mili.onlineShopping.dao.CategoryDao;
import com.mili.onlineShopping.model.Category;

@Repository("categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	
	public boolean addCategory(Category category) {
		sessionFactory.getCurrentSession().save(category);
		return true;
	}

	@Override
	
	public List<Category> list() {
		String selectActiveCategory="From Category C WHERE C.is_active = true";
		Query query=sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		return query.getResultList();
		
	}

	@Override
	public Category get(int id) {
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

}
