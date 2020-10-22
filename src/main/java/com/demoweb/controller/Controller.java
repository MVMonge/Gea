package com.demoweb.controller;

import java.util.List;

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

	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name",required=false,defaultValue="World")String name, Model model) {
	
		//Guardo mi nueva persona en la base de datos:: VA EN SERVICE
		Admin a = new Admin();
		a.setIdAdmin(1);
		a.setName("Name2");
		adminrepo.save(a);
		
		model.addAttribute("name",name);
		return "greeting";
	}/*
	@GetMapping("/clientread")
	public String greeting(Model model) {
		
		
		List<Client> clients = clientservice.read();
		model.addAttribute("clients",clients);
		return "clientread";
	}*/
}
 