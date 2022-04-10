package com.tns.library.day34;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.Button;
import java.awt.TextField;

public class EventHandle1 extends Applet{
	Button b1,b2;
	TextField t;
	
	public void init() {
		add(b1 = new Button("Click"));
		add(t = new TextField(20));
		add(b2 = new Button("Clear"));
		
		b1.addActionListener(new A());
		b2.addActionListener(new B());
		
	}
	
	class A implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			t.setText("Core Java");			
			
		}
	}
	
	class B implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			t.setText(" ");
			
		}
	}

}
