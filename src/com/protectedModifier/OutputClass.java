package com.protectedModifier;

import com.methods.Protected_Child;

public class OutputClass {

	 public static void main(String[] args) {
		Animal a = new Animal();
		a.animal();
		
		// different package
		Protected_Child pc = new Protected_Child();
		System.out.println(pc.type = "Black cat");
		pc.animal();
		pc.Differentcat();

	}

}
