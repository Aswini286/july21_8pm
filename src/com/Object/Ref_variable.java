package com.Object;

public class Ref_variable {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.year = 2022;
		c1.colour = "Black";
		
		c1.display();

	}

}
class Car{

String colour;
int year;

public void display() {
	System.out.println(colour + " " + year);
}
}

