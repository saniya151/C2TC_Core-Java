package com.tns.library.day22;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;

//Inheriting class Applet 
public class Applet1 extends Applet{
	
	//Declaring  variables b1,b2 of class Button 
	//Declaring variable f of class TextField
	Button b1,b2;
	TextField f;
	
	//overriding init  method
	public void init() {
		
		
		add(b1 = new Button("Click"));
	
		add(f = new TextField(10));
		
		add(b2 = new Button("Clear"));
	
	}

}
