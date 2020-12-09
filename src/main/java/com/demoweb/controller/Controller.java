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
import com.demoweb.serviceinterfaces.IAdminService;
import com.demoweb.serviceinterfaces.IClientService;

@org.springframework.stereotype.Controller
public class Controller {

	private IAdminService adminservice = new AdminService();	
	
	@GetMapping("/")
	public String Login(Model model) {
		
		return "login";
	}
	@GetMapping("/error")
	public String Home(Model model) {
		return "login";
	}
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name",required=false,defaultValue="World")String name, Model model) {
		return "greeting";
	}
	
	@GetMapping("/clientread")
	public String ReadClients(Model model) {
		
	/*	Client a = new Client();
		a.setPhone("1576883452");
		a.setName("Juana Auad");
		a.setEmail("juana.auad@gmail.com");
		a.setId_administrator(1);
		clientservice.save(a);*/
		
		//List<Client> clients = clientservice.read();
		//model.addAttribute("clients",clients);
		
		return "clientread";
	}
	
	@GetMapping("/newclient")
	public String AddClient(Model model) {
		model.addAttribute("client", new Client());
		return "clientadd";
	}
	
	@PostMapping("/save")
	public String SaveClient(@Valid Client c, Model model) {
		//clientservice.save(c);
		return("redirect:/clientread");
	}
	
}
 