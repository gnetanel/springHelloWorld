package com.netanel.sprint.excercise01;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class OtherPerson {
	public OtherPerson() {
		System.out.println("Construcore of OtherPerson");
	}
	
	public void foo() {
		System.out.println("OtherPerson foo");

	}
}
