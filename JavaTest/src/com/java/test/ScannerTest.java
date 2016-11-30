package com.java.test;

import java.util.Scanner;

public  class ScannerTest   
{
	 
		
	public static void main(String args[])
	
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
		 System.out.println(str+"\n"+"new line");
		 System.out.println("hi");
		 
		 Scanner scan2=new Scanner(System.in);
		 String s2=scan2.nextLine();
		 System.err.println(s2);
		 
	}
}