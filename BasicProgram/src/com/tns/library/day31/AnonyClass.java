package com.tns.library.day31;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.Button;
import java.awt.TextField;

public class AnonyClass extends Applet{
	Button b1,b2;
	TextField t;
	
	public void init() {
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear"));
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				t.setText("Anonymous");
			}
		});
	
	
	    b2.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e) {
	    		t.setText(" ");
	    		
	    	}
	    });
	    
	}   

}
