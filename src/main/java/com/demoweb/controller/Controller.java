package com.demoweb.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

import com.demoweb.model.Admin;
import com.demoweb.model.Client;
import com.demoweb.modelinterface.IAdmin;
import com.demoweb.service.AdminService;
//import com.demoweb.modelinterface.IClient;
import com.demoweb.service.ClientService;

@org.springframework.stereotype.Controller
public class Controller {

//	@Autowired
//	private IAdmin adminrepo;
//	@Autowired
	//private IClient clientrepo;
	private ClientService clientservice; 
	private AdminService adminservice;
	
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name",required=false,defaultValue="World")String name, Model model) {
	
		//Guardo mi nueva persona en la base de datos:: VA EN SERVICE
	
		return "greeting";
	}
	
	@GetMapping("/clientread")
	public String ReadClients(Model model) {
		Admin admin = new Admin();
		admin.setIdAdmin(1);
		admin.setName("Name2");
		adminservice= new AdminService();
		adminservice.save(admin);
		System.out.print(adminservice.toString());		
		List<Admin> administrators = adminservice.read();
		model.addAttribute("administrators",administrators);
		
		
		Client a = new Client();
		a.setPhone("1576883452");
		a.setName("Juana Auad");
		a.setEmail("juana.auad@gmail.com");
		a.setId_administrator(1);
		clientservice.save(a);
		
		List<Client> clients = clientservice.read();
		model.addAttribute("clients",clients);
		
		return "clientread";
	}
	@GetMapping("/newclient")
	public String AddClient(Model model) {
		model.addAttribute("client", new Client());
		return "clientadd";
	}
	@PostMapping("/save")
	public String SaveClient(@Valid Client c, Model model) {
		clientservice.save(c);
		return("redirect:/clientread");
	}
	
}
 