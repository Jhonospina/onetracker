package com.onetracker.springboot.service;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetracker.springboot.vo.VOUser;

@RestController
@RequestMapping(path = "/api")
public class RestUser {
	
	private static final Logger LOGGER = Logger.getLogger(RestUser.class.getName());

	@RequestMapping(
			method = RequestMethod.POST, 
			path = "/track", 
			consumes = "application/json", 
			produces = "application/json")
	
	public @ResponseBody String validateUser(@RequestBody Object temp) throws Exception {
		String cadena = (String) temp;
		LOGGER.info("peticion hecha: "+cadena);
		return "OK";
	}
}