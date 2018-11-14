
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
 *         &lt;element name="crearCostancia_desdeXMLResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "crearCostanciaDesdeXMLResult"
})
@XmlRootElement(name = "crearCostancia_desdeXMLResponse")
public class CrearCostanciaDesdeXMLResponse {

    @XmlElement(name = "crearCostancia_desdeXMLResult")
    protected String crearCostanciaDesdeXMLResult;

    /**
     * Obtiene el valor de la propiedad crearCostanciaDesdeXMLResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrearCostanciaDesdeXMLResult() {
        return crearCostanciaDesdeXMLResult;
    }

    /**
     * Define el valor de la propiedad crearCostanciaDesdeXMLResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrearCostanciaDesdeXMLResult(String value) {
        this.crearCostanciaDesdeXMLResult = value;
    }

}
