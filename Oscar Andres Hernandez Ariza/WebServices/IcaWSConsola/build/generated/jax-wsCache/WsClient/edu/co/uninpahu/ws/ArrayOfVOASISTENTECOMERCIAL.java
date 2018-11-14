
package edu.co.uninpahu.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfVO_ASISTENTE_COMERCIAL complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVO_ASISTENTE_COMERCIAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VO_ASISTENTE_COMERCIAL" type="{http://microsoft.com/}VO_ASISTENTE_COMERCIAL" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVO_ASISTENTE_COMERCIAL", propOrder = {
    "voasistentecomercial"
})
public class ArrayOfVOASISTENTECOMERCIAL {

    @XmlElement(name = "VO_ASISTENTE_COMERCIAL", nillable = true)
    protected List<VOASISTENTECOMERCIAL> voasistentecomercial;

    /**
     * Gets the value of the voasistentecomercial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voasistentecomercial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVOASISTENTECOMERCIAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VOASISTENTECOMERCIAL }
     * 
     * 
     */
    public List<VOASISTENTECOMERCIAL> getVOASISTENTECOMERCIAL() {
        if (voasistentecomercial == null) {
            voasistentecomercial = new ArrayList<VOASISTENTECOMERCIAL>();
        }
        return this.voasistentecomercial;
    }

}
