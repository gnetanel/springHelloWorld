package com.netanel.sprint.excercise01;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
	CapitalizationService capitalizationService;
	
	final String s1 = "aaa";
	final String s2 = "bbb";
	final String s3 = "ccc";

	
	@Autowired
	void setCapitalizationService(CapitalizationService capitalizationService) {
		this.capitalizationService = capitalizationService;
	}
	
	public String getMessage() {
		
		Random random = new Random();
		
		int num = random.nextInt(3);
		String myStr = "XXX";
		switch(num) {
		case 0:
			myStr = s1;
			break;
		case 1:
			myStr = s2;
			break;
		case 2:
			myStr = s3;
			break;
		}
		
		return capitalizationService.toUpperCase(myStr);
	}
}
