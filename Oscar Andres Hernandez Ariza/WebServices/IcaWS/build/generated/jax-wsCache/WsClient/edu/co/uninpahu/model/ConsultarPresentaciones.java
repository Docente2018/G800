
package edu.co.uninpahu.model;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ip_equipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_imp_exp" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_producto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "usuario",
    "contrasena",
    "ipEquipo",
    "idImpExp",
    "idProducto"
})
@XmlRootElement(name = "consultar_Presentaciones")
public class ConsultarPresentaciones {

    protected String usuario;
    protected String contrasena;
    @XmlElement(name = "ip_equipo")
    protected String ipEquipo;
    @XmlElement(name = "id_imp_exp")
    protected int idImpExp;
    @XmlElement(name = "id_producto")
    protected int idProducto;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Define el valor de la propiedad contrasena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasena(String value) {
        this.contrasena = value;
    }

    /**
     * Obtiene el valor de la propiedad ipEquipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpEquipo() {
        return ipEquipo;
    }

    /**
     * Define el valor de la propiedad ipEquipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpEquipo(String value) {
        this.ipEquipo = value;
    }

    /**
     * Obtiene el valor de la propiedad idImpExp.
     * 
     */
    public int getIdImpExp() {
        return idImpExp;
    }

    /**
     * Define el valor de la propiedad idImpExp.
     * 
     */
    public void setIdImpExp(int value) {
        this.idImpExp = value;
    }

    /**
     * Obtiene el valor de la propiedad idProducto.
     * 
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Define el valor de la propiedad idProducto.
     * 
     */
    public void setIdProducto(int value) {
        this.idProducto = value;
    }

}
