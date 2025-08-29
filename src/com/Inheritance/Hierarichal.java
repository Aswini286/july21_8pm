package com.Inheritance;

public class Hierarichal {

	public static void main(String[] args) {
		Parents p = new Parents();
		p.name = "Father";
		p.display();
		
		Son s1 = new Son();
		s1.name = "Son";
		s1.disply();
		
		
		Daughter d = new Daughter();
		d.name = "Daughhter";
		d.show();
		

	}

}

class Parents
{
	 String name;
	 int age =40;
	 
	public void display() {
		
		System.out.println("The name of the parent is " + name + " " + age);
	}
	 
}

class Son extends Parents{
	
	char gender ='M';
	
	public void disply() {
		System.out.println("the name of the son is " + name + " " + gender);
		
	}
}

class Daughter extends Parents{
	
	char gender = 'F';
	String  degree = "BFSc";
	
	public void show() {
		System.out.println("the name of the daughter is " + name + " " + degree + " " + gender);
	}
}