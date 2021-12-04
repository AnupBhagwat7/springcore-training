/**
 * 
 */
package com.myjavablog.springcore.beans;

/**
 * @author anupb
 *
 */
public class Car {

	
	private int tyres;

	
	public Car() {
		super();
	}

	public Car(int tyres) {
		super();
		this.tyres = tyres;
	}

	@Override
	public String toString() {
		return "Car [tyres=" + tyres + "]";
	}
	
}
