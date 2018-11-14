
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
 *         &lt;element name="constancia" type="{http://microsoft.com/}VO_AUTORIZACION_FITOSANITARIA" minOccurs="0"/>
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
    "constancia"
})
@XmlRootElement(name = "CrearNuevaCertificacionEstadosUnidos")
public class CrearNuevaCertificacionEstadosUnidos {

    protected VOAUTORIZACIONFITOSANITARIA constancia;

    /**
     * Obtiene el valor de la propiedad constancia.
     * 
     * @return
     *     possible object is
     *     {@link VOAUTORIZACIONFITOSANITARIA }
     *     
     */
    public VOAUTORIZACIONFITOSANITARIA getConstancia() {
        return constancia;
    }

    /**
     * Define el valor de la propiedad constancia.
     * 
     * @param value
     *     allowed object is
     *     {@link VOAUTORIZACIONFITOSANITARIA }
     *     
     */
    public void setConstancia(VOAUTORIZACIONFITOSANITARIA value) {
        this.constancia = value;
    }

}
