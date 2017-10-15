package com.mili.onlineShopping.model;

import java.util.UUID;

import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Product{

	private int productId;
	private String code;
	@NotBlank(message="Please Enter Product Name")
	private String name;
	@NotBlank(message="Please Enter Product Brand")
	private String brand;
	@NotBlank(message="Please Enter Description about Your Product")
	@JsonIgnore
	private String description;
	@Min(value=1,message="Price Cannot be less than 1 ")
	private double unitPrice;
	//@Min(value=1,message="Quantity Cannot be less than 1 ")
	private int qty;
	@JsonIgnore
	private boolean active;
	@JsonIgnore
	private int category_id;
	@JsonIgnore
	private int supplier_id;
	private int purchases;
	private int views;
	
	@Transient
	private MultipartFile image_file;
	
	
	public MultipartFile getImage_file() {
		return image_file;
	}

	public void setImage_file(MultipartFile image_file) {
		this.image_file = image_file;
	}

	public Product() {
		this.code="PRD" + UUID.randomUUID().toString().substring(26).toUpperCase();
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}

	public int getPurchases() {
		return purchases;
	}

	public void setPurchases(int purchases) {
		this.purchases = purchases;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", code=" + code + ", name=" + name + ", brand=" + brand
				+ ", description=" + description + ", unitPrice=" + unitPrice + ", qty=" + qty + ", active=" + active
				+ ", category_id=" + category_id + ", supplier_id=" + supplier_id + ", purchases=" + purchases
				+ ", views=" + views + "]";
	}
	


}