package com.example;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerConfig {

	@Bean
	public DozerBeanMapper dozer() {
		return new DozerBeanMapper();
	}

}