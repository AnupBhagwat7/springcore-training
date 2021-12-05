package com.myjavablog.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Car car = (Car) context.getBean("car");
        
    	System.out.println(car);
   
    }
}
