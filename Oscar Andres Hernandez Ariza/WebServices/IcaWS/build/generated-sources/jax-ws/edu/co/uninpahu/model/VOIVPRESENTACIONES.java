
package edu.co.uninpahu.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VO_IV_PRESENTACIONES complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VO_IV_PRESENTACIONES"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_presentacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="presentacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultado_consulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VO_IV_PRESENTACIONES", propOrder = {
    "idPresentacion",
    "presentacion",
    "resultadoConsulta"
})
public class VOIVPRESENTACIONES {

    @XmlElement(name = "id_presentacion")
    protected int idPresentacion;
    protected String presentacion;
    @XmlElement(name = "resultado_consulta")
    protected String resultadoConsulta;

    /**
     * Obtiene el valor de la propiedad idPresentacion.
     * 
     */
    public int getIdPresentacion() {
        return idPresentacion;
    }

    /**
     * Define el valor de la propiedad idPresentacion.
     * 
     */
    public void setIdPresentacion(int value) {
        this.idPresentacion = value;
    }

    /**
     * Obtiene el valor de la propiedad presentacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentacion() {
        return presentacion;
    }

    /**
     * Define el valor de la propiedad presentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentacion(String value) {
        this.presentacion = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoConsulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoConsulta() {
        return resultadoConsulta;
    }

    /**
     * Define el valor de la propiedad resultadoConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoConsulta(String value) {
        this.resultadoConsulta = value;
    }

}
