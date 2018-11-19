
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
 *         &lt;element name="consultarDestinatariosResult" type="{http://microsoft.com/}ArrayOfVO_VE_EXPORTADOR_DESTINATARIO" minOccurs="0"/>
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
    "consultarDestinatariosResult"
})
@XmlRootElement(name = "consultarDestinatariosResponse")
public class ConsultarDestinatariosResponse {

    protected ArrayOfVOVEEXPORTADORDESTINATARIO consultarDestinatariosResult;

    /**
     * Obtiene el valor de la propiedad consultarDestinatariosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOVEEXPORTADORDESTINATARIO }
     *     
     */
    public ArrayOfVOVEEXPORTADORDESTINATARIO getConsultarDestinatariosResult() {
        return consultarDestinatariosResult;
    }

    /**
     * Define el valor de la propiedad consultarDestinatariosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOVEEXPORTADORDESTINATARIO }
     *     
     */
    public void setConsultarDestinatariosResult(ArrayOfVOVEEXPORTADORDESTINATARIO value) {
        this.consultarDestinatariosResult = value;
    }

}