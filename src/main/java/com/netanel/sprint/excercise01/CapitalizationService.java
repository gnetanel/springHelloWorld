package com.netanel.sprint.excercise01;

import org.springframework.stereotype.Component;

@Component
public class CapitalizationService {
	String toUpperCase(String input) {
		return input.toUpperCase();
	}
}
