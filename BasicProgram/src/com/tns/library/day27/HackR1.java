package com.tns.library.day27;

import java.util.Scanner;

public class HackR1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine().toLowerCase();
		boolean found = true;
		for (int i = 97; i <= 122; i++) {
			char ch = (char) i;
			if (line.indexOf(ch) == -1) {
				found = false;
				break;
			}
		}
		System.out.println(found ? "pangram" : "not pangram");
		sc.close();
	}

}
