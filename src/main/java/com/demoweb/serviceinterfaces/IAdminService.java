package com.demoweb.serviceinterfaces;

import java.util.List;

import com.demoweb.model.Admin;

public interface IAdminService {
	public List<Admin> read();
	public int save(Admin administrator);
	public boolean delete(int id);
}
