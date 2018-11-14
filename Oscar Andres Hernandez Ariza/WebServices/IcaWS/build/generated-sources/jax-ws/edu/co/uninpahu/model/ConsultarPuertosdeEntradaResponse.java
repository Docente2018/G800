
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
 *         &lt;element name="consultarPuertosdeEntradaResult" type="{http://microsoft.com/}ArrayOfVO_VE_PUERTOS_DE_ENTRADA" minOccurs="0"/&gt;
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
    "consultarPuertosdeEntradaResult"
})
@XmlRootElement(name = "consultarPuertosdeEntradaResponse")
public class ConsultarPuertosdeEntradaResponse {

    protected ArrayOfVOVEPUERTOSDEENTRADA consultarPuertosdeEntradaResult;

    /**
     * Obtiene el valor de la propiedad consultarPuertosdeEntradaResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOVEPUERTOSDEENTRADA }
     *     
     */
    public ArrayOfVOVEPUERTOSDEENTRADA getConsultarPuertosdeEntradaResult() {
        return consultarPuertosdeEntradaResult;
    }

    /**
     * Define el valor de la propiedad consultarPuertosdeEntradaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOVEPUERTOSDEENTRADA }
     *     
     */
    public void setConsultarPuertosdeEntradaResult(ArrayOfVOVEPUERTOSDEENTRADA value) {
        this.consultarPuertosdeEntradaResult = value;
    }

}
