package com.onetracker.springboot.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetracker.springboot.vo.VOUser;

@RestController
@RequestMapping(path = "/servicesREST/JR")
public class RestUser {

	@RequestMapping(
			method = RequestMethod.POST, 
			path = "/validateUser", 
			consumes = "application/json", 
			produces = "application/json")
	
	public @ResponseBody VOUser validateUser(@RequestBody VOUser user) throws Exception {
		
		
		
		
		VOUser response = new VOUser();
		response.setFind(false);
		
		String lat = user.getlat();
		String lon = user.getlon();
		String speed = user.getspeed();
		String time = user.gettime();
		String http = user.gethttp();
		String pwr = user.getpwr();
		String door = user.getdoor();
		String acc = user.getacc();
		
		System.out.println("latitud: " + lat);
		System.out.println("longitud: " + lon);
		System.out.println("speed: " + speed);
		System.out.println("Hora: " + time);
		System.out.println("http: " + http);
		System.out.println("Power: " + pwr);
		System.out.println("Puerta: " + door);
		System.out.println("Energia: " + acc);
		
		try {
			if (user.getlat().equals(lat) 
					&& user.getlon().equals(lon)
					&& user.getspeed().equals(speed)
					&& user.gettime().equals(time)
					&& user.gethttp().equals(http)
					&& user.getpwr().equals(pwr)
					&& user.getdoor().equals(door)
					&& user.getacc().equals(acc)
					) {
				response.setlat(lat);
				response.setlon(lon);
				response.setspeed(speed);
				response.settime(time);
				response.sethttp(http);
				response.setpwr(pwr);
				response.setdoor(door);
				response.setacc(acc);
				response.setFind(true);
			}
			return response;
		} catch (Exception ex) {

			return response;
		}
	}
}