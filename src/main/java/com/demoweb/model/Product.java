package com.demoweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public abstract class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
private int id;
@Column(name="name")
private String name;
@Column (name="idAdministrator")
private int id_administrator;
@Column(name="category")
private int id_category;
@Column(name="stock")
private int stock;
@Column(name="is_for_sale")
private boolean is_for_sale;
}