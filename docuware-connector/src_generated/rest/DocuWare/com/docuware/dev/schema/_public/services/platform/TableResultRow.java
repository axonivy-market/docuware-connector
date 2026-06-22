
package com.docuware.dev.schema._public.services.platform;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define a row of  the table result from document query
 * 
 * &lt;p&gt;Java class for TableResultRow complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
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
 * }&lt;/pre&gt;
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
    /**
     * Id of the document represented by the current row.
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected int id;
    /**
     * Contains true if the document may contain any annotations on the first section and first page.
     *           If this is false there is no need the AnnotationsAsImage link to be called.
     * 
     */
    @XmlAttribute(name = "AnnotationsPreview")
    protected Boolean annotationsPreview;

    /**
     * Gets the value of the intOrDecimalOrString property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intOrDecimalOrString property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIntOrDecimalOrString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NullTableResultValue }
     * {@link Long }
     * {@link String }
     * {@link BigDecimal }
     * {@link XMLGregorianCalendar }
     * </p>
     * 
     * 
     * @return
     *     The value of the intOrDecimalOrString property.
     */
    public List<Object> getIntOrDecimalOrString() {
        if (intOrDecimalOrString == null) {
            intOrDecimalOrString = new ArrayList<>();
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
     * Id of the document represented by the current row.
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
     * Contains true if the document may contain any annotations on the first section and first page.
     *           If this is false there is no need the AnnotationsAsImage link to be called.
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
     * @see #isAnnotationsPreview()
     */
    public void setAnnotationsPreview(Boolean value) {
        this.annotationsPreview = value;
    }

}
