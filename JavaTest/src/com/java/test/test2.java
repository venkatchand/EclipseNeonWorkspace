package com.java.test;


public class test2 {

	private String name;


public static void main(String args[]) {

	test2 m1=new test2();
	test2 m2=new test2();
	
	m1.name=m2.name="m1";
	callMe(m1,m2);
	System.out.println(m1+" "+m2);

}

public static void  callMe(test2... m )
{
	m[0]=m[1];
	m[1].name="new name";
}

}
