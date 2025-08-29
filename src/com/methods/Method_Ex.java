package com.methods;

public class Method_Ex {

	public static void main(String[] args) {
		System.out.println("hi"); // for int change all double into int eg: 2,4 not in . value
		double c = add(4.5,2.6);
		System.out.println(c);
		
		System.out.println(add(1,5));

	}
	public static double add(double a , double b) {
		return a+b;
	}
public static void print() {
	System.out.println("printed");
}
public void display() {
	System.out.println("displaying");
}
}

