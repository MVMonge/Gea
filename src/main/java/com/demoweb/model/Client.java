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
private int id;
@Column (name="id_administrator")
private int id_administrator;
@Column(name="email")
private String email;
@Column(name="phone")
private String phone;
@Column(name="name")
private String name;
}