package com.methods;

public class Instance_Method {

	public static void main(String[] args) {
		
		Instance_Method ex = new Instance_Method();
		
		System.out.println(ex.sub(5, 4));
		
		}
	public void greet() {
		System.out.println("Greeeting");
	}
	public int sub(int c, int d) {
		greet();
		return c-d;
	}

}
