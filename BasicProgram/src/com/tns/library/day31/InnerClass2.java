package com.tns.library.day31;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.Button;
import java.awt.TextField;

public class InnerClass2 extends Applet{
	Button b1,b2;
	TextField t;
	
	public void init() {
		add(b1 = new Button("Click"));
		add(t = new TextField(20));
		add(b2 = new Button("Clear"));
		A a = new A();
		B b = new B();
		
	}
	
	class A implements ActionListener{
		
		public A() {
			b1.addActionListener(this);	
		}
		
		public void actionPerformed(ActionEvent e) {
			t.setText("HI All");			
			
		}
	}
	
	class B implements ActionListener{
		
		public B() {
			b2.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent e) {
			t.setText(" ");
			
		}
	}

}
