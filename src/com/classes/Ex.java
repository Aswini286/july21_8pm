package com.classes;

public class Ex {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.model = "Honda";
		c1.tyres=4;
		c1.display();
		
		Car c2=new Car();
		c2.model="BMW";
		c2.tyres=4;
		c2.display();
		
	}

}
class Car{
	int tyres;
	String model;
	
	public void display() {
		System.out.println(tyres + " "+ model);
	}
}
