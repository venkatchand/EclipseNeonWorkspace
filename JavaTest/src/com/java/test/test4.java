package com.java.test;


public class test4 {

	private String name;


public static void main(String args[]) {

	test4 m1=new test4();
	test4 m2=new test4();
	
	m1.name=m2.name="m1";
	callMe(m1,m2);
	System.out.println(m1+" "+m2);

}

public static void  callMe(test4... m )
{
	m[0]=m[1];
	m[1].name="new name";
}

}
