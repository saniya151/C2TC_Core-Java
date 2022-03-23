package com.tns.library.day11;

//Program to compare between two Strings
public class Method3 {

	public static void main(String[] args) {
		
		//Creating three Strings
		String A = "Windows is my OS";
		String B = "Linux is my OS";
		String C = "Windows is my OS";
		 
		//Comparing strings A and B
		boolean result1 = A.equals(B);
		System.out.println("Strings A and B are equal:" +" "+ result1);
		
		//Comparing strings B and C
		boolean result2 = A.equals(C);
		System.out.println("Strings A and C are equal:" +" "+ result2);
	}

}
