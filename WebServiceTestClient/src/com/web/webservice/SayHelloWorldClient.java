package com.web.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class SayHelloWorldClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException {
		// TODO Auto-generated method stub
		
		URL url = new URL("http://localhost:8080/WebServiceTest/services/TestSOAP?wsdl");
		
		QName qname=new QName("http://webservice.web.com","TestSOAPService");
		Service service = Service.create(url, qname);
		TestSOAP t=service.getPort(TestSOAP.class);
		System.out.println(t.sayHelloWorld("ert"));
		
		
		
		
		
	}

}
