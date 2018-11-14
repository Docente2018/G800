
package edu.co.uninpahu.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfVO_IMPORTADORESEXPORTADORES complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVO_IMPORTADORESEXPORTADORES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VO_IMPORTADORESEXPORTADORES" type="{http://microsoft.com/}VO_IMPORTADORESEXPORTADORES" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVO_IMPORTADORESEXPORTADORES", propOrder = {
    "voimportadoresexportadores"
})
public class ArrayOfVOIMPORTADORESEXPORTADORES {

    @XmlElement(name = "VO_IMPORTADORESEXPORTADORES", nillable = true)
    protected List<VOIMPORTADORESEXPORTADORES> voimportadoresexportadores;

    /**
     * Gets the value of the voimportadoresexportadores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voimportadoresexportadores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVOIMPORTADORESEXPORTADORES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VOIMPORTADORESEXPORTADORES }
     * 
     * 
     */
    public List<VOIMPORTADORESEXPORTADORES> getVOIMPORTADORESEXPORTADORES() {
        if (voimportadoresexportadores == null) {
            voimportadoresexportadores = new ArrayList<VOIMPORTADORESEXPORTADORES>();
        }
        return this.voimportadoresexportadores;
    }

}
