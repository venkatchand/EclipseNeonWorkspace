package com.web.webservice;

public class TestSOAPProxy implements com.web.webservice.TestSOAP {
  private String _endpoint = null;
  private com.web.webservice.TestSOAP testSOAP = null;
  
  public TestSOAPProxy() {
    _initTestSOAPProxy();
  }
  
  public TestSOAPProxy(String endpoint) {
    _endpoint = endpoint;
    _initTestSOAPProxy();
  }
  
  private void _initTestSOAPProxy() {
    try {
      testSOAP = (new com.web.webservice.TestSOAPServiceLocator()).getTestSOAP();
      if (testSOAP != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)testSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)testSOAP)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (testSOAP != null)
      ((javax.xml.rpc.Stub)testSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.web.webservice.TestSOAP getTestSOAP() {
    if (testSOAP == null)
      _initTestSOAPProxy();
    return testSOAP;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (testSOAP == null)
      _initTestSOAPProxy();
    testSOAP.main(args);
  }
  
  public java.lang.String sayHelloWorld(java.lang.String name) throws java.rmi.RemoteException{
    if (testSOAP == null)
      _initTestSOAPProxy();
    return testSOAP.sayHelloWorld(name);
  }
  
  
}