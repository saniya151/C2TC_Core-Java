package day9;

//Demonstration of working of getClass() method

public class Method2_Demo {

	public static void main(String[] args) {
		
		 Object obj = new String("Demo Of getClass");
		 Class c = obj.getClass();
		 
		 System.out.println("Th class of Object obj is :"+" "+c.getName());

	}

}
