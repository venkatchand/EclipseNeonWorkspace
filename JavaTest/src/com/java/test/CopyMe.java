package com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public  class CopyMe   
{
	 
		
	public static void main(String args[])
	{
		 System.out.println("copy me");
		 int a[]={1,2,3,4};
		 
		 Vector vv= new Vector(5);
		 vv.add("123");
		 vv.add(123);
		 vv.add(12.34536);
		 
		 Enumeration enim=vv.elements();
		 
		 while(enim.hasMoreElements())
		 {
			 System.out.println(enim.nextElement());
		 }
		 
		 }
	 
}