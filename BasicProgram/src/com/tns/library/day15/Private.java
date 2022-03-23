package com.tns.library.day15;

//class Demo{
//	private String name;
//}
//
//public class Private {
//
//	public static void main(String[] args) {
//
//		Demo d = new Demo();
//		d.name = "Coding";
//
//	}
//
//}

//In the above ex. we have declared a private variable named "name' so when we try to access it from main class an error will be generated
//If the solution to it is we can use the getters and setters method

class Demo{
	
	//private variable
	private String name;

    //getterMethod
    public String getName() {
    	return this.name; //this keyword is used to refer to the variable of the class
    }
    
    //setterMethod
    public void setName(String name) {
    	this.name = name;
    }
}
 
public class Private {

	public static void main(String[] args) {

		Demo d = new Demo();
		d.setName("coding");
		System.out.println(d.getName());
	}
}


	