package com.java;
//import com.visible.*;

public class Example_014_MultiDimensionalArray {
// Array of arrays is called as multiDimensional Array
	
	
	// when you would like to save data in a tabular form like table with rows and columnns

	public static void main(String[] args) {
		
		
		
		int[][] mynumbers = {{1,2,3,4}, {5,6,7,8}}; // define arrays
		 System.out.print(mynumbers[0][0]);
		 
		 System.out.print(mynumbers[0][1]);
		 
		 System.out.print(mynumbers[0][2]);
		 
		 System.out.println(mynumbers[0][3]);
		 System.out.print(mynumbers[1][0]);
		 System.out.print(mynumbers[1][1]);
		 System.out.print(mynumbers[1][2]);
		 System.out.print(mynumbers[1][3]);
		 
		 mynumbers[1][2] = 9;
		 
		 System.out.println("Updated Lists ");
		 
		 System.out.println(mynumbers[1][2]);
		 
		 
	}
		
	}
	
	
	
	

