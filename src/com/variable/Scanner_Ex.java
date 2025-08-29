package com.variable;

import java.util.Scanner;

public class Scanner_Ex {

	public static void main(String[] args) {
		// object name is Scan 
       // Scanner Scan = new Scanner(System.in);
       
        // int is a data type asingn the numbers for num1 and num2
       // int num1 = Scan.nextInt();
        
       // System.out.println("Enter the number 2");
        //int num2 = Scan.nextInt();
       // System.out.println(num1 + num2 );
        // mandatory to call object name Scan.close
        // Scan.close(); 
         
         
         // for string (there are 2 types of line next(); and nextLine();     
         
         Scanner s = new Scanner(System.in);
         System.out.println("Enter the name"); 
     
        String name = s.nextLine();
         System.out.println(name);
        
         String names = s.next();
         System.out.println(names);
         s.close();
         
         
         
         
         
         
         
         
         
         
         
        
        
        
        		
      
        
         
	}

}
