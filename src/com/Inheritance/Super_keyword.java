package com.Inheritance;

public class Super_keyword {

	public static void main(String[] args) {
			Vehicless v = new Vehicless();
//		v.display();

		System.out.println("creating car with no-arg cons");
		Car c = new Car();
		
		System.out.println("\ncreating car with parameterised cons");
		Car c1 = new Car("green", 4);
		
		
	}

}

class Vehicless{
	int tyres = 2;
	
	Vehicless(){
		System.out.println("i am vehicle class");
	}
	
	Vehicless(int tyres){
		System.out.println("i am vehicle class  anf number of tyres " + tyres);
	}
	
//	public void display() {
//		System.out.println("the number of tyres " + tyres);
//	}
}

class Car extends Vehicless{
	
	String colour ;
	//int tyres = 4;
	
	Car(){
		super();
		System.out.println("i am from child class");
	}
	
	Car(String colour, int tyres){
		super(tyres);
		System.out.println("child para const colour " + colour + " " + tyres);
	}
	
//	public void show() {
//		System.out.println("Child class");
//		System.out.println("The colour of the car is " + colour);
//		//System.out.println("the value of tyre from child class " + this.tyres);
//		System.out.println("the value of tyre from parent class " + super.tyres);
//		
//		super.display();
//	}
	
}


	
	

