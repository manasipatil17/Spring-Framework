package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfig;
import com.entity.Recharge;

public class MainClass {
public static void main(String[] args) {
	
	ApplicationContext context= new AnnotationConfigApplicationContext(MyConfig.class);
	Recharge r= context.getBean(Recharge.class);
	
	r.myRecharge();
}
}
