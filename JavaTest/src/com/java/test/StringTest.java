/**
 * 
 */
package com.java.test;

/**
 * @author cvenkatesan
 *
 */
public class StringTest {

	private void test1()
	{
		System.out.println("test1");
	}
private void test1(String m)
{
	System.out.println("test2");
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str="vcv";
//		str="vbn";
//		System.out.println(str);
//		
//		StringTest stt=new StringTest();
//		stt.test1();
//		stt.test1("m");
		String s1="vcvo";
		String s2="vcv";
		if(s1.equals(s2)) // check values equals
		{
			System.out.println("true");
		}
		
		if(s2 == s1) // check both variable reference same value
		{
			System.out.println("vcv");
		}
		
		String sstr1="Hello World";
		 
		String str2="Hello World";
		 
		if ( sstr1.equals(str2))
		 
		{// this condition is true
		 
		System.out.println("str1 and str2 are equal in terms of values");
		 
		}
		 
		if (sstr1==str2) {
		 
		//This condition is not true
		 
		System.out.println("Both strings are referencing same object");
		 
		}
		 
		else
		 
		{
		 
		// This condition is true
		 
		System.out.println("Both strings are referencing different objects");
		 
		}
	}

}
