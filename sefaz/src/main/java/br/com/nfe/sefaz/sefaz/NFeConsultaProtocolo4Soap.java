/**
 * NFeConsultaProtocolo4Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4;

public interface NFeConsultaProtocolo4Soap extends java.rmi.Remote {

    /**
     * Serviço destinado ao atendimento de solicitações de consulta
     * da situação atual da NF-e na Base de Dados do Portal da Sefaz Virtual
     * do Ambiente Nacional
     */
    public br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4.NfeResultMsg nfeConsultaNF(br.inf.portalfiscal.www.nfe.wsdl.NFeConsultaProtocolo4.NfeDadosMsg nfeDadosMsg) throws java.rmi.RemoteException;
}
