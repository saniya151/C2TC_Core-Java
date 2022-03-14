package day3;

public class ConstructorDemo {
	String name;
	
	//Here ConstructorDemo is a constructor having the same name as that of the class & doesn't have any return type
	ConstructorDemo(){   
		 
		System.out.println("Which is the best program?" );
		name="C2TC Program";
	}

	public static void main(String[] args) {
		
		//new keyword creates the object of ConstructorDemo & invokes the constructor to initialize the created object
		ConstructorDemo obj=new ConstructorDemo();			
		System.out.println("The best program is:" + obj.name);
	}

}
