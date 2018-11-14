
package edu.co.uninpahu.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfVO_PUERTOS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVO_PUERTOS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VO_PUERTOS" type="{http://microsoft.com/}VO_PUERTOS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVO_PUERTOS", propOrder = {
    "vopuertos"
})
public class ArrayOfVOPUERTOS {

    @XmlElement(name = "VO_PUERTOS", nillable = true)
    protected List<VOPUERTOS> vopuertos;

    /**
     * Gets the value of the vopuertos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vopuertos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVOPUERTOS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VOPUERTOS }
     * 
     * 
     */
    public List<VOPUERTOS> getVOPUERTOS() {
        if (vopuertos == null) {
            vopuertos = new ArrayList<VOPUERTOS>();
        }
        return this.vopuertos;
    }

}
