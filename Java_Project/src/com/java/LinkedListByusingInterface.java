package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListByusingInterface {

	public static void main(String[] args) {
	
		List<String> names = new LinkedList<>();
		
		names.add("Raj");//0
		names.add("Vamsi");//1
		names.add("Naman");//2
		names.add("Amruta");//3
		
		System.out.println(names);
		
		names.add(2, "Pravin");
		
		System.out.println("Added name on index position"+ names);
		names.addFirst("Dhara");
		System.out.println("After adding the name on 1st position "+ names);
		
		names.addLast("Preeti");
		
		System.out.println("After adding the name on last position "+ names);
		
		
		
		
		
	}

}
