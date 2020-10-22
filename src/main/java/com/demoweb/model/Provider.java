package com.demoweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Provider")
public class Provider {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
private int id;
@Column (name="idAdministrator")
private int id_administrator;
@Column(name="name")
private String name;
@Column(name="email")
private String email;
}