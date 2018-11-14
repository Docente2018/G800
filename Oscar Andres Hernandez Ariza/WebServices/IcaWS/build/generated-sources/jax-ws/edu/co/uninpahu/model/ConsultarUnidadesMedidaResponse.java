
package edu.co.uninpahu.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consultarUnidadesMedidaResult" type="{http://microsoft.com/}ArrayOfVO_UNIDAD_MEDIDA" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consultarUnidadesMedidaResult"
})
@XmlRootElement(name = "consultarUnidadesMedidaResponse")
public class ConsultarUnidadesMedidaResponse {

    protected ArrayOfVOUNIDADMEDIDA consultarUnidadesMedidaResult;

    /**
     * Obtiene el valor de la propiedad consultarUnidadesMedidaResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOUNIDADMEDIDA }
     *     
     */
    public ArrayOfVOUNIDADMEDIDA getConsultarUnidadesMedidaResult() {
        return consultarUnidadesMedidaResult;
    }

    /**
     * Define el valor de la propiedad consultarUnidadesMedidaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOUNIDADMEDIDA }
     *     
     */
    public void setConsultarUnidadesMedidaResult(ArrayOfVOUNIDADMEDIDA value) {
        this.consultarUnidadesMedidaResult = value;
    }

}
