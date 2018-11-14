
package edu.co.uninpahu.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfVO_ESPECIES_O_PRODUCTOS_AGRICOLAS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVO_ESPECIES_O_PRODUCTOS_AGRICOLAS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VO_ESPECIES_O_PRODUCTOS_AGRICOLAS" type="{http://microsoft.com/}VO_ESPECIES_O_PRODUCTOS_AGRICOLAS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVO_ESPECIES_O_PRODUCTOS_AGRICOLAS", propOrder = {
    "voespeciesoproductosagricolas"
})
public class ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS {

    @XmlElement(name = "VO_ESPECIES_O_PRODUCTOS_AGRICOLAS", nillable = true)
    protected List<VOESPECIESOPRODUCTOSAGRICOLAS> voespeciesoproductosagricolas;

    /**
     * Gets the value of the voespeciesoproductosagricolas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voespeciesoproductosagricolas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVOESPECIESOPRODUCTOSAGRICOLAS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VOESPECIESOPRODUCTOSAGRICOLAS }
     * 
     * 
     */
    public List<VOESPECIESOPRODUCTOSAGRICOLAS> getVOESPECIESOPRODUCTOSAGRICOLAS() {
        if (voespeciesoproductosagricolas == null) {
            voespeciesoproductosagricolas = new ArrayList<VOESPECIESOPRODUCTOSAGRICOLAS>();
        }
        return this.voespeciesoproductosagricolas;
    }

}
