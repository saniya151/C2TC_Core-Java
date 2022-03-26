package com.tns.library.day12;

import java.util.*;

//abstract class
abstract class Shape{
	int length, breadth, radius;
	Scanner input= new Scanner (System. in);
	abstract void printArea();
	
}

//subclass having attributes of superclass
class Rectangle extends Shape{
	void printArea(){
		System.out.println("*Finding the Area of Rectangle*");
		System.out.print ("Enter length and breadth:\n");
		length= input.nextInt();
		breadth = input.nextInt();
		System.out.println("The area of Rectangle is: " + length * breadth);
	}	
}	

//subclass having attributes of superclass		
class Triangle extends Shape {
	 void printArea(){
		 System.out.println("\n* Finding the Area of Triangle *");
		 System.out.print ("Enter Base And Height:");
		 length = input.nextInt();
		 breadth = input.nextInt();
		 System.out.println("The area of Triangle is: " + (length * breadth) / 2);
	 }
}		 

//subclass having attributes of superclass
public class UMLDemo1{
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.printArea();
		
		Triangle t = new Triangle();
		t.printArea();
	}
}
