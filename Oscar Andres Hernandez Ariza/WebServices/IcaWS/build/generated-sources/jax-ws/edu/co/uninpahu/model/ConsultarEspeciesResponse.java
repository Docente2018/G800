
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
 *         &lt;element name="consultarEspeciesResult" type="{http://microsoft.com/}ArrayOfVO_ESPECIES_O_PRODUCTOS_AGRICOLAS" minOccurs="0"/&gt;
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
    "consultarEspeciesResult"
})
@XmlRootElement(name = "consultarEspeciesResponse")
public class ConsultarEspeciesResponse {

    protected ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS consultarEspeciesResult;

    /**
     * Obtiene el valor de la propiedad consultarEspeciesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS }
     *     
     */
    public ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS getConsultarEspeciesResult() {
        return consultarEspeciesResult;
    }

    /**
     * Define el valor de la propiedad consultarEspeciesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS }
     *     
     */
    public void setConsultarEspeciesResult(ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS value) {
        this.consultarEspeciesResult = value;
    }

}
