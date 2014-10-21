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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for row complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="row">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="label" type="{http://www.dynamicforms.mx/dynaform-1.0}label"/>
 *           &lt;element name="separator" type="{http://www.dynamicforms.mx/dynaform-1.0}separator"/>
 *           &lt;element name="input" type="{http://www.dynamicforms.mx/dynaform-1.0}input"/>
 *           &lt;element name="calendar" type="{http://www.dynamicforms.mx/dynaform-1.0}calendar"/>
 *           &lt;element name="textarea" type="{http://www.dynamicforms.mx/dynaform-1.0}textarea"/>
 *           &lt;element name="rating" type="{http://www.dynamicforms.mx/dynaform-1.0}rating"/>
 *           &lt;element name="booleanchoice" type="{http://www.dynamicforms.mx/dynaform-1.0}booleanchoice"/>
 *           &lt;element name="select" type="{http://www.dynamicforms.mx/dynaform-1.0}select"/>
 *           &lt;element name="radiochoice" type="{http://www.dynamicforms.mx/dynaform-1.0}radiochoice"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row", propOrder = {
    "labelOrSeparatorOrField"
})
public class Row {

    @XmlElements({
        @XmlElement(name = "label", type = Label.class),
        @XmlElement(name = "separator", type = FormSeparator.class),
        @XmlElement(name = "input", type = Input.class),
        @XmlElement(name = "calendar", type = Calendar.class),
        @XmlElement(name = "textarea", type = Textarea.class),
        @XmlElement(name = "rating", type = Rating.class),
        @XmlElement(name = "booleanchoice", type = Booleanchoice.class),
        @XmlElement(name = "select", type = Select.class),
        @XmlElement(name = "radiochoice", type = Radiochoice.class)
    })
    protected List<FormElement> labelOrSeparatorOrField;

    /**
     * Gets the value of the labelOrSeparatorOrField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labelOrSeparatorOrField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabelOrSeparatorOrField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Label }
     * {@link Separator }
     * {@link Input }
     * {@link Calendar }
     * {@link Textarea }
     * {@link Rating }
     * {@link Booleanchoice }
     * {@link Select }
     * {@link Radiochoice }
     * 
     * 
     */
    public List<FormElement> getFormElements() {
        if (labelOrSeparatorOrField == null) {
            labelOrSeparatorOrField = new ArrayList<FormElement>();
        }
        return this.labelOrSeparatorOrField;
    }

}
