package com.tns.library.day24;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.GridLayout;
import java.awt.CheckboxGroup;

public class Applet1 extends Applet {
	
	Checkbox c1,c2,c3,c4,c5,c6;
	CheckboxGroup grp;
	
	public void init() {
		grp = new CheckboxGroup();
		setLayout(new GridLayout(4,2));
		
		
		add(c1 = new Checkbox("Tour1",grp,false));
		add(c2 = new Checkbox("Manali"));
		add(c3 = new Checkbox("Tour2",grp,false));
		add(c4 = new Checkbox("Goa"));
		add(c5 = new Checkbox("Tour3",grp,false));
		add(c6 = new Checkbox("Mumbai"));
		
		
	
	}

}
