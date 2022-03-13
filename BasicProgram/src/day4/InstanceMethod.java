package day4;

class A {      
	    
	    // Instance method  
	    void add()                
	    { 
	      int a= 2;
	      int b= 3;
	      System.out.println("The sum of 2 and 3 is :" + (a+b));
	    }
	}
	public class InstanceMethod {
	      // Static method
	    public static void main (String[] args) {        
	        
	        // creating object of the class
	    	A a1 = new A();           
	            
	        // calling instance method
	        a1.add();  
	            
	    }
	}

	
