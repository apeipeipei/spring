package com.hr.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.hr.service.CompactDisc;
import com.hr.service.MediaPlayer;

@Component
public class CDPlayer implements MediaPlayer {

	@Autowired
	private CompactDisc cd;

	@Autowired
	public CDPlayer(CompactDisc cd){
		this.cd = cd;
	}
	
	public void play(CompactDisc cd) {
		cd.play();
	}

}
