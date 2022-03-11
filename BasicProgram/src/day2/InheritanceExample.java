package day2;

class A{ //super class 
	void msg1() {
		System.out.println("Hello everyone");
	}
	void msg2() {
		System.out.println("My name is Saniya");
	}
}

class B extends A{            //extends keyword is used to derive a new class from an existing class
	                         //It is also called as sub class
	void msg2() {
		System.out.println("I am an Engineer");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		A a1,a2;
		B b1;
	    a1=new A();
	    a2=new A();
	    b1=new B();
		a1.msg1();
		a2.msg2();
        b1.msg2();
      
	}

}
