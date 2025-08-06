package com.basePakage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
		User u=context.getBean(User.class);
		System.out.println(u.getSim1().calling());
		System.out.println(u.getSim2().calling());
	}
}
