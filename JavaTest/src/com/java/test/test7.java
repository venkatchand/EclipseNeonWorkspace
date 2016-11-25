package com.java.test;

import java.util.GregorianCalendar;

class testing{
	int a,b;
	
	testing()
	{
		
		System.out.println("super class");
	}
}
public  class test7
{
	test7() {
		System.out.println("Sub Class");
		// TODO Auto-generated constructor stub
		this.dispaly();
	}

	public void dispaly()
	{
		int a=0,b=0;
		System.out.println(a);
		System.out.println(b);
		
	}
		
	public static void main(String args[]) throws Throwable
	{
		test7 test=new test7();
		GregorianCalendar bn =new GregorianCalendar();
//		test.dispaly();
//		System.out.println(test.toString());
		System.out.println(bn.getTime());
		test.finalize();
		test.dispaly();
//		System.exit(0);
		
		System.out.println("fghj");
	}
}