package com.java;
//import com.visible.*;

public class Example_015_MultiDimensionalArray {
// Array of arrays is called as multiDimensional Array
	
	
	// when you would like to save data in a tabular form like table with rows and columnns

	public static void main(String[] args) {
		
		// nested loop i ,j
		
		//the outer loop will going to change the sequence depending on inner loop
		
		int[][] mynumbers = {{1,2,3,4}, {5,6,7,8}}; // define arrays
		
		//Properties belong to array is length ,but in collection to access the size of array then i can use length as method
		
		//Outer Loop represent rows always
		for(int i=0; i<mynumbers.length; i++)
		{
			// inner loop represent columns
			for(int j =0; j<mynumbers[i].length; j++) {
				
				System.out.println(mynumbers[i][j]);
			}
			
		}
		 
		 
		 
	}
		
	}
	
	
	
	

