/**
 * 
 */
package com.myjavablog.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.myjavablog.springcore.beans.Car;
import com.myjavablog.springcore.beans.Tyre;

/**
 * @author anupb
 *
 */
@Configuration
public class AppConfig {

	@Bean(name="car")
	public Car getCar() {
		Car car= new Car(4);
		return car;
	}
	
	@Bean(name="tyre")
	public Tyre getTyre() {
		Tyre t = new Tyre("CEAT");
		return t;
	}
	
	@Primary
	@Bean
	public Tyre getTyre1() {
		Tyre t = new Tyre("MRF");
		return t;
	}
	
}
