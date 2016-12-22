package com.java.test;

class A{
	int i=10;
	{
		i=i++;
		
		System.out.println(i);
	}
}
class B extends A{

	{
		System.out.println(method());
	}
	
	int method()
	{
		System.out.println(i);
		return i-- + -- i;
	}
}
public  class InheritanceTest   
{
	 
		
	public static void main(String args[])
	{
		B a=new B();
		A c=new A();

	}
	 
}