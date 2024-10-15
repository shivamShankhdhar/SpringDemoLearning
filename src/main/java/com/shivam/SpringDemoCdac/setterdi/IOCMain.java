package com.shivam.SpringDemoCdac.setterdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/shivam/SpringDemoCdac/setterdi/config.xml");
		
		Student stu = (Student)context.getBean("student");
		System.out.println(stu);
		
		Student stu2 = (Student)context.getBean("student2");
		System.out.println(stu2);
		
		Student stu3 = (Student)context.getBean("student3");
		System.out.println(stu3);

	}

}
