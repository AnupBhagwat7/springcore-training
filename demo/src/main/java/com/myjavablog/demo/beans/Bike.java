/**
 * 
 */
package com.myjavablog.demo.beans;

import org.springframework.stereotype.Component;

/**
 * @author anupb
 *
 */
@Component
public class Bike implements Vehicle{
	
	public Bike() {
		super();
	}


	public void drive() {
		System.out.println("I am driving Bike");
	}

}
