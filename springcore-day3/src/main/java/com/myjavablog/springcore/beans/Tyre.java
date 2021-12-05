package com.myjavablog.springcore.beans;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	private String brand;

	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	
	
}
