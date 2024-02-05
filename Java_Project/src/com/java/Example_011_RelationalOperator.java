package com.java;
//import com.visible.*;

public class Example_011_RelationalOperator {

	public static void main(String[] args) {

		
		int x =5, y =5, z=9;
		System.out.println("Demo for &&");
		if((x>y)&&(x++>z)) //(5>5)&&(6>9)    F&&F F => F
			// x = x+1 = 6>9
			//F&&F => F
		;
		
		else {
			System.out.println("value of x"+x);	
		
	if((x>y)& (x++>z));//5>7 F & T = (x= x+1)= x++
	else
		System.out.println("The value of x "+x );
	System.out.println("value of x"+x);	
}	
	}
}
