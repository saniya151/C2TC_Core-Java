package com.tns.library.day18;

//This is a Simple Java Applet
//program using appletviewer

import java.applet.Applet;
import java.awt.*;


public class Applet2 extends Applet {
	public void init()
	{
		System.out.println("Initializing an applet");
	}

	public void start()
	{
		System.out.println("Starting an applet");
	}
	public void stop()

	{
		System.out.println("Stopping an applet");
	}
	public void destroy()

	{
		System.out.println("Destroying an applet");
	}
}
