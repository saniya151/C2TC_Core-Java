package com.tns.library.day32;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.Button;
import java.awt.TextField;

public class OuterClass extends Applet{
	Button b1,b2;
	TextField t;
	
	
	public void init() {
		add(b1= new Button("Click"));
		add(t = new TextField(10));
		add(b2= new Button("Clear"));
		
		b1.addActionListener(new A(this));	
		b2.addActionListener(new B(this));
		
	}
}
	
	
class A implements ActionListener{
	OuterClass oc;
	
	public A(OuterClass oc) {
		this.oc = oc;
	}
		public void actionPerformed(ActionEvent arg0) {
			oc.t.setText("Hello World");
			
		}
}


class B implements ActionListener{
	OuterClass oc;
	
	public B(OuterClass oc) {
		this.oc = oc;
	}
		public void actionPerformed(ActionEvent arg0) {
			oc.t.setText("");
			
		}
	}
