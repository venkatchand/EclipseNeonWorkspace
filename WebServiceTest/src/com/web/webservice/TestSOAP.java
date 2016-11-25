/**
 * 
 */
package com.web.webservice;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @author cvenkatesan
 *
 */

@WebService(endpointInterface = "com.web.webservice.TestSOAP")
@SOAPBinding(style = Style.DOCUMENT)
public class TestSOAP {

	/**
	 * @param args
	 */
	
	String hi;
	String hello;
	
	public String getHi() {
		return hi;
	}
	public void setHi(String hi) {
		this.hi = hi;
	}
	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	@WebMethod
	public ArrayList<String> sayHelloWorld(String name)
	{
		
		ArrayList<String> arraysList=new ArrayList<String>();
		arraysList.add("Hi ");
		arraysList.add("Ur name");
		arraysList.add("is ");
		arraysList.add(name);
		return  arraysList;
		
	}

}
