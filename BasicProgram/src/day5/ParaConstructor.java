package day5;

public class ParaConstructor {
	
	int id;
	String name;
	
	 ParaConstructor(int i,String n){
		 id=i;
		 name=n;
	 }
	 
	 void display() {
		 System.out.println("Student name is:"+name);
		 System.out.println("Student id is:"+id);
	 }

	public static void main(String[] args) {
		ParaConstructor s1=new ParaConstructor(1,"Syeda");
		ParaConstructor s2=new ParaConstructor(2,"Saniya");
		ParaConstructor s3=new ParaConstructor(3,"Parveen");
		
		s1.display();
		s2.display();
		s3.display();
		

	}

}
