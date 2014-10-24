//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.20 at 03:39:42 PM CDT 
//


package mx.jmgs.dynamicformsbase.dyna.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for select complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="select">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.dynamicforms.mx/dynaform-1.0}field">
 *       &lt;sequence>
 *         &lt;element name="selectItem" type="{http://www.dynamicforms.mx/dynaform-1.0}selectItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "select", propOrder = {
    "selectItem"
})
public class Select
    extends Field
{

    protected List<FieldSelectItem> selectItem;
    @XmlAttribute(name = "label")
    protected String label;

    /**
     * Gets the value of the selectItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldSelectItem }
     * 
     * 
     */
    public List<FieldSelectItem> getSelectItems() {
        if (selectItem == null) {
            selectItem = new ArrayList<FieldSelectItem>();
        }
        return this.selectItem;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

}