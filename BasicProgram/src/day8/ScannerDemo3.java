package day8;

//Input Scanner class
import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {
		
		//Making an object from the Scanner class
		Scanner sc = new Scanner(System.in);
		
		//Declaring variables
		int seat_no;
		String name;
		Double score;
		
		System.out.println("Enter the name of student");
		name = sc.nextLine(); //Reading String
		
		System.out.println("Enter the seat_no of student");
		seat_no = sc.nextInt(); //Reading Integer
		
		System.out.println("Enter the score of student");
		score = sc.nextDouble(); //Reading Double
		
		//Output
		System.out.println("Hello"+" "+name);
		System.out.println(seat_no+" "+"is your seat_no");
		System.out.println("And you have scored"+" "+score);
	}
	

}
