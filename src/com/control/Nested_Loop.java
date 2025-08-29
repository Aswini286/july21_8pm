package com.control;


		//for (int row = 1; row<4; row++) 
			//for (int col=1; col<=3; col++) {{
			//System.out.println(col);
		
			//System.out.println(row+""+col);
		//int n = 5;
		//for (int i=1; i<=n; i++) {
		//	for (int j=1; j<=i; j++) {
			//	System.out.print("*");
			//}
			//System.out.println();
		
	//int n=5;
	//for(int i=n; i>=1; i--) {
	//for(int j = 0; j<i; j++) {
		//System.out.print("*");
	//}
	//System.out.println();
	//}
//}
//}
import java.util.Scanner;

public class Nested_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double BASE_PRICE = 72.0;

        System.out.print("Enter number of passengers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nPassenger " + i + ":");

            System.out.print("Enter Gender (M/F): ");
            char gender = sc.next().toUpperCase().charAt(0);

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            double discount = 0.0;

            if (gender == 'M') {   // For Men
                if (age >= 50) {
                    discount = 0.05;  // 5%
                } else if (age >= 15 && age <= 30) {
                    discount = 0.025; // 2.5%
                } else {
                    discount = 0.06;  // 6%
                }
            } else if (gender == 'F') {   // For Women
                if (age >= 50) {
                    discount = 0.066; // 6.6%
                } else if (age >= 30 && age < 50) {
                    discount = 0.04;  // 4%
                } else if (age >= 15 && age <= 30) {
                    discount = 0.035; // 3.5%
                } else {
                    discount = 0.065; // 6.5%
                }
            } else {
                System.out.println("Invalid gender input!");
                continue; // skip this passenger
            }

            double finalPrice = BASE_PRICE - (BASE_PRICE * discount);

            System.out.println("Base Ticket Price: Rs. " + BASE_PRICE);
            System.out.println("Discount Applied: " + (discount * 100) + "%");
            System.out.println("Final Ticket Price: Rs. " + String.format("%.2f", finalPrice));
        }

        sc.close();
    }
}