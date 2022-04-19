package com.tns.library.day36;

import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.*;

public class WindowListener1 extends Frame implements WindowListener{
	Button b1,b2;
	TextField t;
	int i = 0;
	
	public void init() {
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear"));
		
		b1.addActionListener((e) -> t.setText("Hello World"));
		b2.addActionListener((e) -> t.setText(" "));
		
		addWindowListener(this);
	}   
	
	public static void main(String[] args) {
		WindowListener1 a = new WindowListener1();
		a.setSize(500,200);
		a.setVisible(true);
		
		
	}
	

	@Override
	public void windowClosing(WindowEvent arg0) {
	this.setVisible(false);
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
