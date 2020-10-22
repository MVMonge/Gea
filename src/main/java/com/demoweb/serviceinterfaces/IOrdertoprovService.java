package com.demoweb.serviceinterfaces;

import java.util.List;

import com.demoweb.model.OrdertoProv;

public interface IOrdertoprovService {
	public List<OrdertoProv> read();
	public int save(OrdertoProv order);
	public boolean delete(int id);
}
