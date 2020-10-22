package com.demoweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Forproduction")
public class ForProduction extends Product{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
private int id;
}