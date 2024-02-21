package com.java;
//import com.visible.*;

public class Example_019_StringManipulation2 {

	
	// String manipulation 
	
	// The operation perform on string
	public static void main(String[] args) {
		String str1 = "HeLL5lo";//hello
		String str2 ="hEllo";//hello  hello
		String str3 =str1.toLowerCase();
	String str4 =	str2.toLowerCase().trim();
	
	int i = str3.compareTo(str4);//0 for both are equal
	
	if(i==0) {
		
		System.out.println("Both Strings are equal");
	}else {
		
		System.out.println("Both Strings are not equal");
	}
		
	}
	}
	
	
	
	
