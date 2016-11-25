package com.java.test;

public  class test6 
{
	test6() {
		System.out.println("zero constructor");
	}
	
	test6(int x,int y)
	{
		this();
		System.out.println("Two parameter constructor");
	}

	public static void main(String args[])
	{
		test6 test=new test6(2,2);
	}
}