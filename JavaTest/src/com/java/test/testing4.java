package com.java.test;

class testingsw{
	int a,b;
	
	testingsw()
	{
		
		System.out.println("super class");
	}
}
public  class testing4 extends testingsw 
{
	testing4() {
		System.out.println("Sub Class");
		// TODO Auto-generated constructor stub
	}

	public void dispaly()
	{
		int a=0,b=0;
		System.out.println(a);
		System.out.println(b);
		
	}
		
	public static void main(String args[])
	{
		testing4 test=new testing4();
//		test.dispaly();
	}
}