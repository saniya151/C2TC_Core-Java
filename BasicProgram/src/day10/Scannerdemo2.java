package day10;

//Input Scanner class
import java.util.Scanner;

public class Scannerdemo2 {

	public static void main(String[] args) {	
		
		//Making an object from the Scanner class
		Scanner sc = new Scanner(System.in);
		
		int a,b; //Declaring variables
		
		
		System.out.println("Enter first no.");
		a= sc.nextInt(); //Reading integer
		
		
		System.out.println("Enter second no.");
		b= sc.nextInt(); //Reading integer
       
				
        System.out.println("The sum of two numbers is:"+" "+(a+b)); //output
	}
}

