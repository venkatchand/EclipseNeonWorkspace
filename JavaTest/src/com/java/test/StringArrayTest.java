package com.java.test;

public class StringArrayTest {
	
	
	public String[] testing()
	{
		
		String[] str={"hi","hello"};
		return str;
		
	}
	
	
	public static void main(String args[])
	{
		StringArrayTest t=new StringArrayTest();
		String[] str2=t.testing();
		
		System.out.println(str2[0]+" "+str2[1]);
	}
	

}
