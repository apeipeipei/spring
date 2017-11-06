package com.hr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hr.service.CompactDisc;
import com.hr.serviceImpl.CDPlayer;
import com.hr.serviceImpl.JayZhou;
import com.hr.serviceImpl.SgtPeppers;
import com.hr.serviceImpl.XueZhiQian;

@Configuration
//去除组件扫描注解来玩玩显示javaConfig的显式配置
//@ComponentScan(basePackages="com.hr")
public class ApplicationContext {
	
	@Bean
	public CompactDisc sgCompactDisc(){
		double random = Math.random();
		int choice = (int) Math.floor(random*4);
		if(choice == 1){
			return new JayZhou();
		}else if(choice == 2){
			return new XueZhiQian();
		}else{
			return new SgtPeppers();
		}
	}
	@Bean
	public CDPlayer cDPlayer(CompactDisc cd){
		return new CDPlayer();
	}
}
