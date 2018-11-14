
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
 *         &lt;element name="consultarTrasportadorasResult" type="{http://microsoft.com/}ArrayOfVO_VE_TRANSPORTADORA" minOccurs="0"/&gt;
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
    "consultarTrasportadorasResult"
})
@XmlRootElement(name = "consultarTrasportadorasResponse")
public class ConsultarTrasportadorasResponse {

    protected ArrayOfVOVETRANSPORTADORA consultarTrasportadorasResult;

    /**
     * Obtiene el valor de la propiedad consultarTrasportadorasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOVETRANSPORTADORA }
     *     
     */
    public ArrayOfVOVETRANSPORTADORA getConsultarTrasportadorasResult() {
        return consultarTrasportadorasResult;
    }

    /**
     * Define el valor de la propiedad consultarTrasportadorasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOVETRANSPORTADORA }
     *     
     */
    public void setConsultarTrasportadorasResult(ArrayOfVOVETRANSPORTADORA value) {
        this.consultarTrasportadorasResult = value;
    }

}
