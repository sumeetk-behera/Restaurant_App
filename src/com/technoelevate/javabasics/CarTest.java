package com.technoelevate.javabasics;

import java.util.Scanner;

public class CarTest {

	public static Car getcar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your carName");
		String s = scanner.next();
		if (s.equalsIgnoreCase("audi"))
			return new Audi();

		else if (s.equalsIgnoreCase("bmw")) {
			return new Bmw();
		}

		return null;
	}
	public void drive(Car ca) {
		ca.acc();
		ca.brake();
		ca.gear();
		
	}
}
