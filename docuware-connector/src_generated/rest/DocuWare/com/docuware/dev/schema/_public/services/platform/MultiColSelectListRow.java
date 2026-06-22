
package com.docuware.dev.schema._public.services.platform;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Multi column select list row.
 * 
 * &lt;p&gt;Java class for MultiColSelectListRow complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
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
 * }&lt;/pre&gt;
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

}
