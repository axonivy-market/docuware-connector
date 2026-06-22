
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Filter documents with specific flags
 * 
 * &lt;p&gt;Java class for FlagConditions complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FlagConditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="IncludeCheckedOut" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="IncludeAppended" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlagConditions")
public class FlagConditions {

    /**
     * Include documents which are checked out
     * 
     */
    @XmlAttribute(name = "IncludeCheckedOut")
    protected Boolean includeCheckedOut;
    /**
     * Include documents which are appended
     * 
     */
    @XmlAttribute(name = "IncludeAppended")
    protected Boolean includeAppended;

    /**
     * Include documents which are checked out
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeCheckedOut() {
        if (includeCheckedOut == null) {
            return false;
        } else {
            return includeCheckedOut;
        }
    }

    /**
     * Sets the value of the includeCheckedOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIncludeCheckedOut()
     */
    public void setIncludeCheckedOut(Boolean value) {
        this.includeCheckedOut = value;
    }

    /**
     * Include documents which are appended
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeAppended() {
        if (includeAppended == null) {
            return false;
        } else {
            return includeAppended;
        }
    }

    /**
     * Sets the value of the includeAppended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIncludeAppended()
     */
    public void setIncludeAppended(Boolean value) {
        this.includeAppended = value;
    }

}
