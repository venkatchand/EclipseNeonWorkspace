/**
 * TestSOAPServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.web.webservice;

public class TestSOAPServiceLocator extends org.apache.axis.client.Service implements com.web.webservice.TestSOAPService {

    public TestSOAPServiceLocator() {
    }


    public TestSOAPServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TestSOAPServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TestSOAP
    private java.lang.String TestSOAP_address = "http://localhost:8080/WebServiceTest/services/TestSOAP";

    public java.lang.String getTestSOAPAddress() {
        return TestSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TestSOAPWSDDServiceName = "TestSOAP";

    public java.lang.String getTestSOAPWSDDServiceName() {
        return TestSOAPWSDDServiceName;
    }

    public void setTestSOAPWSDDServiceName(java.lang.String name) {
        TestSOAPWSDDServiceName = name;
    }

    public com.web.webservice.TestSOAP getTestSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TestSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTestSOAP(endpoint);
    }

    public com.web.webservice.TestSOAP getTestSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.web.webservice.TestSOAPSoapBindingStub _stub = new com.web.webservice.TestSOAPSoapBindingStub(portAddress, this);
            _stub.setPortName(getTestSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTestSOAPEndpointAddress(java.lang.String address) {
        TestSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.web.webservice.TestSOAP.class.isAssignableFrom(serviceEndpointInterface)) {
                com.web.webservice.TestSOAPSoapBindingStub _stub = new com.web.webservice.TestSOAPSoapBindingStub(new java.net.URL(TestSOAP_address), this);
                _stub.setPortName(getTestSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TestSOAP".equals(inputPortName)) {
            return getTestSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.web.com", "TestSOAPService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.web.com", "TestSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TestSOAP".equals(portName)) {
            setTestSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
