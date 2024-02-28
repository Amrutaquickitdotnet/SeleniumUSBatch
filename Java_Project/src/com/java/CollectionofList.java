package com.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionofList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating an empty linkedList

		LinkedList<String> list = new LinkedList<>();
		list.add("Selenium");
		list.add("Cypress");
		list.add("Playwright");
		list.add("API");

		Collection<String> collect = new LinkedList<>();
		collect.add("Java");
		collect.add("Python");
		collect.add("C");
		collect.add("Hibernate");
		
		list.addAll(collect);
		
		
		System.out.println("The new Linked List"+ list);
		
	}

}
