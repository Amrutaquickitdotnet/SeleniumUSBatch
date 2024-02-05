package com.java;
//import com.visible.*;

public class Example_010_AssignmentOperator {

	public static void main(String[] args) {

		
		int x = 10;
		x += 3;
		
		x*= 3;
		x/=3;
		System.out.println("Addition"+x);
		
		int y= 4;
		y-= 3;
		System.out.println("Subtraction"+y);
	
		
		
		
		int p= 4;
		p*= 3;
		System.out.println("Multiplication"+p);
		
		
		int r= 4;
		r/= 3;		
		System.out.println("Division"+r);
		
		int u= 4;
		u%= 3;
		System.out.println("Modulus"+u);
		
		
		int f = 5;
		f&=3;
		System.out.println(f);
		
	}
	
}	
