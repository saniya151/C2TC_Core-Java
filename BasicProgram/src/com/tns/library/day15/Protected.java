package com.tns.library.day15;

class A{
	
	//Protected method
	protected void display() {
		System.out.println("Hello Everyone");
	}
}
 class Protected extends A{

	public static void main(String[] args) {
		
		//Instantiating an object of class a
		A a = new A();
		
		//Accessing protected method
		a.display();

	}

}
