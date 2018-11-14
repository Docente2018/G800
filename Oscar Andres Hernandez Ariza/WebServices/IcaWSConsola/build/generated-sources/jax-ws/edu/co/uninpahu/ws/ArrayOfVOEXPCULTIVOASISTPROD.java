
package edu.co.uninpahu.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfVO_EXPCULTIVO_ASIST_PROD complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVO_EXPCULTIVO_ASIST_PROD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VO_EXPCULTIVO_ASIST_PROD" type="{http://microsoft.com/}VO_EXPCULTIVO_ASIST_PROD" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVO_EXPCULTIVO_ASIST_PROD", propOrder = {
    "voexpcultivoasistprod"
})
public class ArrayOfVOEXPCULTIVOASISTPROD {

    @XmlElement(name = "VO_EXPCULTIVO_ASIST_PROD", nillable = true)
    protected List<VOEXPCULTIVOASISTPROD> voexpcultivoasistprod;

    /**
     * Gets the value of the voexpcultivoasistprod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voexpcultivoasistprod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVOEXPCULTIVOASISTPROD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VOEXPCULTIVOASISTPROD }
     * 
     * 
     */
    public List<VOEXPCULTIVOASISTPROD> getVOEXPCULTIVOASISTPROD() {
        if (voexpcultivoasistprod == null) {
            voexpcultivoasistprod = new ArrayList<VOEXPCULTIVOASISTPROD>();
        }
        return this.voexpcultivoasistprod;
    }

}
