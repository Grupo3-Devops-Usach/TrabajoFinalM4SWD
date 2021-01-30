package com.devops.dxc.devops.rest;

import java.util.logging.Level;
import java.util.logging.Logger;
import com.devops.dxc.devops.model.Dxc;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;

@RestController
@RequestMapping(path = "/rest/msdxc")
@CrossOrigin("*")
@Validated
public class RestData {
	
	private final static Logger LOGGER = Logger.getLogger("devops.subnivel.Control");

	@GetMapping(path = "/dxc", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Dxc getData(@RequestParam("sueldo") @NotEmpty(message = "Sueldo es requerido") String sueldo,
									 @RequestParam("ahorro") @NotEmpty(message = "Ahorro es requerido") String ahorro){
		
		LOGGER.log(Level.INFO, "< Trabajo DevOps - DXC > <Consultado Diez por ciento>");
		
        Dxc response = new Dxc(Integer.parseInt(ahorro), Integer.parseInt(sueldo));
		return response;
	}
}