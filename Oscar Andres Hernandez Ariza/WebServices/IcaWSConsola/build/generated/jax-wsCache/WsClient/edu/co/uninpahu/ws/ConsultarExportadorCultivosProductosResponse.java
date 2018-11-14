
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
 *         &lt;element name="consultarExportadorCultivos_ProductosResult" type="{http://microsoft.com/}ArrayOfVO_EXPCULTIVO_ASIST_PROD" minOccurs="0"/>
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
    "consultarExportadorCultivosProductosResult"
})
@XmlRootElement(name = "consultarExportadorCultivos_ProductosResponse")
public class ConsultarExportadorCultivosProductosResponse {

    @XmlElement(name = "consultarExportadorCultivos_ProductosResult")
    protected ArrayOfVOEXPCULTIVOASISTPROD consultarExportadorCultivosProductosResult;

    /**
     * Obtiene el valor de la propiedad consultarExportadorCultivosProductosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOEXPCULTIVOASISTPROD }
     *     
     */
    public ArrayOfVOEXPCULTIVOASISTPROD getConsultarExportadorCultivosProductosResult() {
        return consultarExportadorCultivosProductosResult;
    }

    /**
     * Define el valor de la propiedad consultarExportadorCultivosProductosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOEXPCULTIVOASISTPROD }
     *     
     */
    public void setConsultarExportadorCultivosProductosResult(ArrayOfVOEXPCULTIVOASISTPROD value) {
        this.consultarExportadorCultivosProductosResult = value;
    }

}
