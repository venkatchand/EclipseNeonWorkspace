/**
 * TestSOAPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.web.webservice;

public interface TestSOAPService extends javax.xml.rpc.Service {
    public java.lang.String getTestSOAPAddress();

    public com.web.webservice.TestSOAP getTestSOAP() throws javax.xml.rpc.ServiceException;

    public com.web.webservice.TestSOAP getTestSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
