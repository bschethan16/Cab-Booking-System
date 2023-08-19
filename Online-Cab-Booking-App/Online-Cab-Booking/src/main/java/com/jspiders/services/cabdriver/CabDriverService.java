package com.jspiders.services.cabdriver;

import org.springframework.http.ResponseEntity;

import com.jspiders.entities.CabDriver;
import com.jspiders.entities.CabDriverCabDTO;

public interface CabDriverService {
	
	public ResponseEntity<CabDriver> insertCabDriver(CabDriverCabDTO cabdto);
	
	public ResponseEntity<CabDriver> updateCabDriver(CabDriverCabDTO cabdtupdate,String user,String pass);
	
	public ResponseEntity<String> deleteCabDriver(CabDriver cabDriver);
	
	public ResponseEntity<String> updateStatus(CabDriver cabDriver);

}
