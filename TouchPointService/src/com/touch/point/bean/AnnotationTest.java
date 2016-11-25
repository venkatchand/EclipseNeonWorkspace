package com.touch.point.bean;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name="hi")
@XmlAccessorType(XmlAccessType.FIELD)
public class AnnotationTest {
	@XmlValue
	private static String number="gfhfgh";
	
	public static void main(String args[]) throws JAXBException
	{
		
		JAXBElement<String> jaxbElement = new JAXBElement<String>(new QName("hello"),String.class, number);
		JAXBElement<String> jaxbElement2 = new JAXBElement<String>(new QName("hi"),String.class, number);
		
	    JAXBContext context = JAXBContext.newInstance();

	    Marshaller m = context.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    m.marshal(jaxbElement,System.out);
//		m.marshal(jaxbElement2,System.out);
	}


}
