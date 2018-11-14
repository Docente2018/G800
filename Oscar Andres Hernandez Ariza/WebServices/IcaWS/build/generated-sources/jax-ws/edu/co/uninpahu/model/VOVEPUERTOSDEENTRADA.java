
package edu.co.uninpahu.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VO_VE_PUERTOS_DE_ENTRADA complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VO_VE_PUERTOS_DE_ENTRADA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_puerto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre_puerto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "VO_VE_PUERTOS_DE_ENTRADA", propOrder = {
    "idPuerto",
    "nombrePuerto",
    "resultadoConsulta"
})
public class VOVEPUERTOSDEENTRADA {

    @XmlElement(name = "id_puerto")
    protected int idPuerto;
    @XmlElement(name = "nombre_puerto")
    protected String nombrePuerto;
    @XmlElement(name = "resultado_consulta")
    protected String resultadoConsulta;

    /**
     * Obtiene el valor de la propiedad idPuerto.
     * 
     */
    public int getIdPuerto() {
        return idPuerto;
    }

    /**
     * Define el valor de la propiedad idPuerto.
     * 
     */
    public void setIdPuerto(int value) {
        this.idPuerto = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePuerto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePuerto() {
        return nombrePuerto;
    }

    /**
     * Define el valor de la propiedad nombrePuerto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePuerto(String value) {
        this.nombrePuerto = value;
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
