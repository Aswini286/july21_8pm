package com.classes;

public class NoArg_Constructor {

	public static void main(String[] args) {
		Books b1 = new Books();
				b1.show();
				
				Books b2 = new Books();
				b2.name = "Java";
				b2.price = 520.50;
				b2.show();
		

	}

}
 class Books{
	 String name;
	 double price;
	 
	 Books(){
		 name = "unknown";
		
	 }
	 
	 public void show() {
		 System.out.println("The name of book" + name+ "THe price is" + price);
	 }
 }