
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
 *         &lt;element name="imprimirConstanciaResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
    "imprimirConstanciaResult"
})
@XmlRootElement(name = "imprimirConstanciaResponse")
public class ImprimirConstanciaResponse {

    protected byte[] imprimirConstanciaResult;

    /**
     * Obtiene el valor de la propiedad imprimirConstanciaResult.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImprimirConstanciaResult() {
        return imprimirConstanciaResult;
    }

    /**
     * Define el valor de la propiedad imprimirConstanciaResult.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImprimirConstanciaResult(byte[] value) {
        this.imprimirConstanciaResult = value;
    }

}
