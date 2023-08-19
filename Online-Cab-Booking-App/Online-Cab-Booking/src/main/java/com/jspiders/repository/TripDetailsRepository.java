package com.jspiders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspiders.entities.TripDetails;


@Repository
public interface TripDetailsRepository extends JpaRepository<TripDetails, Integer>{

	

	
	
}
