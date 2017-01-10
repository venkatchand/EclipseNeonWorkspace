package com.interview;

public class MethodOverloading {

	
	public MethodOverloading(int a,int b) {
		// TODO Auto-generated constructor stub
		System.out.println("Integer "+ a+ " "+b);
	}
	
	public MethodOverloading(Float a,Float b) {
		// TODO Auto-generated constructor stub
		System.out.println("Float "+ a+ " "+b);
	}
	
	public MethodOverloading(Number a,Number b) {
		// TODO Auto-generated constructor stub
		System.out.println("Number "+ a+ " "+b);
	}
	
	public static void main(String arg[])
	{
//		float example
//		MethodOverloading mmm=new MethodOverloading(1.3f,2.f);
		
//		Number example
		MethodOverloading mmm=new MethodOverloading(1.3f,2.5);

//		integer example
//		MethodOverloading mmm=new MethodOverloading(1,2);
	}
}
