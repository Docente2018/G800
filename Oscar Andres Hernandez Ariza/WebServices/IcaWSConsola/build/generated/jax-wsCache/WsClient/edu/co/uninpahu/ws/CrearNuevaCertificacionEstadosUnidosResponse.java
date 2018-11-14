
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
 *         &lt;element name="CrearNuevaCertificacionEstadosUnidosResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "crearNuevaCertificacionEstadosUnidosResult"
})
@XmlRootElement(name = "CrearNuevaCertificacionEstadosUnidosResponse")
public class CrearNuevaCertificacionEstadosUnidosResponse {

    @XmlElement(name = "CrearNuevaCertificacionEstadosUnidosResult")
    protected String crearNuevaCertificacionEstadosUnidosResult;

    /**
     * Obtiene el valor de la propiedad crearNuevaCertificacionEstadosUnidosResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrearNuevaCertificacionEstadosUnidosResult() {
        return crearNuevaCertificacionEstadosUnidosResult;
    }

    /**
     * Define el valor de la propiedad crearNuevaCertificacionEstadosUnidosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrearNuevaCertificacionEstadosUnidosResult(String value) {
        this.crearNuevaCertificacionEstadosUnidosResult = value;
    }

}
