
package edu.co.uninpahu.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VO_VE_TRANSPORTADORA complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VO_VE_TRANSPORTADORA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_transportadora" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nit_transportadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultadoConsulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VO_VE_TRANSPORTADORA", propOrder = {
    "idTransportadora",
    "nombre",
    "nitTransportadora",
    "resultadoConsulta"
})
public class VOVETRANSPORTADORA {

    @XmlElement(name = "id_transportadora")
    protected int idTransportadora;
    protected String nombre;
    @XmlElement(name = "nit_transportadora")
    protected String nitTransportadora;
    protected String resultadoConsulta;

    /**
     * Obtiene el valor de la propiedad idTransportadora.
     * 
     */
    public int getIdTransportadora() {
        return idTransportadora;
    }

    /**
     * Define el valor de la propiedad idTransportadora.
     * 
     */
    public void setIdTransportadora(int value) {
        this.idTransportadora = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad nitTransportadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNitTransportadora() {
        return nitTransportadora;
    }

    /**
     * Define el valor de la propiedad nitTransportadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNitTransportadora(String value) {
        this.nitTransportadora = value;
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
