package com.zeib.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zeib.beans.Student;

public class Main {
	public static void main(String[] args) {
		String config_loc="/com/zeib/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);
		
		Student std=(Student)context.getBean("stdId");
		std.display();
	}

}
