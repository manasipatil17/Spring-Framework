package com.basePakage;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements Sim{

	@Override
	public String calling() {
		// TODO Auto-generated method stub
		return "Calling from Jio";
	}

}
