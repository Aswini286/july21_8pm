package com.control;

public class Switch_Ex {

	public static void main(String[] args) {
		int days =  15;
		switch(days) {
		case 1 :
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tuesday");
			break;
		case 3 :
			System.out.println("Wednesday");
			break;
		case 4 :
			System.out.println("Thursday");
			break;
		case 5 :
			System.out.println("Friday");
			break;
		case 6 :
			System.out.println("Saturday");
			break;
		case 7,10,15 :
			System.out.println("Sunday");
			break;
			default:
				System.out.println("Please enter valid data");
			
		}

	}

}
