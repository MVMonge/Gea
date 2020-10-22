package com.demoweb.serviceinterfaces;

import java.util.List;

import com.demoweb.model.Sale;

public interface ISaleService {
	public List<Sale> read();
	public int save(Sale sale);
	public boolean delete(int id);
}
