package com.technoelevate.javabasics;

public class Audi implements Car {

	@Override
	public void brake() {
      System.out.println("Audi Brake");
	}

	@Override
	public void acc() {
	  System.out.println("Audi Acc");	
	}

	@Override
	public void gear() {
 	System.out.println("Audi Gear");
	}
}