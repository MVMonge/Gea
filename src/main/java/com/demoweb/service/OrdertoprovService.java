package com.demoweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demoweb.model.OrdertoProv;
import com.demoweb.modelinterface.IOrdertoProv;
import com.demoweb.serviceinterfaces.IOrdertoprovService;

public class OrdertoprovService implements IOrdertoprovService{

	@Autowired
	private IOrdertoProv data;
	
	@Override
	public List<OrdertoProv> read() {
		// TODO Auto-generated method stub
		return (List<OrdertoProv>)data.findAll();
	}

	@Override
	public int save(OrdertoProv order) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}


}
