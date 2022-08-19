package com.dao;

import java.util.ArrayList;

import com.bean.ProductBean;


public class ProductDao {
	public static ArrayList<ProductBean> products = new ArrayList<ProductBean>();
	
	public void addProduct(ProductBean product)
	{
		this.products.add(product);
	}
	
	public ArrayList<ProductBean> getAllProducts()
	{
		ProductBean productBean = new ProductBean();
		productBean.getProductId();
		productBean.getProductName();
		productBean.getProductPrice();
		productBean.getProductQuantity();
		productBean.getProductCategory();
	
		return products;
	}
	
}
