
package edu.co.uninpahu.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para VO_AUTORIZACION_FITOSANITARIA complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VO_AUTORIZACION_FITOSANITARIA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_importador_exportador" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="id_destinatario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_pais" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_puertos_de_entrada" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_transportadora" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="guia_aerea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_despacho" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="fecha_validez_desde" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="fecha_validez_hasta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="id_especie" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_puertos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bouquets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="num_bouquets" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="n_identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ip_equipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_aerolinea" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_asistente_comercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detallesConstancia" type="{http://microsoft.com/}ArrayOfVO_VE_AUT_FITO_DETALLES" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VO_AUTORIZACION_FITOSANITARIA", propOrder = {
    "idImportadorExportador",
    "fecha",
    "idDestinatario",
    "idPais",
    "idPuertosDeEntrada",
    "idTransportadora",
    "guiaAerea",
    "fechaDespacho",
    "fechaValidezDesde",
    "fechaValidezHasta",
    "idEspecie",
    "idPuertos",
    "bouquets",
    "numBouquets",
    "nIdentificacion",
    "usuario",
    "contrasena",
    "ipEquipo",
    "idAerolinea",
    "idAsistenteComercial",
    "detallesConstancia"
})
public class VOAUTORIZACIONFITOSANITARIA {

    @XmlElement(name = "id_importador_exportador")
    protected int idImportadorExportador;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "id_destinatario")
    protected int idDestinatario;
    @XmlElement(name = "id_pais")
    protected int idPais;
    @XmlElement(name = "id_puertos_de_entrada")
    protected int idPuertosDeEntrada;
    @XmlElement(name = "id_transportadora")
    protected int idTransportadora;
    @XmlElement(name = "guia_aerea")
    protected String guiaAerea;
    @XmlElement(name = "fecha_despacho", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDespacho;
    @XmlElement(name = "fecha_validez_desde", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaValidezDesde;
    @XmlElement(name = "fecha_validez_hasta", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaValidezHasta;
    @XmlElement(name = "id_especie")
    protected int idEspecie;
    @XmlElement(name = "id_puertos")
    protected int idPuertos;
    protected String bouquets;
    @XmlElement(name = "num_bouquets")
    protected long numBouquets;
    @XmlElement(name = "n_identificacion")
    protected String nIdentificacion;
    protected String usuario;
    protected String contrasena;
    @XmlElement(name = "ip_equipo")
    protected String ipEquipo;
    @XmlElement(name = "id_aerolinea")
    protected int idAerolinea;
    @XmlElement(name = "id_asistente_comercial")
    protected String idAsistenteComercial;
    protected ArrayOfVOVEAUTFITODETALLES detallesConstancia;

    /**
     * Obtiene el valor de la propiedad idImportadorExportador.
     * 
     */
    public int getIdImportadorExportador() {
        return idImportadorExportador;
    }

    /**
     * Define el valor de la propiedad idImportadorExportador.
     * 
     */
    public void setIdImportadorExportador(int value) {
        this.idImportadorExportador = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

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
     * Obtiene el valor de la propiedad idPais.
     * 
     */
    public int getIdPais() {
        return idPais;
    }

    /**
     * Define el valor de la propiedad idPais.
     * 
     */
    public void setIdPais(int value) {
        this.idPais = value;
    }

    /**
     * Obtiene el valor de la propiedad idPuertosDeEntrada.
     * 
     */
    public int getIdPuertosDeEntrada() {
        return idPuertosDeEntrada;
    }

    /**
     * Define el valor de la propiedad idPuertosDeEntrada.
     * 
     */
    public void setIdPuertosDeEntrada(int value) {
        this.idPuertosDeEntrada = value;
    }

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
     * Obtiene el valor de la propiedad guiaAerea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuiaAerea() {
        return guiaAerea;
    }

    /**
     * Define el valor de la propiedad guiaAerea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuiaAerea(String value) {
        this.guiaAerea = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDespacho.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDespacho() {
        return fechaDespacho;
    }

    /**
     * Define el valor de la propiedad fechaDespacho.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDespacho(XMLGregorianCalendar value) {
        this.fechaDespacho = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaValidezDesde.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaValidezDesde() {
        return fechaValidezDesde;
    }

    /**
     * Define el valor de la propiedad fechaValidezDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaValidezDesde(XMLGregorianCalendar value) {
        this.fechaValidezDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaValidezHasta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaValidezHasta() {
        return fechaValidezHasta;
    }

    /**
     * Define el valor de la propiedad fechaValidezHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaValidezHasta(XMLGregorianCalendar value) {
        this.fechaValidezHasta = value;
    }

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
     * Obtiene el valor de la propiedad idPuertos.
     * 
     */
    public int getIdPuertos() {
        return idPuertos;
    }

    /**
     * Define el valor de la propiedad idPuertos.
     * 
     */
    public void setIdPuertos(int value) {
        this.idPuertos = value;
    }

    /**
     * Obtiene el valor de la propiedad bouquets.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBouquets() {
        return bouquets;
    }

    /**
     * Define el valor de la propiedad bouquets.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBouquets(String value) {
        this.bouquets = value;
    }

    /**
     * Obtiene el valor de la propiedad numBouquets.
     * 
     */
    public long getNumBouquets() {
        return numBouquets;
    }

    /**
     * Define el valor de la propiedad numBouquets.
     * 
     */
    public void setNumBouquets(long value) {
        this.numBouquets = value;
    }

    /**
     * Obtiene el valor de la propiedad nIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIdentificacion() {
        return nIdentificacion;
    }

    /**
     * Define el valor de la propiedad nIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIdentificacion(String value) {
        this.nIdentificacion = value;
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
     * Obtiene el valor de la propiedad idAerolinea.
     * 
     */
    public int getIdAerolinea() {
        return idAerolinea;
    }

    /**
     * Define el valor de la propiedad idAerolinea.
     * 
     */
    public void setIdAerolinea(int value) {
        this.idAerolinea = value;
    }

    /**
     * Obtiene el valor de la propiedad idAsistenteComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAsistenteComercial() {
        return idAsistenteComercial;
    }

    /**
     * Define el valor de la propiedad idAsistenteComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAsistenteComercial(String value) {
        this.idAsistenteComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad detallesConstancia.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOVEAUTFITODETALLES }
     *     
     */
    public ArrayOfVOVEAUTFITODETALLES getDetallesConstancia() {
        return detallesConstancia;
    }

    /**
     * Define el valor de la propiedad detallesConstancia.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOVEAUTFITODETALLES }
     *     
     */
    public void setDetallesConstancia(ArrayOfVOVEAUTFITODETALLES value) {
        this.detallesConstancia = value;
    }

}
