package com.typecasting;

public class Typecasting {

	public static void main(String[] args) {
		System.out.println("Implicit Type Casting");
		
		char x='K';
		System.out.println("Value of a: "+x);
		
		int b=x;
		System.out.println("Value of b: "+b);
		
		float c=x;
		System.out.println("Value of c: "+c);
		
		long d=x;
		System.out.println("Value of d: "+d);
		
		double e=x;
		System.out.println("Value of e: "+e);
		
		
		System.out.println("Explicit Type Casting");
		
		double z=77.8;
		int y=(int)x;
		System.out.println("Value of x: "+z);
		System.out.println("Value of y: "+y);


	}

}
