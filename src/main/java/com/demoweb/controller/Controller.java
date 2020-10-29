package com.demoweb.controller;

import java.util.List;

import javax.persistence.Column;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demoweb.model.Admin;
import com.demoweb.model.Client;
import com.demoweb.modelinterface.IAdmin;
import com.demoweb.modelinterface.IClient;
import com.demoweb.serviceinterfaces.IClientService;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	private IAdmin adminrepo;
	@Autowired
	private IClient clientrepo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name",required=false,defaultValue="World")String name, Model model) {
	
		//Guardo mi nueva persona en la base de datos:: VA EN SERVICE
	
		return "greeting";
	}
	@GetMapping("/clientread")
	public String greeting(Model model) {
		Admin admin = new Admin();
		admin.setIdAdmin(1);
		admin.setName("Name2");
		adminrepo.save(admin);
		
		List<Admin> administrators = adminrepo.findAll();
		model.addAttribute("administrators",administrators);
		
		
		
		Client a = new Client();
		a.setPhone("1576883452");
		a.setName("Juana Auad");
		a.setEmail("juana.auad@gmail.com");
		a.setId_administrator(1);
		clientrepo.save(a);
		
		List<Client> clients = clientrepo.findAll();
		model.addAttribute("clients",clients);
		return "clientread";
	}
}
 