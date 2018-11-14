
package edu.co.uninpahu.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VO_ASISTENTE_COMERCIAL complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VO_ASISTENTE_COMERCIAL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_asistente_comercial" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre_asistente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellido_asistente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cedula" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="tarjeta_profesional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "VO_ASISTENTE_COMERCIAL", propOrder = {
    "idAsistenteComercial",
    "nombreAsistente",
    "apellidoAsistente",
    "cedula",
    "tarjetaProfesional",
    "direccion",
    "telefono",
    "fax",
    "correo",
    "resultadoConsulta"
})
public class VOASISTENTECOMERCIAL {

    @XmlElement(name = "id_asistente_comercial")
    protected int idAsistenteComercial;
    @XmlElement(name = "nombre_asistente")
    protected String nombreAsistente;
    @XmlElement(name = "apellido_asistente")
    protected String apellidoAsistente;
    protected long cedula;
    @XmlElement(name = "tarjeta_profesional")
    protected String tarjetaProfesional;
    protected String direccion;
    protected String telefono;
    protected String fax;
    protected String correo;
    protected String resultadoConsulta;

    /**
     * Obtiene el valor de la propiedad idAsistenteComercial.
     * 
     */
    public int getIdAsistenteComercial() {
        return idAsistenteComercial;
    }

    /**
     * Define el valor de la propiedad idAsistenteComercial.
     * 
     */
    public void setIdAsistenteComercial(int value) {
        this.idAsistenteComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAsistente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAsistente() {
        return nombreAsistente;
    }

    /**
     * Define el valor de la propiedad nombreAsistente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAsistente(String value) {
        this.nombreAsistente = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoAsistente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoAsistente() {
        return apellidoAsistente;
    }

    /**
     * Define el valor de la propiedad apellidoAsistente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoAsistente(String value) {
        this.apellidoAsistente = value;
    }

    /**
     * Obtiene el valor de la propiedad cedula.
     * 
     */
    public long getCedula() {
        return cedula;
    }

    /**
     * Define el valor de la propiedad cedula.
     * 
     */
    public void setCedula(long value) {
        this.cedula = value;
    }

    /**
     * Obtiene el valor de la propiedad tarjetaProfesional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    /**
     * Define el valor de la propiedad tarjetaProfesional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarjetaProfesional(String value) {
        this.tarjetaProfesional = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad fax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Define el valor de la propiedad fax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
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
