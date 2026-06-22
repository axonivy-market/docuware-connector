
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Condition for specific database name (field)
 * 
 * &lt;p&gt;Java class for DialogExpressionCondition complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DialogExpressionCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DBName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ColumnName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogExpressionCondition", propOrder = {
    "value"
})
@XmlSeeAlso({
    MultiColumnSelectListExpressionCondition.class
})
public class DialogExpressionCondition {

    /**
     * In case of two values where the first one is 
     * &lt;pre&gt;
     * &amp;lt;?xml version="1.0" encoding="UTF-8"?&amp;gt;&amp;lt;c xmlns="http://dev.docuware.com/schema/public/services/platform" xmlns:ann="http://dev.docuware.com/schema/public/services/annotations" xmlns:xs="http://www.w3.org/2001/XMLSchema"&amp;gt;null&amp;lt;/c&amp;gt;
     * &lt;/pre&gt;
     *  a "less or equal than" search is performed.
     * 						If the second value is 
     * &lt;pre&gt;
     * &amp;lt;?xml version="1.0" encoding="UTF-8"?&amp;gt;&amp;lt;c xmlns="http://dev.docuware.com/schema/public/services/platform" xmlns:ann="http://dev.docuware.com/schema/public/services/annotations" xmlns:xs="http://www.w3.org/2001/XMLSchema"&amp;gt;null&amp;lt;/c&amp;gt;
     * &lt;/pre&gt;
     *  a "greater or equal than" search is performed.
     * 
     */
    @XmlElement(name = "Value", required = true, nillable = true)
    protected List<String> value;
    /**
     * Gets or sets the database name which provides the value checked against the condition. In case this is a table field ColumnName is expected to have proper name for table field column.
     * 
     */
    @XmlAttribute(name = "DBName")
    protected String dbName;
    /**
     * Used when DBName is a table field. Gets or sets the column's database name which provides the value checked against the condition.
     * 
     */
    @XmlAttribute(name = "ColumnName")
    protected String columnName;

    /**
     * In case of two values where the first one is 
     * &lt;pre&gt;
     * &amp;lt;?xml version="1.0" encoding="UTF-8"?&amp;gt;&amp;lt;c xmlns="http://dev.docuware.com/schema/public/services/platform" xmlns:ann="http://dev.docuware.com/schema/public/services/annotations" xmlns:xs="http://www.w3.org/2001/XMLSchema"&amp;gt;null&amp;lt;/c&amp;gt;
     * &lt;/pre&gt;
     *  a "less or equal than" search is performed.
     * 						If the second value is 
     * &lt;pre&gt;
     * &amp;lt;?xml version="1.0" encoding="UTF-8"?&amp;gt;&amp;lt;c xmlns="http://dev.docuware.com/schema/public/services/platform" xmlns:ann="http://dev.docuware.com/schema/public/services/annotations" xmlns:xs="http://www.w3.org/2001/XMLSchema"&amp;gt;null&amp;lt;/c&amp;gt;
     * &lt;/pre&gt;
     *  a "greater or equal than" search is performed.
     * 
     * Gets the value of the value property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the value property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the value property.
     */
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<>();
        }
        return this.value;
    }

    /**
     * Gets or sets the database name which provides the value checked against the condition. In case this is a table field ColumnName is expected to have proper name for table field column.
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
     * @see #getDBName()
     */
    public void setDBName(String value) {
        this.dbName = value;
    }

    /**
     * Used when DBName is a table field. Gets or sets the column's database name which provides the value checked against the condition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getColumnName()
     */
    public void setColumnName(String value) {
        this.columnName = value;
    }

}
