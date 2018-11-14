
package edu.co.uninpahu.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfVO_VE_EXPORTADOR_CULTIVO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVO_VE_EXPORTADOR_CULTIVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VO_VE_EXPORTADOR_CULTIVO" type="{http://microsoft.com/}VO_VE_EXPORTADOR_CULTIVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVO_VE_EXPORTADOR_CULTIVO", propOrder = {
    "voveexportadorcultivo"
})
public class ArrayOfVOVEEXPORTADORCULTIVO {

    @XmlElement(name = "VO_VE_EXPORTADOR_CULTIVO", nillable = true)
    protected List<VOVEEXPORTADORCULTIVO> voveexportadorcultivo;

    /**
     * Gets the value of the voveexportadorcultivo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voveexportadorcultivo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVOVEEXPORTADORCULTIVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VOVEEXPORTADORCULTIVO }
     * 
     * 
     */
    public List<VOVEEXPORTADORCULTIVO> getVOVEEXPORTADORCULTIVO() {
        if (voveexportadorcultivo == null) {
            voveexportadorcultivo = new ArrayList<VOVEEXPORTADORCULTIVO>();
        }
        return this.voveexportadorcultivo;
    }

}
