//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.02 at 03:45:44 PM CDT 
//


package mx.jmgs.dynamicformsbase.dyna.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Dynaform_QNAME = new QName("http://www.dynamicforms.mx/dynaform-1.0", "dynaform");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DynamicForm }
     * 
     */
    public DynamicForm createDynaform() {
        return new DynamicForm();
    }

    /**
     * Create an instance of {@link FieldSelectItem }
     * 
     */
    public FieldSelectItem createSelectItem() {
        return new FieldSelectItem();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link SelectItems }
     * 
     */
    public SelectItems createSelectItems() {
        return new SelectItems();
    }

    /**
     * Create an instance of {@link Row }
     * 
     */
    public Row createRow() {
        return new Row();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicForm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dynamicforms.mx/dynaform-1.0", name = "dynaform")
    public JAXBElement<DynamicForm> createDynaform(DynamicForm value) {
        return new JAXBElement<DynamicForm>(_Dynaform_QNAME, DynamicForm.class, null, value);
    }

}