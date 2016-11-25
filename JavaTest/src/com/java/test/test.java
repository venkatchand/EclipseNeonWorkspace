package com.java.test;


public class test {

	private String name;


public static void main(String args[]) {

	test m1=new test();
	test m2=new test();
	
	m1.name=m2.name="m1";
	callMe(m1,m2);
	System.out.println(m1+" "+m2);

}

public static void  callMe(test... m )
{
	m[0]=m[1];
	m[1].name="new name";
}

}
