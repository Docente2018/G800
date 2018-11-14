
package edu.co.uninpahu.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfVO_DEST_PAIS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVO_DEST_PAIS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VO_DEST_PAIS" type="{http://microsoft.com/}VO_DEST_PAIS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVO_DEST_PAIS", propOrder = {
    "vodestpais"
})
public class ArrayOfVODESTPAIS {

    @XmlElement(name = "VO_DEST_PAIS", nillable = true)
    protected List<VODESTPAIS> vodestpais;

    /**
     * Gets the value of the vodestpais property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vodestpais property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVODESTPAIS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VODESTPAIS }
     * 
     * 
     */
    public List<VODESTPAIS> getVODESTPAIS() {
        if (vodestpais == null) {
            vodestpais = new ArrayList<VODESTPAIS>();
        }
        return this.vodestpais;
    }

}
