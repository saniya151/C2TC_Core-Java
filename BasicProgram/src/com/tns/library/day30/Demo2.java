package com.tns.library.day30;

public class Demo2 implements Demo1{
	
	public void m1() {
		System.out.println("Good");
	}
	
	public void m2() {
		System.out.println("Morning");
	}
	
	
	public void m3() {
		System.out.println("Evening");
	}
	
	public static void main(String[] args) {
		Demo2 d1,d2;
		d1 = new Demo2();
		d2 = new Demo2();
		
		d1.m1();
		d2.m3();
	}
}

