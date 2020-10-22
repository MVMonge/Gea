package com.demoweb.modelinterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoweb.model.Product;

public interface IProduct extends JpaRepository<Product,Integer>{

}
