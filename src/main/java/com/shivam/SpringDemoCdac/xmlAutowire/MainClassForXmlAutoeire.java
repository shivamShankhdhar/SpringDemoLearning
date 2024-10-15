package com.shivam.SpringDemoCdac.xmlAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassForXmlAutoeire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/shivam/SpringDemoCdac/xmlAutowire/config.xml"
				);
		
		Course c = (Course)context.getBean("course1");
		System.out.println(c);
	}

}
