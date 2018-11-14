
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
 *         &lt;element name="id_especie" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_cultivo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_imp_exp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contraseña" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ip_equipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idEspecie",
    "idCultivo",
    "idImpExp",
    "usuario",
    "contrase\u00f1a",
    "ipEquipo"
})
@XmlRootElement(name = "consultarProductosPorEspecies")
public class ConsultarProductosPorEspecies {

    @XmlElement(name = "id_especie")
    protected int idEspecie;
    @XmlElement(name = "id_cultivo")
    protected int idCultivo;
    @XmlElement(name = "id_imp_exp")
    protected int idImpExp;
    protected String usuario;
    protected String contraseña;
    @XmlElement(name = "ip_equipo")
    protected String ipEquipo;

    /**
     * Obtiene el valor de la propiedad idEspecie.
     * 
     */
    public int getIdEspecie() {
        return idEspecie;
    }

    /**
     * Define el valor de la propiedad idEspecie.
     * 
     */
    public void setIdEspecie(int value) {
        this.idEspecie = value;
    }

    /**
     * Obtiene el valor de la propiedad idCultivo.
     * 
     */
    public int getIdCultivo() {
        return idCultivo;
    }

    /**
     * Define el valor de la propiedad idCultivo.
     * 
     */
    public void setIdCultivo(int value) {
        this.idCultivo = value;
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
     * Obtiene el valor de la propiedad contraseña.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Define el valor de la propiedad contraseña.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContraseña(String value) {
        this.contraseña = value;
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

}
