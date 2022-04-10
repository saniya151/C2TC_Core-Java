package com.tns.library.day31;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.Button;
import java.awt.TextField;

public class InnerClass1 extends Applet implements ActionListener{
	Button b1,b2;
	TextField t;
	
	public void init() {
		
		add(b1 = new Button("CLick"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear"));
		
		b1.addActionListener(this);
		
		A a = new A();
		
	}
		
		public void actionPerformed(ActionEvent e) {
			t.setText("Good Morning");
		}
		
		class A implements ActionListener{
			public A() {
			b2.addActionListener(this);
			}
			
			public void actionPerformed(ActionEvent e) {
				t.setText(" ");
				
			
			}
		}
		
		
}
	
	
