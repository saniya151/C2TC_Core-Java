package day8;

//Program to take input and  print table upto 10

import java.util.Scanner;

public class Pgrm {


	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numerber");
		
		int n = sc.nextInt();
		
		//calculating sum
		for(int i=1;i<=10;i++) {
			
			System.out.println(n+"*"+i+"="+(n*i));
	}

}
}
