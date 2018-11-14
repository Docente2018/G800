
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
 *         &lt;element name="consultarEmpaquesResult" type="{http://microsoft.com/}ArrayOfVO_EMPAQUES" minOccurs="0"/&gt;
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
    "consultarEmpaquesResult"
})
@XmlRootElement(name = "consultarEmpaquesResponse")
public class ConsultarEmpaquesResponse {

    protected ArrayOfVOEMPAQUES consultarEmpaquesResult;

    /**
     * Obtiene el valor de la propiedad consultarEmpaquesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOEMPAQUES }
     *     
     */
    public ArrayOfVOEMPAQUES getConsultarEmpaquesResult() {
        return consultarEmpaquesResult;
    }

    /**
     * Define el valor de la propiedad consultarEmpaquesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOEMPAQUES }
     *     
     */
    public void setConsultarEmpaquesResult(ArrayOfVOEMPAQUES value) {
        this.consultarEmpaquesResult = value;
    }

}
