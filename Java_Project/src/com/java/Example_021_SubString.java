package com.java;
//import com.visible.*;

public class Example_021_SubString {

	
	// String manipulation 
	
	// The operation perform on string
	public static void main(String[] args) {
		
    String str = "It's February Very Hot and Cold Day";
    System.out.println(str.substring(12));// returning sequence of character
		//substring(int beginindex, int endindex)
    System.out.println(str.substring(0,3));// Start index position always be included but excluded inside endindexposition.
    System.out.println(str.substring(12,17));// Excluding lastindex position
}
}
	
	
	
	
