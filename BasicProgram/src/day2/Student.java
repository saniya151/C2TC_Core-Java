package day2;

public class Student { //Declaration of class
	
	int stud_id; //Declaration of data types
	String name;
	void display() {
	
	System.out.println("Student Id:" +stud_id);
	System.out.println("Student name:" +"name");
	}
	
	public static void main(String[] args) {
		Student S1,S2,S3; //S1,S2 & S3 are the variables of class Student
		
	    S1= new Student(); //Instantiating the object which is given reference to the variable S1
		S1.stud_id=11; 
		
		S1.name="Syeda";
		
	    S2=new Student(); //
		S2.stud_id=22;
		S2.name="Saniya";
		
		S3=new Student();
		S3.stud_id=33;
		S3.name="Parveen";
		
//		System.out.println(S1.name);
//		System.out.println(S1.stud_id);
//		
//		System.out.println(S2.name);
//		System.out.println(S2.stud_id);
//		
//		System.out.println(S3.name);
//		System.out.println(S3.stud_id);
		
		S1.display();
		S2.display();
		S3.display();
		
	}

}