package com.tns.library.day29;

interface A{
	void a();
	void b();
	void c();
	void d();
}

abstract class B implements A{
	public void c(){
		System.out.println("Hello c");
	}
}

class C extends B{
	public void a() {
		System.out.println("Hello a");
	}
	
	public void b() {
		System.out.println("Hello b");
	}
	
	public void d() {
		System.out.println("Hello d");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		A a = new C();
		a.a();
		a.b();
		a.c();
		a.d();
	}

	
}
