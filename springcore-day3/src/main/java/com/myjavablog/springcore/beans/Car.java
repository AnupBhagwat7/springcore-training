/**
 * 
 */
package com.myjavablog.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author anupb
 *
 */
@Component
public class Car {

	
	private int tyres;

	@Autowired
	private Tyre tyre;
	
	public Car() {
		super();
	}

	public Car(int tyres) {
		super();
		this.tyres = tyres;
	}

	@Override
	public String toString() {
		return "Car [tyre=" + tyre + "]";
	}
	
}
