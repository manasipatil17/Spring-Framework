package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageAspects {

	@Before("execution( public void myRecharge())")
	public void beforeRecharge() {
		System.out.println("Your recharge expiring soon plz recharge...");
	}
	
	@After("execution (* com.entity.Recharge.*(..))")
	public void afterRecharge(){
		System.out.println("Recharge successfully... Enjoy your data pack");
	}
	
	@Around("execution (* com.entity.Recharge.*(..))")
	public void aroundMsg(ProceedingJoinPoint p) {
		System.out.println("Your recharge expiring soon plz recharge...");
		
		try {
			p.proceed();
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("Recharge successfully... Enjoy your data pack");

	}
}
