package com.web.webservice;


import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

public class SOAPClientTest {

	
	
	public static void main(String args[]) throws Exception {
        // Create SOAP Connection
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();

        // Send SOAP Message to SOAP Server
        String url = "http://localhost:8080/WebServiceTest/services/TestSOAP?wsdl";
        SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(), url);

        // print SOAP Response
        System.out.print("Response SOAP Message:");
        soapResponse.writeTo(System.out);

        /*Sample Response SOAP Message output :
         <?xml version="1.0" encoding="utf-8"?>
        <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
            <soapenv:Body>
                <sayHelloWorldResponse xmlns="http://localhost:8080/">
                    <ns1:sayHelloWorldReturn xmlns:ns1="http://webservice.web.com">Hi </ns1:sayHelloWorldReturn>
                    <ns2:sayHelloWorldReturn xmlns:ns2="http://webservice.web.com">Ur name</ns2:sayHelloWorldReturn>
                    <ns3:sayHelloWorldReturn xmlns:ns3="http://webservice.web.com">is </ns3:sayHelloWorldReturn>
                    <ns4:sayHelloWorldReturn xmlns:ns4="http://webservice.web.com">vennki</ns4:sayHelloWorldReturn>
                </sayHelloWorldResponse>
            </soapenv:Body>
        </soapenv:Envelope>*/
        
        soapConnection.close();
    }

    private static SOAPMessage createSOAPRequest() throws Exception {

    	MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String serverURI = "http://localhost:8080/";

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("vcv", serverURI);


        // SOAP Body
        //This is Request to SOAP message body 
        //  message body element name should match with element name handled in SOAP service 
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("sayHelloWorld","vcv");
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("name","vcv");
        soapBodyElem1.addTextNode("venki");
       /*
        Sample Request SOAP Message Output  :
        <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:vcv="http://localhost:8080/">
        <SOAP-ENV:Header/>
        <SOAP-ENV:Body>
            <vcv:sayHelloWorld>
                <vcv:names>venki</vcv:names>
            </vcv:sayHelloWorld>
        </SOAP-ENV:Body>
    </SOAP-ENV:Envelope>*/
        

        soapMessage.saveChanges();

        /* Print the request message */
        System.out.print("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println();

        return soapMessage;
    }



}


/*public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://192.168.0.140:8080/TouchPointCustomer/services/TouchPointCustomerService?wsdl");
        QName qname = new QName("http://service.jaxws.point.touch.com","TouchPointCustomerServiceService");

        Service service = Service.create(url, qname);
     
	}*/
//        MimeHeaders headers = soapMessage.getMimeHeaders();
//        headers.addHeader("SOAPAction", serverURI  + "getCustomer");


/*
        Constructed SOAP Request Message:
        <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:example="http://ws.cdyne.com/">
            <SOAP-ENV:Header/>
            <SOAP-ENV:Body>
                <example:VerifyEmail>
                    <example:email>mutantninja@gmail.com</example:email>
                    <example:LicenseKey>123</example:LicenseKey>
                </example:VerifyEmail>
            </SOAP-ENV:Body>
        </SOAP-ENV:Envelope>
 */