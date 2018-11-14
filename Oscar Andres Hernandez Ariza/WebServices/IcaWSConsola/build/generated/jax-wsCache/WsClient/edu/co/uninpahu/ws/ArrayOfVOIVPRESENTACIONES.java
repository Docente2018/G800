
package edu.co.uninpahu.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfVO_IV_PRESENTACIONES complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVO_IV_PRESENTACIONES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VO_IV_PRESENTACIONES" type="{http://microsoft.com/}VO_IV_PRESENTACIONES" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVO_IV_PRESENTACIONES", propOrder = {
    "voivpresentaciones"
})
public class ArrayOfVOIVPRESENTACIONES {

    @XmlElement(name = "VO_IV_PRESENTACIONES", nillable = true)
    protected List<VOIVPRESENTACIONES> voivpresentaciones;

    /**
     * Gets the value of the voivpresentaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voivpresentaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVOIVPRESENTACIONES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VOIVPRESENTACIONES }
     * 
     * 
     */
    public List<VOIVPRESENTACIONES> getVOIVPRESENTACIONES() {
        if (voivpresentaciones == null) {
            voivpresentaciones = new ArrayList<VOIVPRESENTACIONES>();
        }
        return this.voivpresentaciones;
    }

}
