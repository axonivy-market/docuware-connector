
package com.docuware.dev.schema._public.services.platform;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.docuware.dev.schema._public.services.Links;


/**
 * Define a row of  the table result from document query
 * 
 * <p>Java class for TableResultRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TableResultRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;choice&gt;
 *             &lt;element name="Int" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *             &lt;element name="Decimal" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *             &lt;element name="String" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *             &lt;element name="Empty" type="{http://dev.docuware.com/schema/public/services/platform}NullTableResultValue"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="AnnotationsPreview" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableResultRow", propOrder = {
    "intOrDecimalOrString",
    "links"
})
public class TableResultRow {

    @XmlElements({
        @XmlElement(name = "Int", type = Long.class),
        @XmlElement(name = "Decimal", type = BigDecimal.class),
        @XmlElement(name = "String", type = String.class),
        @XmlElement(name = "DateTime", type = XMLGregorianCalendar.class),
        @XmlElement(name = "Empty", type = NullTableResultValue.class)
    })
    protected List<Object> intOrDecimalOrString;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    @XmlAttribute(name = "Id", required = true)
    protected int id;
    @XmlAttribute(name = "AnnotationsPreview")
    protected Boolean annotationsPreview;

    /**
     * Gets the value of the intOrDecimalOrString property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intOrDecimalOrString property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntOrDecimalOrString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * {@link BigDecimal }
     * {@link String }
     * {@link XMLGregorianCalendar }
     * {@link NullTableResultValue }
     * 
     * 
     */
    public List<Object> getIntOrDecimalOrString() {
        if (intOrDecimalOrString == null) {
            intOrDecimalOrString = new ArrayList<Object>();
        }
        return this.intOrDecimalOrString;
    }

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link Links }
     *     
     */
    public Links getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link Links }
     *     
     */
    public void setLinks(Links value) {
        this.links = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the annotationsPreview property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAnnotationsPreview() {
        if (annotationsPreview == null) {
            return false;
        } else {
            return annotationsPreview;
        }
    }

    /**
     * Sets the value of the annotationsPreview property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnnotationsPreview(Boolean value) {
        this.annotationsPreview = value;
    }

}
