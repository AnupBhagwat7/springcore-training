/**
 * 
 */
package com.myjavablog.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author anupb
 *
 */
public class Car implements Vehicle{

	@Autowired
	private Tyre tyre;
	
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("I am driving car");
	}

	@Override
	public String toString() {
		return "I am in Car with tyre: "+ this.tyre;
	}
	
	
}
