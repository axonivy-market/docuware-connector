
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogicalOperator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogicalOperator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="DefaultOperator" use="required" type="{http://dev.docuware.com/schema/public/services/platform}DialogExpressionOperation" /&gt;
 *       &lt;attribute name="Show" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicalOperator")
public class LogicalOperator {

    @XmlAttribute(name = "DefaultOperator", required = true)
    protected DialogExpressionOperation defaultOperator;
    @XmlAttribute(name = "Show", required = true)
    protected boolean show;

    /**
     * Gets the value of the defaultOperator property.
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
     */
    public void setDefaultOperator(DialogExpressionOperation value) {
        this.defaultOperator = value;
    }

    /**
     * Gets the value of the show property.
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
