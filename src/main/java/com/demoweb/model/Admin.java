package com.demoweb.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Administrator")
public class Admin  {
	
	public Admin(String name) {
		super();
		this.name = name;
	}
	@Id
	private int idAdmin;
	@Column(name="nombre", length =50)
	private String name;
	
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
