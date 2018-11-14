
package edu.co.uninpahu.ws;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consultarDestinatarios_PaisesResult" type="{http://microsoft.com/}ArrayOfVO_DEST_PAIS" minOccurs="0"/>
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
    "consultarDestinatariosPaisesResult"
})
@XmlRootElement(name = "consultarDestinatarios_PaisesResponse")
public class ConsultarDestinatariosPaisesResponse {

    @XmlElement(name = "consultarDestinatarios_PaisesResult")
    protected ArrayOfVODESTPAIS consultarDestinatariosPaisesResult;

    /**
     * Obtiene el valor de la propiedad consultarDestinatariosPaisesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVODESTPAIS }
     *     
     */
    public ArrayOfVODESTPAIS getConsultarDestinatariosPaisesResult() {
        return consultarDestinatariosPaisesResult;
    }

    /**
     * Define el valor de la propiedad consultarDestinatariosPaisesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVODESTPAIS }
     *     
     */
    public void setConsultarDestinatariosPaisesResult(ArrayOfVODESTPAIS value) {
        this.consultarDestinatariosPaisesResult = value;
    }

}
