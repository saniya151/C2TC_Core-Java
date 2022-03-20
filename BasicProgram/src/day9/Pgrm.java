package day9;

import java.util.Scanner;

//Program to compute the sum of digits of an integer

public class Pgrm {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer:");
		
		long n = in.nextLong();
		System.out.println("The sum of digits is:"+sumDigits(n));

	}
	
	public static int sumDigits(long n) {
		int sum = 0;
		while (n!=0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
		}
	}


