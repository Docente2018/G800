
package edu.co.uninpahu.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VO_VE_AUT_FITO_DETALLES complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VO_VE_AUT_FITO_DETALLES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_cultivo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_asistente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_producto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="det_cantidadUnidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_uMedida" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_empaque" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="det_cantidadEmpaques" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="det_valorFOB" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="id_presentacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VO_VE_AUT_FITO_DETALLES", propOrder = {
    "idCultivo",
    "idAsistente",
    "idProducto",
    "detCantidadUnidades",
    "idUMedida",
    "idEmpaque",
    "detCantidadEmpaques",
    "detValorFOB",
    "idPresentacion"
})
public class VOVEAUTFITODETALLES {

    @XmlElement(name = "id_cultivo")
    protected int idCultivo;
    @XmlElement(name = "id_asistente")
    protected int idAsistente;
    @XmlElement(name = "id_producto")
    protected int idProducto;
    @XmlElement(name = "det_cantidadUnidades")
    protected int detCantidadUnidades;
    @XmlElement(name = "id_uMedida")
    protected int idUMedida;
    @XmlElement(name = "id_empaque")
    protected int idEmpaque;
    @XmlElement(name = "det_cantidadEmpaques")
    protected float detCantidadEmpaques;
    @XmlElement(name = "det_valorFOB")
    protected float detValorFOB;
    @XmlElement(name = "id_presentacion")
    protected int idPresentacion;

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
     * Obtiene el valor de la propiedad idAsistente.
     * 
     */
    public int getIdAsistente() {
        return idAsistente;
    }

    /**
     * Define el valor de la propiedad idAsistente.
     * 
     */
    public void setIdAsistente(int value) {
        this.idAsistente = value;
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

    /**
     * Obtiene el valor de la propiedad detCantidadUnidades.
     * 
     */
    public int getDetCantidadUnidades() {
        return detCantidadUnidades;
    }

    /**
     * Define el valor de la propiedad detCantidadUnidades.
     * 
     */
    public void setDetCantidadUnidades(int value) {
        this.detCantidadUnidades = value;
    }

    /**
     * Obtiene el valor de la propiedad idUMedida.
     * 
     */
    public int getIdUMedida() {
        return idUMedida;
    }

    /**
     * Define el valor de la propiedad idUMedida.
     * 
     */
    public void setIdUMedida(int value) {
        this.idUMedida = value;
    }

    /**
     * Obtiene el valor de la propiedad idEmpaque.
     * 
     */
    public int getIdEmpaque() {
        return idEmpaque;
    }

    /**
     * Define el valor de la propiedad idEmpaque.
     * 
     */
    public void setIdEmpaque(int value) {
        this.idEmpaque = value;
    }

    /**
     * Obtiene el valor de la propiedad detCantidadEmpaques.
     * 
     */
    public float getDetCantidadEmpaques() {
        return detCantidadEmpaques;
    }

    /**
     * Define el valor de la propiedad detCantidadEmpaques.
     * 
     */
    public void setDetCantidadEmpaques(float value) {
        this.detCantidadEmpaques = value;
    }

    /**
     * Obtiene el valor de la propiedad detValorFOB.
     * 
     */
    public float getDetValorFOB() {
        return detValorFOB;
    }

    /**
     * Define el valor de la propiedad detValorFOB.
     * 
     */
    public void setDetValorFOB(float value) {
        this.detValorFOB = value;
    }

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

}
