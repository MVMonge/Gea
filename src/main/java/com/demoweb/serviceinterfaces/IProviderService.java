package com.demoweb.serviceinterfaces;

import java.util.List;

import com.demoweb.model.Provider;

public interface IProviderService {
	public List<Provider> read();
	public int save(Provider provider);
	public boolean delete(int id);
}
