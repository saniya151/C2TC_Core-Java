package com.tns.library.day16;

//Program to demonstrate the abstract keyword

abstract class Car
{
 Car()
 {
  System.out.println("Car is ready ");
 }
 
 
 abstract void drive();
 void gearChange()
 {
  System.out.println("Gear has changed");
 }
} 


class Tesla extends Car
 {
  void drive()
  {
   System.out.println("Driving Safely");
  }
 }


class Abstract 
 {
  public static void main (String args[])
  {
   Car obj = new Tesla();
   obj.drive();
   obj. gearChange();
  }
 }