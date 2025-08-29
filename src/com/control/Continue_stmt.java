package com.control;

public class Continue_stmt {

	public static void main(String[] args) {
		//for(int i = 2; i <=0;i++) {
		//	if(i ==4) {
			//	continue;
			//}
			//System.out.println(i);
		//}
	outerloop: for(int row = 1; row<=5; row++) {
		
		innerloop: for(int col = 1 ; col <=5 ; col++) {

		if(row == 3 && col ==2) {
			continue innerloop;
		}
		System.out.println(row + " " + col);
	}
		
	}
	}
}


	


