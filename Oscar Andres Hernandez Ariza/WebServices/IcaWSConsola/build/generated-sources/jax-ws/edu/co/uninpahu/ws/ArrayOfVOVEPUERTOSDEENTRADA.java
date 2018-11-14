
package edu.co.uninpahu.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfVO_VE_PUERTOS_DE_ENTRADA complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVO_VE_PUERTOS_DE_ENTRADA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VO_VE_PUERTOS_DE_ENTRADA" type="{http://microsoft.com/}VO_VE_PUERTOS_DE_ENTRADA" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVO_VE_PUERTOS_DE_ENTRADA", propOrder = {
    "vovepuertosdeentrada"
})
public class ArrayOfVOVEPUERTOSDEENTRADA {

    @XmlElement(name = "VO_VE_PUERTOS_DE_ENTRADA", nillable = true)
    protected List<VOVEPUERTOSDEENTRADA> vovepuertosdeentrada;

    /**
     * Gets the value of the vovepuertosdeentrada property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vovepuertosdeentrada property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVOVEPUERTOSDEENTRADA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VOVEPUERTOSDEENTRADA }
     * 
     * 
     */
    public List<VOVEPUERTOSDEENTRADA> getVOVEPUERTOSDEENTRADA() {
        if (vovepuertosdeentrada == null) {
            vovepuertosdeentrada = new ArrayList<VOVEPUERTOSDEENTRADA>();
        }
        return this.vovepuertosdeentrada;
    }

}
