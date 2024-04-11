package com.java;

public class Exception_Handling_Part1 {

	public static void main(String[] args) throws Exception {
		try {
			int a = 10;
			int b = 12;

			
			String s = "abc";
			int i=	Integer.parseInt(s);//Number format exception
			System.out.println(i);
		
			int result = a + b;
			System.out.println(result);

			int[] numbers = new int[3];

			System.out.println(numbers[4]);// i did logical mistake execution will stop
			// my code must execute at the the time of compilation
			
		
		

	}catch (Exception e) {
		e.printStackTrace();
	}

}
}
