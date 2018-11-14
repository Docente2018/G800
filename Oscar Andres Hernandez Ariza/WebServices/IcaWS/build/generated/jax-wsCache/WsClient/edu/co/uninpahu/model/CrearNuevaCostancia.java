
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
 *         &lt;element name="datosConstancia" type="{http://microsoft.com/}VO_AUTORIZACION_FITOSANITARIA" minOccurs="0"/&gt;
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
    "datosConstancia"
})
@XmlRootElement(name = "crear_nueva_Costancia")
public class CrearNuevaCostancia {

    protected VOAUTORIZACIONFITOSANITARIA datosConstancia;

    /**
     * Obtiene el valor de la propiedad datosConstancia.
     * 
     * @return
     *     possible object is
     *     {@link VOAUTORIZACIONFITOSANITARIA }
     *     
     */
    public VOAUTORIZACIONFITOSANITARIA getDatosConstancia() {
        return datosConstancia;
    }

    /**
     * Define el valor de la propiedad datosConstancia.
     * 
     * @param value
     *     allowed object is
     *     {@link VOAUTORIZACIONFITOSANITARIA }
     *     
     */
    public void setDatosConstancia(VOAUTORIZACIONFITOSANITARIA value) {
        this.datosConstancia = value;
    }

}
