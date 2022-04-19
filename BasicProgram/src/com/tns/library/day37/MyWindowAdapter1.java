package com.tns.library.day37;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.FlowLayout;

public class MyWindowAdapter1 extends Frame{
	Button b1,b2;
	TextField t1;
	
	public MyWindowAdapter1() {
		
		setLayout(new FlowLayout());
		add(b1 = new Button("Click"));
		add(t1 = new TextField(10));
		add(b2 = new Button("Clear"));
		
		b1.addActionListener((e) -> t1.setText("Hello World"));
		b2.addActionListener((e) -> t1.setText(""));
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
	
		}
			
	});	
		
		setSize(400,500);
		setVisible(true);					
		
	}
	
	public static void main(String[] args) {
		new  MyWindowAdapter1();
	}
	

}
