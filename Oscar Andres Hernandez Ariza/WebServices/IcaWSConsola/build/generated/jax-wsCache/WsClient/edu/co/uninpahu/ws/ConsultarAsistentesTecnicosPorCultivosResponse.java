
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
 *         &lt;element name="consultarAsistentesTecnicosPorCultivosResult" type="{http://microsoft.com/}ArrayOfVO_VE_ASISTENTE_TECNICO" minOccurs="0"/>
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
    "consultarAsistentesTecnicosPorCultivosResult"
})
@XmlRootElement(name = "consultarAsistentesTecnicosPorCultivosResponse")
public class ConsultarAsistentesTecnicosPorCultivosResponse {

    protected ArrayOfVOVEASISTENTETECNICO consultarAsistentesTecnicosPorCultivosResult;

    /**
     * Obtiene el valor de la propiedad consultarAsistentesTecnicosPorCultivosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOVEASISTENTETECNICO }
     *     
     */
    public ArrayOfVOVEASISTENTETECNICO getConsultarAsistentesTecnicosPorCultivosResult() {
        return consultarAsistentesTecnicosPorCultivosResult;
    }

    /**
     * Define el valor de la propiedad consultarAsistentesTecnicosPorCultivosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOVEASISTENTETECNICO }
     *     
     */
    public void setConsultarAsistentesTecnicosPorCultivosResult(ArrayOfVOVEASISTENTETECNICO value) {
        this.consultarAsistentesTecnicosPorCultivosResult = value;
    }

}
