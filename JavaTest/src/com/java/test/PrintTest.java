package com.java.test;

import java.io.IOException;

public class PrintTest  {
	
public	static void main(String args[]) throws IOException
	{
		System.out.println("AAA");
		System.out.format("%S", "BBB \n");
		
		System.out.write("CCC \n".getBytes());
		System.err.println("DDD");
		
		
	}
}
