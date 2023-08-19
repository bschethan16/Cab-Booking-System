package com.jspiders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspiders.entities.Cab;


@Repository
public interface CabRepository extends JpaRepository<Cab, Integer> {
	
	public Cab findByNumberPlate(String number);
	

}
