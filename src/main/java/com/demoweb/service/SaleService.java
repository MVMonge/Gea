package com.demoweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demoweb.model.Sale;
import com.demoweb.modelinterface.ISale;
import com.demoweb.serviceinterfaces.ISaleService;

public class SaleService implements ISaleService {

	@Autowired
	private ISale data;
	
	@Override
	public List<Sale> read() {
		// TODO Auto-generated method stub
		return (List<Sale>) data.findAll();
	}

	@Override
	public int save(Sale sale) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
