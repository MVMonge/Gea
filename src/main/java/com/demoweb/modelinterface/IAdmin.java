package com.demoweb.modelinterface;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demoweb.model.Admin;

public interface IAdmin extends JpaRepository<Admin,Integer>{

}
