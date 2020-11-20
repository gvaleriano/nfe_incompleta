/**
 * NFeConsultaProtocolo4Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4;

public class NFeConsultaProtocolo4Locator extends org.apache.axis.client.Service implements br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4.NFeConsultaProtocolo4 {

    public NFeConsultaProtocolo4Locator() {
    }


    public NFeConsultaProtocolo4Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NFeConsultaProtocolo4Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NFeConsultaProtocolo4Soap12
    private java.lang.String NFeConsultaProtocolo4Soap12_address = "https://www.svc.fazenda.gov.br/NFeConsultaProtocolo4/NFeConsultaProtocolo4.asmx";

    public java.lang.String getNFeConsultaProtocolo4Soap12Address() {
        return NFeConsultaProtocolo4Soap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NFeConsultaProtocolo4Soap12WSDDServiceName = "NFeConsultaProtocolo4Soap12";

    public java.lang.String getNFeConsultaProtocolo4Soap12WSDDServiceName() {
        return NFeConsultaProtocolo4Soap12WSDDServiceName;
    }

    public void setNFeConsultaProtocolo4Soap12WSDDServiceName(java.lang.String name) {
        NFeConsultaProtocolo4Soap12WSDDServiceName = name;
    }

    public br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4.NFeConsultaProtocolo4Soap getNFeConsultaProtocolo4Soap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NFeConsultaProtocolo4Soap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNFeConsultaProtocolo4Soap12(endpoint);
    }

    public br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4.NFeConsultaProtocolo4Soap getNFeConsultaProtocolo4Soap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4.NFeConsultaProtocolo4Soap12Stub _stub = new br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4.NFeConsultaProtocolo4Soap12Stub(portAddress, this);
            _stub.setPortName(getNFeConsultaProtocolo4Soap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNFeConsultaProtocolo4Soap12EndpointAddress(java.lang.String address) {
        NFeConsultaProtocolo4Soap12_address = address;
    }


    // Use to get a proxy class for NFeConsultaProtocolo4Soap
    private java.lang.String NFeConsultaProtocolo4Soap_address = "https://www.svc.fazenda.gov.br/NFeConsultaProtocolo4/NFeConsultaProtocolo4.asmx";

    public java.lang.String getNFeConsultaProtocolo4SoapAddress() {
        return NFeConsultaProtocolo4Soap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NFeConsultaProtocolo4SoapWSDDServiceName = "NFeConsultaProtocolo4Soap";

    public java.lang.String getNFeConsultaProtocolo4SoapWSDDServiceName() {
        return NFeConsultaProtocolo4SoapWSDDServiceName;
    }

    public void setNFeConsultaProtocolo4SoapWSDDServiceName(java.lang.String name) {
        NFeConsultaProtocolo4SoapWSDDServiceName = name;
    }

    public br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4.NFeConsultaProtocolo4Soap getNFeConsultaProtocolo4Soap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NFeConsultaProtocolo4Soap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNFeConsultaProtocolo4Soap(endpoint);
    }

    public br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4.NFeConsultaProtocolo4Soap getNFeConsultaProtocolo4Soap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4.NFeConsultaProtocolo4SoapStub _stub = new br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4.NFeConsultaProtocolo4SoapStub(portAddress, this);
            _stub.setPortName(getNFeConsultaProtocolo4SoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNFeConsultaProtocolo4SoapEndpointAddress(java.lang.String address) {
        NFeConsultaProtocolo4Soap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4.NFeConsultaProtocolo4Soap.class.isAssignableFrom(serviceEndpointInterface)) {
                br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4.NFeConsultaProtocolo4Soap12Stub _stub = new br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4.NFeConsultaProtocolo4Soap12Stub(new java.net.URL(NFeConsultaProtocolo4Soap12_address), this);
                _stub.setPortName(getNFeConsultaProtocolo4Soap12WSDDServiceName());
                return _stub;
            }
            if (br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4.NFeConsultaProtocolo4Soap.class.isAssignableFrom(serviceEndpointInterface)) {
                br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4.NFeConsultaProtocolo4SoapStub _stub = new br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4.NFeConsultaProtocolo4SoapStub(new java.net.URL(NFeConsultaProtocolo4Soap_address), this);
                _stub.setPortName(getNFeConsultaProtocolo4SoapWSDDServiceName());
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
        if ("NFeConsultaProtocolo4Soap12".equals(inputPortName)) {
            return getNFeConsultaProtocolo4Soap12();
        }
        else if ("NFeConsultaProtocolo4Soap".equals(inputPortName)) {
            return getNFeConsultaProtocolo4Soap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NFeConsultaProtocolo4", "NFeConsultaProtocolo4");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NFeConsultaProtocolo4", "NFeConsultaProtocolo4Soap12"));
            ports.add(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NFeConsultaProtocolo4", "NFeConsultaProtocolo4Soap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NFeConsultaProtocolo4Soap12".equals(portName)) {
            setNFeConsultaProtocolo4Soap12EndpointAddress(address);
        }
        else 
if ("NFeConsultaProtocolo4Soap".equals(portName)) {
            setNFeConsultaProtocolo4SoapEndpointAddress(address);
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
