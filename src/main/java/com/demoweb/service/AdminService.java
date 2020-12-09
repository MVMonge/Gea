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
		return (List<Admin>) data.findAll();
	}

	@Override
	public int save(Admin administrator) {
		int res=0;
		Admin a = data.save(administrator);
		if(a != null)
		{
			res = 1; 
		}
		return 0;// return 0; 
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
