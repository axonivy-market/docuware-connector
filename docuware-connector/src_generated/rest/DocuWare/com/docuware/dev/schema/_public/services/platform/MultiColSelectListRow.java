
package com.docuware.dev.schema._public.services.platform;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Multi column select list row.
 * 
 * <p>Java class for MultiColSelectListRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiColSelectListRow"&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiColSelectListRow", propOrder = {
    "intOrDecimalOrString"
})
public class MultiColSelectListRow {

    @XmlElements({
        @XmlElement(name = "Int", type = Long.class),
        @XmlElement(name = "Decimal", type = BigDecimal.class),
        @XmlElement(name = "String", type = String.class),
        @XmlElement(name = "DateTime", type = XMLGregorianCalendar.class),
        @XmlElement(name = "Empty", type = NullTableResultValue.class)
    })
    protected List<Object> intOrDecimalOrString;

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

}
