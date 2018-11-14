
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
 *         &lt;element name="consultarCultivosResult" type="{http://microsoft.com/}ArrayOfVO_VE_EXPORTADOR_CULTIVO" minOccurs="0"/>
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
    "consultarCultivosResult"
})
@XmlRootElement(name = "consultarCultivosResponse")
public class ConsultarCultivosResponse {

    protected ArrayOfVOVEEXPORTADORCULTIVO consultarCultivosResult;

    /**
     * Obtiene el valor de la propiedad consultarCultivosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOVEEXPORTADORCULTIVO }
     *     
     */
    public ArrayOfVOVEEXPORTADORCULTIVO getConsultarCultivosResult() {
        return consultarCultivosResult;
    }

    /**
     * Define el valor de la propiedad consultarCultivosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOVEEXPORTADORCULTIVO }
     *     
     */
    public void setConsultarCultivosResult(ArrayOfVOVEEXPORTADORCULTIVO value) {
        this.consultarCultivosResult = value;
    }

}
