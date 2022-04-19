package com.tns.library.day38;

class Aa{
	
}
class Ab{
	int i;
	String s;//global variable
	static int j;
	public Ab (int i, String s) {
	this.i = i;
	this.s= s;
	}

}
	

public class ArrayDemo{
	public static void main (String[] args) {
		Aa a= new Aa () ;//ref 1
		Aa al= a;
		Aa a2= new Aa () ; //ref 2
		
		Ab b= new Ab (10,"Saniya"); 
		b.i= 12; //ref
		Ab.j=12;
		Ab b1= b;
		
		if (b==null)
			System.out.println("True");
		else
			System.out.println("False");
		
		
		Ab b2= new Ab(10, "Saniya"); 

		if (b==b1) //equal
			System.out.println ("Equal");
		else
			System.out.println ("Not Equal");
		
		
		if(b==b2) //Not equal
			System.out.println ("Equal");
		else
			System.out.println ("Not Equal");
		
		
		if (b.equals (b1)) //equal
			System.out.println ("Equal");
		else	
			System.out.println ("Not Equal");
		
		
		
		if (b. equals (b2) )//equal
			System.out.println ("Equal") ;
		else
			System.out.println ("Not Equal") ;
		
	}
	
}