package com.mili.onlineShopping.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mili.onlineShopping.dao.ProductDao;
import com.mili.onlineShopping.model.Product;

@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addProduct(Product product) {
		sessionFactory.getCurrentSession().save(product);
	}
	@Override
	public List<Product> getListOfAllProduct() {
		String selectActiveProduct="From Product P WHERE P.active = true";
		Query query=sessionFactory.getCurrentSession().createQuery(selectActiveProduct);
		return query.getResultList();
		
	}
	@Override
	public List<Product> getProductById(int id) {
		String getProductById="From Product P WHERE P.active = true AND P.category_id = '"+ id +"'";
		Query query=sessionFactory.getCurrentSession().createQuery(getProductById);
		return query.getResultList();
		
	}
	@Override
	public Product getSingleProductById(int id) {
		Product product=sessionFactory.getCurrentSession().get(Product.class, Integer.valueOf(id));
		return product;
	}
	@Override
	public void updateProduct(Product product) {
		sessionFactory.getCurrentSession().update(product);
		
	}

}
