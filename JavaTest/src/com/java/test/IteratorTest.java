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
	
//		For loop
		System.out.println("For Loop :::\n");
		
		for(int i=0;i<arrayList.size();i++)
		{
			System.out.println(arrayList.get(i));
		}
//		For Each loop
		System.out.println("For EachLoop :::\n");
		
		for(String str:arrayList)
		{
			System.err.println(str+"");
		}
		
//		Iterating Using iterate
		
		System.out.println("Iterator ::: \n");
		Iterator it=arrayList.iterator();
		
		while(it.hasNext())
		{
			Object ob=it.next();
			System.out.println(ob+"...");
			
		}
		
//		While loop
		int j=0;
		System.out.println("While Loop ::: \n");
		while( j < arrayList.size())
		{
			System.out.println(arrayList.get(j)+"+");
			j++;
		}
		
		
	}
}