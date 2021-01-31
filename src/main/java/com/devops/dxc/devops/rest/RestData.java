package com.devops.dxc.devops.rest;

import java.util.logging.Level;
import java.util.logging.Logger;
import com.devops.dxc.devops.model.Dxc;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(path = "/rest/msdxc")
@CrossOrigin("*")
public class RestData {
	
	private final static Logger LOGGER = Logger.getLogger("devops.subnivel.Control");

	@GetMapping(path = "/dxc", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Dxc> getData(@RequestParam("sueldo") String sueldo, @RequestParam("ahorro") String ahorro){
		
		LOGGER.log(Level.INFO, "< Trabajo DevOps - DXC > <Consultado Diez por ciento>");

		int iAhorro = 0;
		int iSueldo = 0;

		try{
			iAhorro = Integer.parseInt(ahorro);
		} catch (NumberFormatException nex){
			throw new ResponseStatusException(
					HttpStatus.BAD_REQUEST, "Parámetro Ahorro debe ser numérico");
		}

		try{
			iSueldo = Integer.parseInt(sueldo);
		} catch (NumberFormatException nex){
			throw new ResponseStatusException(
					HttpStatus.BAD_REQUEST, "Parámetro Sueldo debe ser numérico");
		}

		Dxc dxc = new Dxc(iAhorro, iSueldo);
		ResponseEntity<Dxc> response = new ResponseEntity<>(dxc, HttpStatus.OK);
		return response;
	}
}