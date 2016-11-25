package com.java.test;


public class test3 {

	private String name;


public static void main(String args[]) {

	test3 m1=new test3();
	test3 m2=new test3();
	
	m1.name=m2.name="m1";
	callMe(m1,m2);
	System.out.println(m1+" "+m2);

}

public static void  callMe(test3... m )
{
	m[0]=m[1];
	m[1].name="new name";
}

}
