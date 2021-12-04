package com.myjavablog.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myjavablog.demo.beans.Bike;
import com.myjavablog.demo.beans.Car;
import com.myjavablog.demo.beans.Tyre;
import com.myjavablog.demo.beans.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Car car = new Car("Red");
    	//car.drive();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    	
    	Vehicle car1 = (Vehicle) context.getBean("car");
    	car1.drive();

    	Tyre tyre = (Tyre) context.getBean("tyre");
    	System.out.println(tyre.hashCode());

    	Tyre tyre1 = (Tyre) context.getBean("tyre");
    	System.out.println(tyre1.hashCode());
    	
    	//ApplicationContext context1 = new AnnotationConfigApplicationContext(Config.class);
    	//Vehicle bike = (Bike) context1.getBean("bike");
    	
    	//bike.drive();    	
    	
    }
    
    
}
