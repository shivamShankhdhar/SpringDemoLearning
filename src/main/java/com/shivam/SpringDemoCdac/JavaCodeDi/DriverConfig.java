package com.shivam.SpringDemoCdac.JavaCodeDi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DriverConfig {

	@Bean("emp1")
	public Driver getDriver() {
		Driver driver = new Driver();
		driver.setName("shivam");
		driver.setUsername("shivam1214@");
		driver.setPassword("Shraddha1214@");
		return driver;				
	}
	
}
