package com.jspiders.services.tripdetailsservice;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.jspiders.entities.BillDetails;
import com.jspiders.entities.TripDetails;
import com.jspiders.entities.TripDetailsDTO;

public interface TripDetailsService {

	public ResponseEntity<TripDetails> insertTripDetails(TripDetailsDTO tripDto);
	
	public ResponseEntity<String> deleteBookedTrip(TripDetailsDTO tripDto);
	
	public ResponseEntity<List<TripDetails>> getAllTripsOfCustomer(TripDetailsDTO tripDto);
	
	public ResponseEntity<String> calculateBill(TripDetailsDTO tripDto);
	
	public ResponseEntity<BillDetails> generateBill(TripDetailsDTO tripDto);
}
