package com.tns.library.day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.*;


public class this_keyword extends Applet implements ActionListener{
	Button b1,b2;
	TextField t;
	
	public void init() {
		add(b1= new Button("Click"));
		add(t = new TextField(10));
		add(b2= new Button("Clear"));
		
		//this keyword refers the current class instance variable
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) 
			t.setText("HellO");
		else 
				t.setText("");
			
	}

}

