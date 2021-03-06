
package edu.co.uninpahu.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="consultar_PresentacionesResult" type="{http://microsoft.com/}ArrayOfVO_IV_PRESENTACIONES" minOccurs="0"/&gt;
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
    "consultarPresentacionesResult"
})
@XmlRootElement(name = "consultar_PresentacionesResponse")
public class ConsultarPresentacionesResponse {

    @XmlElement(name = "consultar_PresentacionesResult")
    protected ArrayOfVOIVPRESENTACIONES consultarPresentacionesResult;

    /**
     * Obtiene el valor de la propiedad consultarPresentacionesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOIVPRESENTACIONES }
     *     
     */
    public ArrayOfVOIVPRESENTACIONES getConsultarPresentacionesResult() {
        return consultarPresentacionesResult;
    }

    /**
     * Define el valor de la propiedad consultarPresentacionesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOIVPRESENTACIONES }
     *     
     */
    public void setConsultarPresentacionesResult(ArrayOfVOIVPRESENTACIONES value) {
        this.consultarPresentacionesResult = value;
    }

}
