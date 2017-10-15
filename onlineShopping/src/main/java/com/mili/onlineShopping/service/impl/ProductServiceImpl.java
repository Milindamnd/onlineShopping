package com.mili.onlineShopping.service.impl;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mili.onlineShopping.dao.ProductDao;
import com.mili.onlineShopping.model.Product;
import com.mili.onlineShopping.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;
	@Override
	public void addProduct(Product product) {
		productDao.addProduct(product);

	}
	@Override
	public List<Product> getListOfAllProduct() {
		return productDao.getListOfAllProduct();
	
	}
	@Override
	public List<Product> getProductById(int id) {
		
		return productDao.getProductById(id);
	}
	@Override
	public Product getSingleProductById(int id) {
		return productDao.getSingleProductById(id);
	}
	@Override
	public void updateProduct(Product product) {
		productDao.updateProduct(product);
		
	}

}
