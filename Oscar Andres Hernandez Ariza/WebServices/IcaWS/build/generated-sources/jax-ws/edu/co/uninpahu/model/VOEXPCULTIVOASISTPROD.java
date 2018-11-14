
package edu.co.uninpahu.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VO_EXPCULTIVO_ASIST_PROD complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VO_EXPCULTIVO_ASIST_PROD"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_cultivos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre_cultivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultado_prueba" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listaAsistenes" type="{http://microsoft.com/}ArrayOfVO_VE_ASISTENTE_TECNICO" minOccurs="0"/&gt;
 *         &lt;element name="listaProductos" type="{http://microsoft.com/}ArrayOfVO_ESPECIES_O_PRODUCTOS_AGRICOLAS" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VO_EXPCULTIVO_ASIST_PROD", propOrder = {
    "idCultivos",
    "nombreCultivo",
    "resultadoPrueba",
    "listaAsistenes",
    "listaProductos"
})
public class VOEXPCULTIVOASISTPROD {

    @XmlElement(name = "id_cultivos")
    protected int idCultivos;
    @XmlElement(name = "nombre_cultivo")
    protected String nombreCultivo;
    @XmlElement(name = "resultado_prueba")
    protected String resultadoPrueba;
    protected ArrayOfVOVEASISTENTETECNICO listaAsistenes;
    protected ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS listaProductos;

    /**
     * Obtiene el valor de la propiedad idCultivos.
     * 
     */
    public int getIdCultivos() {
        return idCultivos;
    }

    /**
     * Define el valor de la propiedad idCultivos.
     * 
     */
    public void setIdCultivos(int value) {
        this.idCultivos = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCultivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCultivo() {
        return nombreCultivo;
    }

    /**
     * Define el valor de la propiedad nombreCultivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCultivo(String value) {
        this.nombreCultivo = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoPrueba.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoPrueba() {
        return resultadoPrueba;
    }

    /**
     * Define el valor de la propiedad resultadoPrueba.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoPrueba(String value) {
        this.resultadoPrueba = value;
    }

    /**
     * Obtiene el valor de la propiedad listaAsistenes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOVEASISTENTETECNICO }
     *     
     */
    public ArrayOfVOVEASISTENTETECNICO getListaAsistenes() {
        return listaAsistenes;
    }

    /**
     * Define el valor de la propiedad listaAsistenes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOVEASISTENTETECNICO }
     *     
     */
    public void setListaAsistenes(ArrayOfVOVEASISTENTETECNICO value) {
        this.listaAsistenes = value;
    }

    /**
     * Obtiene el valor de la propiedad listaProductos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS }
     *     
     */
    public ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS getListaProductos() {
        return listaProductos;
    }

    /**
     * Define el valor de la propiedad listaProductos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS }
     *     
     */
    public void setListaProductos(ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS value) {
        this.listaProductos = value;
    }

}
