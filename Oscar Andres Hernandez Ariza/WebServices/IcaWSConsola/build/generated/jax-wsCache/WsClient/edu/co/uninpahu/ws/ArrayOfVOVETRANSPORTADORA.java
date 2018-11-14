
package edu.co.uninpahu.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfVO_VE_TRANSPORTADORA complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVO_VE_TRANSPORTADORA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VO_VE_TRANSPORTADORA" type="{http://microsoft.com/}VO_VE_TRANSPORTADORA" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVO_VE_TRANSPORTADORA", propOrder = {
    "vovetransportadora"
})
public class ArrayOfVOVETRANSPORTADORA {

    @XmlElement(name = "VO_VE_TRANSPORTADORA", nillable = true)
    protected List<VOVETRANSPORTADORA> vovetransportadora;

    /**
     * Gets the value of the vovetransportadora property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vovetransportadora property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVOVETRANSPORTADORA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VOVETRANSPORTADORA }
     * 
     * 
     */
    public List<VOVETRANSPORTADORA> getVOVETRANSPORTADORA() {
        if (vovetransportadora == null) {
            vovetransportadora = new ArrayList<VOVETRANSPORTADORA>();
        }
        return this.vovetransportadora;
    }

}
