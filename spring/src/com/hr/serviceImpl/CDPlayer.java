package com.hr.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.hr.service.CompactDisc;
import com.hr.service.MediaPlayer;

@Component
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;

	@Autowired
	public void CompactDisc(CompactDisc cd){
		this.cd = cd;
	}
	
	public void player() {
		cd.play();
	}

}
