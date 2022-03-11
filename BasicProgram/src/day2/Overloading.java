package day2;

//In Overloading we can use same method but with different parameters

public class Overloading {
	
	void area(float a) {
		float area = a*a;
		System.out.println("The area of square is:"+ area +"sq units");
		
	}
	
	void area(float a,float b) {
		float area = a*b;
		System.out.println("The area of rectangle is:"+ area +"sq units");
		
	}
	
	void area(double r) {
		double area = 3.14*r*r;
		System.out.println("The area of circle is:"+ area +"sq units");
		
	}
	
	void area(double a,double b) {
		double area = (a+b)/2;
		System.out.println("The area of triangle is:"+ area);
		
	}

	public static void main(String[] args) {
		Overloading area=new Overloading();
		area.area(5f);
		area.area(10f,12f);
		area.area(15d);
		area.area(50d, 50d);
		

	}

}
