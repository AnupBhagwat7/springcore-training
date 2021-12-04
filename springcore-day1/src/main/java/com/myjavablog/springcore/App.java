package com.myjavablog.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myjavablog.springcore.beans.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        
        //Car car = new Car();
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    	Car car = (Car) context.getBean("car");
        
    	System.out.println(car.hashCode());
    	
    	Car car1 = (Car) context.getBean("car");
    	System.out.println(car1.hashCode());

    }
}
