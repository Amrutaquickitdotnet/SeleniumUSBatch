package com.java;
//import com.visible.*;

public class Example_020_StringConcate {

	
	// String manipulation 
	
	// The operation perform on string
	public static void main(String[] args) {
		String str1 ="Hello";
		String str2 ="Rajkumar";
		
		System.out.println("Combine 2 string "+ str1.concat(str2));
		
		String num1 = "11";
		String num2 ="12";
		
		String result = num1+num2;//1112
		System.out.println(result);
		
		// need conversion from string to number 
		
	int a =	Integer.parseInt(num1);
	
    int b =	Integer.parseInt(num2);
    
    
    int resul = a+b;
    System.out.println(resul);
		//  get the length of string and printing it character by character in reverse order
    
    String str5 = "Hello Rajkumar";
    
    //0 1 2 3 4
    
    System.out.println("The 4 th index position of Str5 is "+ str5.charAt(4));// CharAt() always accept number as index position but returning me the value as form of "String"
    
    System.out.println("The length of String is "+str5.length());
    
    System.out.println("Actual String is"+str5);
    
    System.out.println("String Reverse pattern");
    
    for(int i= str5.length()-1; i>=0; i--) 
    
    {
    	System.out.println(str5.charAt(i));
    	
    	
    }
    
		
}
}
	
	
	
	
