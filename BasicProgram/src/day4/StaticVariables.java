package day4;

public class StaticVariables {
	
	//var1 & var2 are static variables
	static int var1;
	 static String var2;
	  
	  //This is a Static Method
	 
	  static void disp(){
	      System.out.println("Var1 is: "+var1);
	      System.out.println("Var2 is: "+var2);
	  }
	  public static void main(String args[]) 
	  {
		//Both the variables are accessed directly in the static method.
	      disp();
	  }
	}