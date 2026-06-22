
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SuggestionTableField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SuggestionTableField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Table" type="{http://dev.docuware.com/schema/public/services/platform}SuggestionTable" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DBName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Confidence" type="{http://dev.docuware.com/schema/public/services/platform}IntellixFieldTrust" default="None" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestionTableField", propOrder = {
    "table"
})
public class SuggestionTableField {

    @XmlElement(name = "Table", required = true)
    protected List<SuggestionTable> table;
    @XmlAttribute(name = "DBName", required = true)
    protected String dbName;
    @XmlAttribute(name = "Confidence")
    protected IntellixFieldTrust confidence;

    /**
     * Gets the value of the table property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the table property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuggestionTable }
     * </p>
     * 
     * 
     * @return
     *     The value of the table property.
     */
    public List<SuggestionTable> getTable() {
        if (table == null) {
            table = new ArrayList<>();
        }
        return this.table;
    }

    /**
     * Gets the value of the dbName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBName() {
        return dbName;
    }

    /**
     * Sets the value of the dbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBName(String value) {
        this.dbName = value;
    }

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link IntellixFieldTrust }
     *     
     */
    public IntellixFieldTrust getConfidence() {
        if (confidence == null) {
            return IntellixFieldTrust.NONE;
        } else {
            return confidence;
        }
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntellixFieldTrust }
     *     
     */
    public void setConfidence(IntellixFieldTrust value) {
        this.confidence = value;
    }

}
