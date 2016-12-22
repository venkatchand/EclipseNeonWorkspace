package com.java.test;

interface Clickable{
	default void click(){
		System.out.println("click");
	}
	void display();
	
}
 
interface Accessible{
	default void access(){
		System.out.println("access");
	}
	
	void display();
}
 
public class MultipleInterfaceInJava8 implements Clickable, Accessible {
 
	public void display()
	{
		System.out.println(" only inherited method signature /'display()'/");
	}
	public static void main(String[] args) {
		MultipleInterfaceInJava8 button = new MultipleInterfaceInJava8();
		button.click();
		button.access();
		button.display();
	}
}