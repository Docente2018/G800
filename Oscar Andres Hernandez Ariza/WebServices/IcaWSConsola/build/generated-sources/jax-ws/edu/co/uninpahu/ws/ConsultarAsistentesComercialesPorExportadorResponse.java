
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
 *         &lt;element name="consultarAsistentesComercialesPorExportadorResult" type="{http://microsoft.com/}ArrayOfVO_ASISTENTE_COMERCIAL" minOccurs="0"/>
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
    "consultarAsistentesComercialesPorExportadorResult"
})
@XmlRootElement(name = "consultarAsistentesComercialesPorExportadorResponse")
public class ConsultarAsistentesComercialesPorExportadorResponse {

    protected ArrayOfVOASISTENTECOMERCIAL consultarAsistentesComercialesPorExportadorResult;

    /**
     * Obtiene el valor de la propiedad consultarAsistentesComercialesPorExportadorResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOASISTENTECOMERCIAL }
     *     
     */
    public ArrayOfVOASISTENTECOMERCIAL getConsultarAsistentesComercialesPorExportadorResult() {
        return consultarAsistentesComercialesPorExportadorResult;
    }

    /**
     * Define el valor de la propiedad consultarAsistentesComercialesPorExportadorResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOASISTENTECOMERCIAL }
     *     
     */
    public void setConsultarAsistentesComercialesPorExportadorResult(ArrayOfVOASISTENTECOMERCIAL value) {
        this.consultarAsistentesComercialesPorExportadorResult = value;
    }

}
