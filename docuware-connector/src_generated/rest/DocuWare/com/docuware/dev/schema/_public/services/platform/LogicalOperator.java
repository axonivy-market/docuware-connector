
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for LogicalOperator complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="LogicalOperator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="DefaultOperator" use="required" type="{http://dev.docuware.com/schema/public/services/platform}DialogExpressionOperation" /&gt;
 *       &lt;attribute name="Show" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicalOperator")
public class LogicalOperator {

    /**
     * If the option cannot be set in the dialog, the value defined here is always used for the search query
     * 
     */
    @XmlAttribute(name = "DefaultOperator", required = true)
    protected DialogExpressionOperation defaultOperator;
    /**
     * If this option is enabled, the option can be set in the search dialog, and users can select either the AND or OR logical operator for their search query
     * 
     */
    @XmlAttribute(name = "Show", required = true)
    protected boolean show;

    /**
     * If the option cannot be set in the dialog, the value defined here is always used for the search query
     * 
     * @return
     *     possible object is
     *     {@link DialogExpressionOperation }
     *     
     */
    public DialogExpressionOperation getDefaultOperator() {
        return defaultOperator;
    }

    /**
     * Sets the value of the defaultOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogExpressionOperation }
     *     
     * @see #getDefaultOperator()
     */
    public void setDefaultOperator(DialogExpressionOperation value) {
        this.defaultOperator = value;
    }

    /**
     * If this option is enabled, the option can be set in the search dialog, and users can select either the AND or OR logical operator for their search query
     * 
     */
    public boolean isShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     */
    public void setShow(boolean value) {
        this.show = value;
    }

}
