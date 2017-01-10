package com.interview;

import java.io.FileNotFoundException;

public class Exception {

	public static void main(String arg[]) throws FileNotFoundException
	{
		try{
			System.out.println("Exception throwed");
			throw new FileNotFoundException();
		}
		
		catch(RuntimeException e)
		{
			System.err.println("Runtime exp");
		}
//		catch(Exception es)
//		{
//			
//		}
		finally{
			System.out.println("finally block");
		}
	}
}
