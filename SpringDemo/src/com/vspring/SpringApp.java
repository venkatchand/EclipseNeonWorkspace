package com.vspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("deprecation")
public class SpringApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	    Normal java object creation	
//		HelloWorld  hello=new HelloWorld();
		
		
// This bean factory one of the method of reading xml file
//		for using this factory ypu have to place ur xml file in project root folder not in src folder
//	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("SpringApplicationContext.xml"));  
		
		
//		This is another method for using xml file 
//		For use this method u have to place your file inside of src folder
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringApplicationContext.xml");
		
		HelloWorld hello=(HelloWorld) context.getBean("HelloBean");	
		hello.display();
		
		
	}
}
