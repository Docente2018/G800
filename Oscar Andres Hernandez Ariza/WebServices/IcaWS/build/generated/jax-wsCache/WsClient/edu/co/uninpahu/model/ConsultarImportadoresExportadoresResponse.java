
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
 *         &lt;element name="consultarImportadoresExportadoresResult" type="{http://microsoft.com/}ArrayOfVO_IMPORTADORESEXPORTADORES" minOccurs="0"/&gt;
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
    "consultarImportadoresExportadoresResult"
})
@XmlRootElement(name = "consultarImportadoresExportadoresResponse")
public class ConsultarImportadoresExportadoresResponse {

    protected ArrayOfVOIMPORTADORESEXPORTADORES consultarImportadoresExportadoresResult;

    /**
     * Obtiene el valor de la propiedad consultarImportadoresExportadoresResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOIMPORTADORESEXPORTADORES }
     *     
     */
    public ArrayOfVOIMPORTADORESEXPORTADORES getConsultarImportadoresExportadoresResult() {
        return consultarImportadoresExportadoresResult;
    }

    /**
     * Define el valor de la propiedad consultarImportadoresExportadoresResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOIMPORTADORESEXPORTADORES }
     *     
     */
    public void setConsultarImportadoresExportadoresResult(ArrayOfVOIMPORTADORESEXPORTADORES value) {
        this.consultarImportadoresExportadoresResult = value;
    }

}
