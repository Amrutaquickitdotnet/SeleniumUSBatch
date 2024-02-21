package com.java;
//import com.visible.*;

public class Example_018_StringManipulation {

	
	// String manipulation 
	
	// The operation perform on string
	public static void main(String[] args) {
		String s = "preeti"; // String literal
		String s1 = "PREeti";
		
		String s2 = new String("preeti");
		
		String s3 = "preeti";
		
		String s4 = "P";//pQR 0 1  2
		
		String s5 = "R";
		
		System.out.println("String in upper Case"+":"+s.toUpperCase());// Converting my String case into upper level
		System.out.println("String in Lower Case"+":"+s1.toLowerCase());
		//compare String in 3 ways 
		//1 by using equals(), equalsIgnoreCase()
		//2 By Using == Operator
//		3. By compareTo()
		System.out.println("Comparison with using equals()"+":"+ s.equals(s1));// false
		System.out.println("Comparison with using equals()"+":"+ s.equalsIgnoreCase(s1));// true
		
		
		System.out.println("************By Using == Operator************");
		
		System.out.println(s==s2);
		
		System.out.println(s==s3);
		
		
		System.out.println("************ By compareTo()************");
		
		System.out.println(s.length());
		System.out.println(s.compareTo(s3));//0
		System.out.println(s.compareTo(s1));  //"preeti= PREeti"// 32 characters ofASCII code
		System.out.println(s3.compareTo(s4));//false
		System.out.println(s5.compareTo(s4));
		
	}
	}
	
	
	
	
