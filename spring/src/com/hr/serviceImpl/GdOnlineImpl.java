package com.hr.serviceImpl;

import org.springframework.stereotype.Component;

import com.hr.service.GdOnline;

@Component
public class GdOnlineImpl implements GdOnline {
	public void createGd() {
		System.out.println("新建一个在线工单...");
	}

}
