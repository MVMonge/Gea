package com.demoweb.serviceinterfaces;

import java.util.List;

import com.demoweb.model.Product;

public interface IProductService {
	public List<Product> read();
	public int save(Product product);
	public boolean delete(int id);
}
