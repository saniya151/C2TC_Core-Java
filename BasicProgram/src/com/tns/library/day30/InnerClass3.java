package com.tns.library.day30;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.*;

public class InnerClass3 extends Applet {
	Button b1,b2;
	static TextField t;

	
	public void init() {
		add(b1= new Button("Click"));
		add(t = new TextField(10));
		add(b2= new Button("Clear"));
		
		b1.addActionListener(new A());	
		b2.addActionListener(new B());
		
	}
				
	
	 class A implements ActionListener{
	
		public void actionPerformed(ActionEvent e) {
				t.setText("Ok");

	     }
	}
	 
	 class B implements ActionListener{
			
			public void actionPerformed(ActionEvent e) {
					t.setText("");

		     }
		}
}
