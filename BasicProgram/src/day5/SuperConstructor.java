package day5;

class Demo{
	
	Demo(){
		System.out.println("created a Demo class contructor");
	}
}

class Demo2 extends Demo{
	Demo2(){
		
		//first statement in derived class constructor
		super(); //calling to super class constructor
		
		System.out.println("created a Demo2 class constructor ");
	}
}

 class SuperConstructor {

	public static void main(String[] args) {
		
		Demo2 d = new Demo2();

	}

}
