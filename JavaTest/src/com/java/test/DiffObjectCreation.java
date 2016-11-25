package com.java.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DiffObjectCreation implements Cloneable {
	
	void display(String sss)
	{
		System.out.println(sss);
	}
	
	public static void main(String args[]) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException
	{
		System.out.println("Creating Objects in 4 ways :");
//		Creating object from new keyword
		DiffObjectCreation diffNew=new DiffObjectCreation();
		diffNew.display("1.	Normal objec creation using \"new\" keyword ");
		
//		Creating object from cloneable...
		DiffObjectCreation diffCloneable=(DiffObjectCreation) diffNew.clone();
		diffCloneable.display("2.	This is from \"Clonalble\"");
		
//		Creating object using Class.forName()
		Class classi=Class.forName("com.java.test.DiffObjectCreation");
		DiffObjectCreation dffClassForName=(DiffObjectCreation) classi.newInstance();
		dffClassForName.display("3.	This from \"Class.forname() \"");
		
//		Creating object using Class loader
		DiffObjectCreation diffClassLoader=(DiffObjectCreation) DiffObjectCreation.class.getClassLoader().loadClass("com.java.test.DiffObjectCreation").newInstance();
		diffClassLoader.display("4.	This is from Class loder...");
		
//		Creating Object from Objectinputstream
		DiffObjectCreation diffInputStream=null;
		FileOutputStream fout=new FileOutputStream("F:/EclipseNeonWorkspace/JavaTest/Testing.txt");
		byte b=123;
		fout.write(b);
		fout.flush();
		fout.close();
		FileInputStream fin=new FileInputStream("F:/EclipseNeonWorkspace/JavaTest/Testing.txt");
		ObjectInputStream obj=new ObjectInputStream(fin);
		diffInputStream=(DiffObjectCreation) obj.readObject();
//		diffInputStream.display("This is from object stream...");
		
		fin.close();
		obj.close();
		
		
	}
}
