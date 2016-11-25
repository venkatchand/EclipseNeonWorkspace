package com.java.test;

public class javaPassByReference {

	
	public void badSwap(int var1, int var2)
	{
	  int temp = var1;
	  var1 = var2;
	  var2 = temp;
	}
/*
 public void tricky(Point arg1, Point arg2)
{
  arg1.x = 100;
  arg1.y = 100;
  Point temp = arg1;
  arg1 = arg2;
  arg2 = temp;
}
public static void main(String [] args)
{
  Point pnt1 = new Point(0,0);
  Point pnt2 = new Point(0,0);
  System.out.println("X: " + pnt1.x + " Y: " +pnt1.y); 
  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
  System.out.println(" ");
  tricky(pnt1,pnt2);
  System.out.println("X: " + pnt1.x + " Y:" + pnt1.y); 
  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);  
}
If we execute this main() method, we see the following output:

X: 0 Y: 0
X: 0 Y: 0
X: 100 Y: 100
X: 0 Y: 0
 * */
	
}
