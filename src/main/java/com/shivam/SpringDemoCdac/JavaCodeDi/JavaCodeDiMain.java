package com.shivam.SpringDemoCdac.JavaCodeDi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaCodeDiMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DriverConfig.class);
		
		Driver d = (Driver) context.getBean("emp1");
		System.out.println(d);
		
	}

}
