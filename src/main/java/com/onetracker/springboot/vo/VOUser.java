package com.onetracker.springboot.vo;

//Código de la clase “VOUser.java” que esta en el paquete "com.javarevolutions.springboot.vo"

import java.io.Serializable;

public class VOUser implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 3560972546182458142L;
	private String lat;
	private String lon;
	private String speed;
	private String time;
	private String http;
	private String pwr;
	private String door;
	private String acc;
	private boolean find;

	public String getlat() {
		return lat;
	}

	public void setlat(String lat) {
		this.lat = lat;
	}

	public String getlon() {
		return lon;
	}

	public void setlon(String lon) {
		this.lon = lon;
	}
	
	public String getspeed() {
		return speed;
	}

	public void setspeed(String speed) {
		this.speed = speed;
	}
	
	public String gettime() {
		return time;
	}

	public void settime(String time) {
		this.time = time;
	}
	
	public String gethttp() {
		return http;
	}

	public void sethttp(String http) {
		this.http = http;
	}
	
	public String getpwr() {
		return pwr;
	}

	public void setpwr(String pwr) {
		this.pwr = pwr;
	}
	
	
	public String getdoor() {
		return door;
	}

	public void setdoor(String door) {
		this.door = door;
	}
	
	public String getacc() {
		return acc;
	}

	public void setacc(String acc) {
		this.acc = acc;
	}



	public boolean isFind() {
		return find;
	}

	public void setFind(boolean find) {
		this.find = find;
	}
}
