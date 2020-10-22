package com.demoweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demoweb.model.Admin;
import com.demoweb.modelinterface.IAdmin;

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
	}
}
 