package com.Inheritance;

public class Single_Level_Inheritance {

	public static void main(String[] args) {
		animal obj1 = new animal();
		dog obj2 = new dog();
		obj1.breed="sheperd";
		obj1.display();
		obj2.color = "brown";
		obj2.show();
		obj2.display();
		
		
		

	}

}
 class animal{
	 int legs = 4;
	 String breed = "";
	 public void display() {
		System.out.println("The animal has" +"leg and breed is:" +breed); 
	 }
 }
 
 class dog extends animal{
	 String color = " ";
	 
	 public void show() {
		 System.out.println(legs + " " + color);
	 }
 
 public void display() {
	 System.out.println("I am from different child class");
 }
 }