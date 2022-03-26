package com.tns.library.day17;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;

public class Applet1 extends Applet{
	Button b;
	TextField f;
	public void init() {
		b = new Button("click");
		f = new TextField(10);
		add(b);
		add(f);
	}
}