package com.zeib.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zeib.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Student stdId() {
		Student std=new Student();
		std.setName("Zeib");
		std.setId(1);
		std.setEmail("zeibshaikh16@gmail.com");
		return std;
	}
}
