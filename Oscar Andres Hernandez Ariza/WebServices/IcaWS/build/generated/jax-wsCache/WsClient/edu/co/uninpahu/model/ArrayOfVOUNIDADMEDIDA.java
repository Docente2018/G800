
package edu.co.uninpahu.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfVO_UNIDAD_MEDIDA complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVO_UNIDAD_MEDIDA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VO_UNIDAD_MEDIDA" type="{http://microsoft.com/}VO_UNIDAD_MEDIDA" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVO_UNIDAD_MEDIDA", propOrder = {
    "vounidadmedida"
})
public class ArrayOfVOUNIDADMEDIDA {

    @XmlElement(name = "VO_UNIDAD_MEDIDA", nillable = true)
    protected List<VOUNIDADMEDIDA> vounidadmedida;

    /**
     * Gets the value of the vounidadmedida property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vounidadmedida property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVOUNIDADMEDIDA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VOUNIDADMEDIDA }
     * 
     * 
     */
    public List<VOUNIDADMEDIDA> getVOUNIDADMEDIDA() {
        if (vounidadmedida == null) {
            vounidadmedida = new ArrayList<VOUNIDADMEDIDA>();
        }
        return this.vounidadmedida;
    }

}
