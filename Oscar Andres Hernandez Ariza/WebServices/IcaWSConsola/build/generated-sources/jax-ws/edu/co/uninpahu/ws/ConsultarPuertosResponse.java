
package edu.co.uninpahu.ws;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consultarPuertosResult" type="{http://microsoft.com/}ArrayOfVO_PUERTOS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consultarPuertosResult"
})
@XmlRootElement(name = "consultarPuertosResponse")
public class ConsultarPuertosResponse {

    protected ArrayOfVOPUERTOS consultarPuertosResult;

    /**
     * Obtiene el valor de la propiedad consultarPuertosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOPUERTOS }
     *     
     */
    public ArrayOfVOPUERTOS getConsultarPuertosResult() {
        return consultarPuertosResult;
    }

    /**
     * Define el valor de la propiedad consultarPuertosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOPUERTOS }
     *     
     */
    public void setConsultarPuertosResult(ArrayOfVOPUERTOS value) {
        this.consultarPuertosResult = value;
    }

}
