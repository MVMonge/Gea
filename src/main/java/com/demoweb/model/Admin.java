package com.demoweb.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Administrator")
public class Admin  {
	
	public Admin(String name, String mail, String password) {
		super();
		this.name = name;
		this.mail = mail; 
		this.password = password;
	}
	
	@Id
	private int idAdmin;
	@Column(name="name", length =50)
	private String name;
	@Column(name="mail", length =50)
	private String mail;
	@Column(name="password", length =50)
	private String password;
	
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
