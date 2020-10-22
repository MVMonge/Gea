package com.demoweb.modelinterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoweb.model.Client;

public interface IClient extends JpaRepository<Client,Integer>{

}
