package com.jspiders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspiders.entities.Admin;
import com.jspiders.entities.CabDriver;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	public Admin findByUsername(String username);
	
	public Admin findByUsernameAndPassword(String user,String pass);
}
