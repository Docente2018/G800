
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
 *         &lt;element name="consultarProductosPorEspeciesResult" type="{http://microsoft.com/}ArrayOfVO_ESPECIES_O_PRODUCTOS_AGRICOLAS" minOccurs="0"/>
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
    "consultarProductosPorEspeciesResult"
})
@XmlRootElement(name = "consultarProductosPorEspeciesResponse")
public class ConsultarProductosPorEspeciesResponse {

    protected ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS consultarProductosPorEspeciesResult;

    /**
     * Obtiene el valor de la propiedad consultarProductosPorEspeciesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS }
     *     
     */
    public ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS getConsultarProductosPorEspeciesResult() {
        return consultarProductosPorEspeciesResult;
    }

    /**
     * Define el valor de la propiedad consultarProductosPorEspeciesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS }
     *     
     */
    public void setConsultarProductosPorEspeciesResult(ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS value) {
        this.consultarProductosPorEspeciesResult = value;
    }

}
