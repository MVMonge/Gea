package com.demoweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demoweb.model.Provider;
import com.demoweb.modelinterface.IProvider;
import com.demoweb.serviceinterfaces.IProviderService;

public class ProviderService implements IProviderService {

	@Autowired 
	private IProvider data;
	@Override
	public List<Provider> read() {
		// TODO Auto-generated method stub
		return (List<Provider>) data.findAll();
	}

	@Override
	public int save(Provider provider) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
