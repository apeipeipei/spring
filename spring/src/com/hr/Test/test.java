package com.hr.Test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.hr.config.ApplicationContext;
import com.hr.service.CompactDisc;
import com.hr.service.MediaPlayer;
import com.hr.serviceImpl.GdOnlineImpl;
import com.hr.serviceImpl.SgtPeppers;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ApplicationContext.class)
public class test {
	@Autowired
	private GdOnlineImpl gd;
	@Autowired
	private SgtPeppers sp;
	@Autowired
	private CompactDisc cd;
	@Autowired
	private MediaPlayer mp;
	
	@Test
	public void run(){
		gd.createGd();
		sp.play();
	}
	
	@Test
	public void play(){
		mp.play(cd);
	}
}
