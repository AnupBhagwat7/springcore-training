/**
 * 
 */
package com.myjavablog.springcore.beans;

/**
 * @author anupb
 *
 */
public class Bike implements Vehicle {

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("I am driving my bike");
	}

	@Override
	public String toString() {
		return "I am in Bike";
	}

	
	
}
