package com.demoweb.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ordertoprov")
public class OrdertoProv {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	@Column(name="idAdministrator")
	private int id_administrator;
	@Column(name="Dateorder")
	private Date date_order;
	@Column(name="Datedelivery")
	private Date date_delivery;
	@Column(name="Idprovider")
	private int id_provider;
	@Column(name="Idproduct")
	private int id_product;
	@Column(name="Cost")
	private double cost;
	@Column(name="Units")
	private int units;
}
/*
 * 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	@Column (name="idAdministrator")
	private int id_administrator;
	@Column(name="Dateorder")
	private Date date_order;
	@Column(name="Datedelivery")
	private Date date_delivery;
	@Column(name="Idprovider")
	private int id_provider;
	@Column(name="Idproduct")
	private int id_product;
	@Column(name="Cost")
	private double cost;
	@Column(name="Units")
	private int units;
	
}
 */
