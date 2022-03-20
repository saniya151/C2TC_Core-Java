package day10;

//Input Scanner class
import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		
		//Making an object from the Scanner class
		Scanner sc = new Scanner(System.in);
		
		//Declaring variable 
		String strg;
		
		
		System.out.println("What is your name");				
		strg= sc.nextLine(); //Reading String
		
		System.out.println("My name is :"+" "+strg); //Output

	}

}
