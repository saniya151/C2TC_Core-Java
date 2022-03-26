package com.tns.library.day13;

//Program to demonstrate an interaction between Actor & Use cases

import java.util.Scanner;

public class UMLDemo2{
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String s;
		int age;
		
		System.out.print("Hello Sir/Mam , Please mention your name: "); //Use cases
		s = in.nextLine(); //Actor
		
		System.out.print("How old are you?: "); //Use cases
		age = in.nextInt(); //Actor
		
		if (age < 16) {
			System.out.println("Sorry,"+" " +s+ "you are not quite old enough to drive!"); 
		}
		
		else {
			System.out.println("Yeah! Happy driving!");
			}
		
		
	}
}

