package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.entity.Country;

@ComponentScan("com.entity")
public class ConfigClass {

	@Bean
	public Country conObj() {
		
		return new Country();
	}
}
