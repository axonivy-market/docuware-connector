
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Define unstrict count. If HasMore is true it is possible to have more items
 * 
 * &lt;p&gt;Java class for CountPlusValue complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="CountPlusValue"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;int"&gt;
 *       &lt;attribute name="HasMore" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ExceedLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountPlusValue", propOrder = {
    "value"
})
public class CountPlusValue {

    @XmlValue
    protected int value;
    /**
     * If this flag is true then the real number of hits can be larger than specified by the value of this element.
     * 
     */
    @XmlAttribute(name = "HasMore")
    protected Boolean hasMore;
    @XmlAttribute(name = "ExceedLimit")
    protected Boolean exceedLimit;

    /**
     * Gets the value of the value property.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * If this flag is true then the real number of hits can be larger than specified by the value of this element.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasMore() {
        if (hasMore == null) {
            return false;
        } else {
            return hasMore;
        }
    }

    /**
     * Sets the value of the hasMore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHasMore()
     */
    public void setHasMore(Boolean value) {
        this.hasMore = value;
    }

    /**
     * Gets the value of the exceedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExceedLimit() {
        if (exceedLimit == null) {
            return false;
        } else {
            return exceedLimit;
        }
    }

    /**
     * Sets the value of the exceedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExceedLimit(Boolean value) {
        this.exceedLimit = value;
    }

}
