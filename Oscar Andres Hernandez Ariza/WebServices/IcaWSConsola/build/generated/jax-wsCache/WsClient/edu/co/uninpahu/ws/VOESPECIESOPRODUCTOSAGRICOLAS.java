
package edu.co.uninpahu.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VO_ESPECIES_O_PRODUCTOS_AGRICOLAS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VO_ESPECIES_O_PRODUCTOS_AGRICOLAS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="presentaciones" type="{http://microsoft.com/}ArrayOfVO_IV_PRESENTACIONES" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "VO_ESPECIES_O_PRODUCTOS_AGRICOLAS", propOrder = {
    "presentaciones",
    "id",
    "descripcion",
    "resultadoConsulta"
})
public class VOESPECIESOPRODUCTOSAGRICOLAS {

    protected ArrayOfVOIVPRESENTACIONES presentaciones;
    protected int id;
    protected String descripcion;
    protected String resultadoConsulta;

    /**
     * Obtiene el valor de la propiedad presentaciones.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOIVPRESENTACIONES }
     *     
     */
    public ArrayOfVOIVPRESENTACIONES getPresentaciones() {
        return presentaciones;
    }

    /**
     * Define el valor de la propiedad presentaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOIVPRESENTACIONES }
     *     
     */
    public void setPresentaciones(ArrayOfVOIVPRESENTACIONES value) {
        this.presentaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
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
