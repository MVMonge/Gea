package com.demoweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demoweb.model.Client;
import com.demoweb.modelinterface.IClient;
import com.demoweb.serviceinterfaces.IClientService;

public class ClientService implements IClientService{

	@Autowired
	private IClient data;
	
	@Override
	public List<Client> read() {
		// TODO Auto-generated method stub
		return (List<Client>) data.findAll();
	}

	@Override
	public int save(Client client) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}


}