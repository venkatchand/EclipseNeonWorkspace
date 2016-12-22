package com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public  class VectorTest   
{
	 
		
	public static void main(String args[])
	{	 
		 Vector vv= new Vector(5);
		 vv.add("123");
		 vv.add(123);
		 vv.add(12.34536);
		 vv.add('A');
		 
		 Enumeration enim=vv.elements();
		 
		 while(enim.hasMoreElements())
		 {
			 System.out.println(enim.nextElement());
		 }
		 
		 }
	 
}