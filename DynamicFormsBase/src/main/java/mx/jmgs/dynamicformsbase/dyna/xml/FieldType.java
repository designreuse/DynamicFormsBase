//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.06 at 04:29:22 PM CDT 
//


package mx.jmgs.dynamicformsbase.dyna.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="input"/>
 *     &lt;enumeration value="calendar"/>
 *     &lt;enumeration value="select"/>
 *     &lt;enumeration value="textarea"/>
 *     &lt;enumeration value="rating"/>
 *     &lt;enumeration value="radiochoice"/>
 *     &lt;enumeration value="booleanchoice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fieldType")
@XmlEnum
public enum FieldType {

    @XmlEnumValue("input")
    INPUT("input"),
    @XmlEnumValue("calendar")
    CALENDAR("calendar"),
    @XmlEnumValue("select")
    SELECT("select"),
    @XmlEnumValue("textarea")
    TEXTAREA("textarea"),
    @XmlEnumValue("rating")
    RATING("rating"),
    @XmlEnumValue("radiochoice")
    RADIOCHOICE("radiochoice"),
    @XmlEnumValue("booleanchoice")
    BOOLEANCHOICE("booleanchoice");
    
    private final String value;

    FieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldType fromValue(String v) {
        for (FieldType c: FieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
