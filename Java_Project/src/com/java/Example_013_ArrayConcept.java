package com.java;
//import com.visible.*;

public class Example_013_ArrayConcept {

	public static void main(String[] args) {
// Represent Array 
		
		
		int[] numbers = {12,13,14,15};
		
		
		//Access the Element of array 
		
		
		System.out.println(numbers[0]);
		
		System.out.println(numbers[1]);
		
		System.out.println(numbers[2]);
		
		System.out.println(numbers[3]);
		
	//	System.out.println(numbers[4]);// ArrayIndexOutOfBound Exception
	// 10 per page 
		
		// Total Records => 21   => 2 => 1 PAge 3 is Out of Bound Exception.
		
		// Declare an Array 
		String[] cars = {"Volvo", "BMW", "Ford", "Mercedez"};
		
//		String[] cars = null ;
//		cars[0]= "Volvo";
//		cars[1]= "BMW";
//		
//		cars[2]= "Ford";
//		cars[3]= "Mercedez";
				
		//simple for
		// first statement => initialization Process 0 
		//Second Statement => Condition 
		// Third Statemnet => increment/Decrement 
		
		for(int i=0;i<cars.length; i++) {
			
			System.out.println(cars[i]);
		}
		// For Each loop 
		
//		
//		for(type variable:arrayname) {
//			
//		}
		
		System.out.println("*************");
		for(String carlist :cars) {
			
			
			System.out.println(carlist);
		}
		
		
		
	}
	
	
	
	
}
