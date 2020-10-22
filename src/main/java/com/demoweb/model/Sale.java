package com.demoweb.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sale")
public class Sale {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
private int id;
@Column(name="idAdministrator")
private int id_administrator;
@Column(name="date")
private Date date;
@Column(name="id_client")
private int id_client;
@Column(name="retail")
private double retail;
}