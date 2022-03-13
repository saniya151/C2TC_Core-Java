package day3;

public class ConstructorDemo {
	String name;
	
	ConstructorDemo(){  //Here ConstructorDemo is a constructor having the same name as that of the class & doesn't have any return type 
		 
		System.out.println("Which is the best program?" );
		name="C2TC Program";
	}

	public static void main(String[] args) {
		ConstructorDemo obj=new ConstructorDemo();
        //new keyword creates the object of ConstructorDemo & invokes the constructor to initialize the created object
		
		System.out.println("The best program is:" + obj.name);
	}

}
