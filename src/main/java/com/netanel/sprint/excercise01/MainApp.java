package com.netanel.sprint.excercise01;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainApp.class);
		
		MessageService ms = ctx.getBean(MessageService.class);
		for(int i = 0; i< 100;i++) {
			String message = ms.getMessage();
			System.out.println("message = " + message);
		}
	
		ctx.close();
	}

}
