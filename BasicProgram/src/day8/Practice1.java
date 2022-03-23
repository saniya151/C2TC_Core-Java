package day8;

//Sample program of inheritance

class Summer 
{
 void hot()
 {
  System.out.println("I am a hot season ");
 }
}

class Rainy extends Summer 
{
 void rain()
 {
  System.out.println("I am a rainy season ");
 }
}


class Winter extends Rainy 
{
 void cold()
 {
  System.out.println("I am a cold season");
 }
}

class Practice1 
{
 public static void main(String args[])
 {
  Winter w = new Winter();
  w.hot();
  w.rain();
  w.cold();
 }
}
	 