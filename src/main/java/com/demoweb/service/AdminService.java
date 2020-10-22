package com.demoweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demoweb.model.Admin;
import com.demoweb.modelinterface.IAdmin;
import com.demoweb.serviceinterfaces.IAdminService;

public class AdminService implements IAdminService{

	@Autowired
	private IAdmin data;
	
	@Override
	public List<Admin> read() {
		// TODO Auto-generated method stub
		return (List<Admin>) data.findAll();
	}

	@Override
	public int save(Admin administrator) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
