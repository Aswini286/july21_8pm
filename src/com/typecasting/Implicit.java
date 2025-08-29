package com.typecasting;

public class Implicit {

	public static void main(String[] args) {
		
		byte c = 53;
		System.out.println(c);
		
		int i = c;
		System.out.println(i);
		
		double d = i;
		System.out.println(d);
		
		byte b = 70;
		char s = (char) b;
		System.out.println(s);

	}

}
