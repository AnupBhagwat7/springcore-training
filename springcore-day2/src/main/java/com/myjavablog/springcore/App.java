package com.myjavablog.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myjavablog.springcore.beans.Bike;
import com.myjavablog.springcore.beans.Car;
import com.myjavablog.springcore.beans.Tyre;
import com.myjavablog.springcore.beans.Vehicle;

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
    	Vehicle v;
    	v = (Car) context.getBean("car");
        System.out.println(v);
        
    	//v = (Bike) context.getBean("bike");
    	//System.out.println(v);
    	
    	//System.out.println(car);
    	//System.out.println(bike);

    	//Tyre t = (Tyre) context.getBean("tyre");
    	//System.out.println(t);
    	
    }
}
