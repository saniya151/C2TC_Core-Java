package day3;

class A{

	void m1() {
	System.out.println("The value of a is:" + 1);
	System.out.println("The value of b is:" + 2);
}
	
}	

public class ReferenceVarDemo {

	public static void main(String[] args) {
	 
	 A a1=new A();   //Instantiating the object which is given reference to the variable a1
	                 //keyword "new" is used to create an object
	                 //Objects are stored in the memory & reference variables are used to refer objects stored in the memory
	 
	 a1.m1();        //At this point we are accessing the method m1() of the class A using our custom reference variable a1
	  
	  
	  
	}

}
