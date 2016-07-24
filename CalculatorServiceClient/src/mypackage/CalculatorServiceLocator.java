/**
 * CalculatorServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class CalculatorServiceLocator extends org.apache.axis.client.Service implements mypackage.CalculatorService {

    public CalculatorServiceLocator() {
    }


    public CalculatorServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculatorServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_ICalculatorService
    private java.lang.String BasicHttpBinding_ICalculatorService_address = "http://localhost/calculator/Service.svc/CalculatorService";

    public java.lang.String getBasicHttpBinding_ICalculatorServiceAddress() {
        return BasicHttpBinding_ICalculatorService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_ICalculatorServiceWSDDServiceName = "BasicHttpBinding_ICalculatorService";

    public java.lang.String getBasicHttpBinding_ICalculatorServiceWSDDServiceName() {
        return BasicHttpBinding_ICalculatorServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_ICalculatorServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_ICalculatorServiceWSDDServiceName = name;
    }

    public mypackage.ICalculatorService getBasicHttpBinding_ICalculatorService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_ICalculatorService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_ICalculatorService(endpoint);
    }

    public mypackage.ICalculatorService getBasicHttpBinding_ICalculatorService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.BasicHttpBinding_ICalculatorServiceStub _stub = new mypackage.BasicHttpBinding_ICalculatorServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_ICalculatorServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_ICalculatorServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_ICalculatorService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.ICalculatorService.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.BasicHttpBinding_ICalculatorServiceStub _stub = new mypackage.BasicHttpBinding_ICalculatorServiceStub(new java.net.URL(BasicHttpBinding_ICalculatorService_address), this);
                _stub.setPortName(getBasicHttpBinding_ICalculatorServiceWSDDServiceName());
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
        if ("BasicHttpBinding_ICalculatorService".equals(inputPortName)) {
            return getBasicHttpBinding_ICalculatorService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "CalculatorService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_ICalculatorService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_ICalculatorService".equals(portName)) {
            setBasicHttpBinding_ICalculatorServiceEndpointAddress(address);
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
