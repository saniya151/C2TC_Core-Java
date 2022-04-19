package com.tns.library.day26;

//abstract class
abstract class A{
	int a;
	A(){
		System.out.println("Constructor of abstract class");
	}
	
	void func() {
		System.out.println("I am not an abstract method") ;
	}
	
	//declaring abstract method
	abstract void msg();
}

//class B extending abstract method
class B extends A{
	B(){
		super();
	}
	
	//overriding msg() method of abstract class 
	void msg() {
		System. out.println ("I am an abstract method implemented in class B");
	}
	
}

public class abstractdemo{
	public static void main (String[] args){
		B b = new B();
		b.func();
		b.msg() ;
	}

	
}

