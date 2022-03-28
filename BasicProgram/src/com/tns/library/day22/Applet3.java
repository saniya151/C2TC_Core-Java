package com.tns.library.day22;

//Program to perform an add operation on 2 integers

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Event;
import java.awt.Label;

public class Applet3 extends Applet{
	Button b;
	Label l;
	TextField t1,t2,t3;


public void init() {
	
	add(t1 = new TextField(5));
	add(l = new Label("+"));
	add(t2 = new TextField(5));
	add(b = new Button("sum"));
	add(t3 = new TextField(5));

}

public boolean action(Event e, Object o) {
	String s1 = t1.getText();
	int a = Integer.parseInt(s1);
	
	String s2 = t2.getText();
	int b = Integer.parseInt(s2);
	
	int c = a+b;
	
	String s3 = String.valueOf(c);
	t3.setText(s3);
	
//	if(e.target.equals(a))
//		t1.setText("");
//	
//	if(e.target.equals(b))
//		t2.setText("");
//	
//	if(e.target.equals(b))
//		t3.setText("");
	
	return true;
	
	
}


}