package com.demoweb.serviceinterfaces;

import java.util.List;

import com.demoweb.model.Client;

public interface IClientService {
	public List<Client> read();
	public int save(Client client);
	public boolean delete(int id);
}
