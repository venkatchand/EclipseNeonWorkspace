package com.java.test;


public class test5 {

	private String name;


public static void main(String args[]) {

	test5 m1=new test5();
	test5 m2=new test5();
	
	m1.name=m2.name="m1";
	callMe(m1,m2);
	System.out.println(m1+" "+m2);

}

public static void  callMe(test5... m )
{
	m[0]=m[1];
	m[1].name="new name";
}

}
