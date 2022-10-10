package com.technoelevate.javabasics;

public class AccessSpecifierDemo {
	
	private static void Specifier() {
		System.out.println("this is PRIVATE ");
	}
	
	static void Specifier1() {
		System.out.println("this is PACKAGE level");
	}
	
	protected void Specifier2() {
		System.out.println("this is non-static PROTECTED ");
	}
	
	public static void Specifier3() {
		System.out.println("this is PUBLIC ");
	}
	
//	MAIN METHOD STARTS HERE
	
		public static void main(String[] args) {
			
			Specifier();//Private method call
			
			Specifier1();// default method call
			
	AccessSpecifierDemo as = new AccessSpecifierDemo();
	
			as.Specifier2();//Protected method call
			
			Specifier3();//Public method call
		
	}

}

class SamePackage{
	public static void main(String[] args) {
		
//		AccessSpecifierDemo.Specifier(); PRIVATE METHOD CAN't access in same package
		
		AccessSpecifierDemo.Specifier1();//default method
		
		AccessSpecifierDemo as = new AccessSpecifierDemo();
		as.Specifier2();
		
		AccessSpecifierDemo.Specifier3(); //public method
	}
	
	
}
