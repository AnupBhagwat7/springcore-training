/**
 * 
 */
package com.myjavablog.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author anupb
 *
 */
@Component
public class Car implements Vehicle{
	
	@Autowired
	private Tyre tyre;
	
	
	public Car() {
		super();
	}

	public void drive() {
		System.out.println("I am driving car with tyre of :"+tyre);
	}

}
