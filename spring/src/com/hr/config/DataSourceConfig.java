package com.hr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hr.serviceImpl.DevConditional;

@Configuration
public class DataSourceConfig {
	@Bean
	@Profile(value="dev")
	@Conditional(DevConditional.class)
	public String DevDataSource(){
		return "dev";
	}
	@Bean
	@Profile(value="pro")
	public String ProDataSource(){
		return "pro";
	}
}
