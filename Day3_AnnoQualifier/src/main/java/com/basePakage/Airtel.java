package com.basePakage;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements Sim{

	@Override
	public String calling() {
		// TODO Auto-generated method stub
		return "Calling from Airtel";
	}

}
