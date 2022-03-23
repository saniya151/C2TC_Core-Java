package com.tns.library.day15;

class Andriod{
	
	//Declaring public variables
	public String model;
	public int ram;
	
	//public method
	public void display() {
		System.out.println("The Model is "+ model);
		System.out.println("And it has ram of"+ " "+ram+"gb");
	}
}

public class Public {

	public static void main(String[] args) {
		
		Andriod an = new Andriod();
		an.model = "Samsung";
		an.ram = 4;
		
		an.display();

	}

}
