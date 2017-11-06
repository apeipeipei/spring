package com.hr.serviceImpl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hr.service.CompactDisc;

@Component
public class SgtPeppers implements CompactDisc {
	private String title = "五环之歌";
	private String artist = "岳云鹏";
	public void play() {
		System.out.println(artist + "演唱" + title);
	}
}
