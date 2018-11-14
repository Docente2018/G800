
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
 *         &lt;element name="consultarAerolineasResult" type="{http://microsoft.com/}ArrayOfVO_AEROLINEA" minOccurs="0"/&gt;
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
    "consultarAerolineasResult"
})
@XmlRootElement(name = "consultarAerolineasResponse")
public class ConsultarAerolineasResponse {

    protected ArrayOfVOAEROLINEA consultarAerolineasResult;

    /**
     * Obtiene el valor de la propiedad consultarAerolineasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOAEROLINEA }
     *     
     */
    public ArrayOfVOAEROLINEA getConsultarAerolineasResult() {
        return consultarAerolineasResult;
    }

    /**
     * Define el valor de la propiedad consultarAerolineasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOAEROLINEA }
     *     
     */
    public void setConsultarAerolineasResult(ArrayOfVOAEROLINEA value) {
        this.consultarAerolineasResult = value;
    }

}
