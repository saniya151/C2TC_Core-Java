package com.tns.library.day11;

//Program to join two Strings using concat() method
public class Method2 {

	public static void main(String[] args) {
		
		 //Creating 1st String
		String A = "TNS";
		System.out.println("First String:"+ A);
		
		//Creating 2nd String
		String B = "Program";
		System.out.println("Second String:"+ B);
		
		//Joining two Strings using concat() method
		String joined = A.concat(B);
		System.out.println("Joined String:"+ joined);

	}

}
