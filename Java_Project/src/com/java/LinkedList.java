package com.java;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//linked list doubly linked Link
		
		
		// There are 2 ways 
		// By declaring an Object of LinkedList/ ArrayList 
		// By declaring interface
		// if the java version is above 1.7 it will show LinkedList
		//LinkedList<Integer>in = new LinkedList<>();
		
		java.util.LinkedList<Integer>list = new java.util.LinkedList<>();
		list.add(10);//0
		list.add(20);//1
		list.add(10);//2
		list.add(30);//3
		//add element
		
		list.addFirst(100);
		
		for(int ll:list) {
			System.out.println(ll);
			
			
		}
		
//		list.addLast(5);
//		//remove the first element
//		System.out.println(list);
//		System.out.println(list.removeFirst());
//		System.out.println(list);
//		System.out.println(list.removeLast());
//		System.out.println(list);
		
	}

}
