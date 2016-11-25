package com.java.test;

import java.util.ArrayList;
import java.util.Iterator;

public  class IteratorTest
{

	public static void main(String args[]) throws Throwable
	{
		IteratorTest test=new IteratorTest();
		
		ArrayList<String> arrayList=new ArrayList<String>();
		
		arrayList.add("i");
		arrayList.add("am");
		arrayList.add("VvV");
		
		Iterator it=arrayList.iterator();
		
		while(it.hasNext())
		{
			Object ob=it.next();
			System.err.println(ob);
			
		}
		
	}
}