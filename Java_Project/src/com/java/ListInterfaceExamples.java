package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterfaceExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //List interface 
		
		//how to declare List interface
		
		// table contains data => more than 1  WebElement 
		// you can implement ArrayList by either List interface or by using ArrayList class
		
		
		List<String> names = new ArrayList<String>();
		
		
		ArrayList<String>names1 = new ArrayList<String>();
		
		// creating arrayList
		
		//add element in arrayList
		
		names.add("Rajkumar");//0
		names.add("Vamsi");//1
		names.add("Naman");//2
		names.add("Dhara");//3
		names.add("Preeti");//4
		names.add("Rajkumar");//5
		names.add(null);
		names.add("");
		names.add("Vamsi");
		
		
		System.out.println("Adding data in name1");
		
		
		names1.add("Rajkumar");//0
		names1.add("Vamsi");//1
		names1.add("Naman");//2
		
		// traversing list 
		
	Iterator  itr    =	names.iterator();
	
	
	while(itr.hasNext()) {
		
		System.out.println(itr.next());
	}
	System.out.println("**************");
	
Iterator  itr1    =	names1.iterator();
	
	
	while(itr1.hasNext()) {
		
		System.out.println(itr1.next());
	}
	}

}
