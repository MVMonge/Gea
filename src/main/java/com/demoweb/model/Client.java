package com.demoweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Client")
public class Client {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
public int id;
@Column (name="id_administrator")
public int id_administrator;
@Column(name="email")
public String email;
@Column(name="phone")
public String phone;
@Column(name="name")
public String name;
public int getId_administrator() {
	return id_administrator;
}
public void setId_administrator(int id_administrator) {
	this.id_administrator = id_administrator;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}