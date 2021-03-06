
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
 *         &lt;element name="consultarPaisesResult" type="{http://microsoft.com/}ArrayOfVO_PAISES" minOccurs="0"/>
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
    "consultarPaisesResult"
})
@XmlRootElement(name = "consultarPaisesResponse")
public class ConsultarPaisesResponse {

    protected ArrayOfVOPAISES consultarPaisesResult;

    /**
     * Obtiene el valor de la propiedad consultarPaisesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOPAISES }
     *     
     */
    public ArrayOfVOPAISES getConsultarPaisesResult() {
        return consultarPaisesResult;
    }

    /**
     * Define el valor de la propiedad consultarPaisesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOPAISES }
     *     
     */
    public void setConsultarPaisesResult(ArrayOfVOPAISES value) {
        this.consultarPaisesResult = value;
    }

}
