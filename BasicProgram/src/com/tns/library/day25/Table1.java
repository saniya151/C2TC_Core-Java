//package com.tns.library.day25;
//
//import java.applet.Applet;
//import java.awt.*;
//import java.awt.event.*;
//
//
//
//public class Table1 extends Applet  {
//	
//	TextField t;
//	Button b;
//	
//	
//	public void init() {
//		
//	
//		add(t = new TextField(10));
//		add(b = new Button("Click"));
//		
//		b.addActionListener(new A(this));
//	}
//}
//
//class A implements ActionListener{
//	Table1 tb ;
//	int i;
//	int count;
//	
//	
//		public void actionPerformed(ActionEvent e) {
//			if(e.getSource()==b) {
//				
//				
//				for(i=1;i<=10;i++) {
//					int a = i*10;
//					
//					g.drawString(i+"*"+2="+a,150,count);
//
//				}
//				
//			}
//			
//			
//		}
//}
//	
//	
//	