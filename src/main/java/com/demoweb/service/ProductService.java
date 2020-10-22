package com.demoweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demoweb.model.Product;
import com.demoweb.modelinterface.IProduct;
import com.demoweb.serviceinterfaces.IProductService;

public class ProductService implements IProductService {

	@Autowired
	private IProduct data;
	@Override
	public List<Product> read() {
		// TODO Auto-generated method stub
		return (List<Product>) data.findAll();
	}

	@Override
	public int save(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
