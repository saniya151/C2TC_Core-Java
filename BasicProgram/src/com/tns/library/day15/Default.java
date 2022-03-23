package com.tns.library.day15;

//Default Access Modifier

//class Default has the default access modifier
//It is visible to all the classes that belong to the same package
//If we try to use the Default class in another class outside the package then will get a compilion error
class Default {
	
		void msg() {
			System.out.println("This is a default access modifier");
		}
		
	public static void main(String[] args) {
		
		Default d = new Default();
		d.msg();
	   	
	}	
	
}
