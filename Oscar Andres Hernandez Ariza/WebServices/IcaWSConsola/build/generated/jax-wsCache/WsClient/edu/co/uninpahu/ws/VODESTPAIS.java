
package edu.co.uninpahu.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VO_DEST_PAIS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VO_DEST_PAIS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_destinatario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre_destinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listaPaises" type="{http://microsoft.com/}ArrayOfVO_PAISES" minOccurs="0"/>
 *         &lt;element name="resultadoConsulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VO_DEST_PAIS", propOrder = {
    "idDestinatario",
    "nombreDestinatario",
    "listaPaises",
    "resultadoConsulta"
})
public class VODESTPAIS {

    @XmlElement(name = "id_destinatario")
    protected int idDestinatario;
    @XmlElement(name = "nombre_destinatario")
    protected String nombreDestinatario;
    protected ArrayOfVOPAISES listaPaises;
    protected String resultadoConsulta;

    /**
     * Obtiene el valor de la propiedad idDestinatario.
     * 
     */
    public int getIdDestinatario() {
        return idDestinatario;
    }

    /**
     * Define el valor de la propiedad idDestinatario.
     * 
     */
    public void setIdDestinatario(int value) {
        this.idDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    /**
     * Define el valor de la propiedad nombreDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDestinatario(String value) {
        this.nombreDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad listaPaises.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOPAISES }
     *     
     */
    public ArrayOfVOPAISES getListaPaises() {
        return listaPaises;
    }

    /**
     * Define el valor de la propiedad listaPaises.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOPAISES }
     *     
     */
    public void setListaPaises(ArrayOfVOPAISES value) {
        this.listaPaises = value;
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
