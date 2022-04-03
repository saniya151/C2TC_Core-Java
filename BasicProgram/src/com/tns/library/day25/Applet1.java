package com.tns.library.day25;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Panel;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.TextField;


public class Applet1 extends Applet{
	Panel1 p1;
	Panel2 p2;
	
	public void init() {
		setLayout(new GridLayout(1,2));
		add(p1 = new Panel1());
		add(p2 = new Panel2());
		p2.c1.setState(true);
		p2.c2.setState(false);
		p2.c3.setState(false);
		p2.t.setText("2000");
		p2.t.setEditable(false);
				
	}
	
	public boolean action(Event e,Object o) {
		if(p1.c1.getState()) {
			p2.c1.setState(true);
			p2.c2.setState(true);
			p2.c3.setState(false);
			p2.t.setText("50000");
		}
		
		if(p1.c2.getState()) {
			p2.c1.setState(false);
			p2.c2.setState(true);
			p2.c3.setState(true);
			p2.t.setText("40000");
		}
		
		if(p1.c3.getState()) {
			p2.c1.setState(true);
			p2.c2.setState(false);
			p2.c3.setState(true);
			p2.t.setText("70000");
		}
				
		return true;
}

   class Panel1 extends Panel{
	   Checkbox c1,c2,c3;
	   CheckboxGroup grp;
	   
	   public Panel1() {
		   grp = new CheckboxGroup();
		   setLayout(new GridLayout(3,1));
		   add(c1=new Checkbox("Tour1",grp,true));
		   add(c2=new Checkbox("Tour2",grp,true));
		   add(c3=new Checkbox("Tour3",grp,false));
		   
	   }
   }
	   
	   class Panel2 extends Panel{
		   Checkbox c1,c2,c3;
		   GridLayout g;
		    TextField t;
		   
		   public Panel2() {
			   setLayout(new GridLayout(4,1));
			   add(c1=new Checkbox("Singapore"));
			   add(c2=new Checkbox("Sri Lanka"));
			   add(c3=new Checkbox("Maldives"));
			   add(t = new TextField(10));
			   
		   }
	   
	
}
}