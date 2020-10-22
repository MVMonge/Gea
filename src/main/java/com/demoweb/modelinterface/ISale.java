package com.demoweb.modelinterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoweb.model.Sale;


public interface ISale extends JpaRepository<Sale,Integer>{

}
