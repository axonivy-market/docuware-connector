
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dialog properties specific for Search Dialog
 * 
 * &lt;p&gt;Java class for DialogPropertiesSearch complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DialogPropertiesSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DialogProperties"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LogicalOperator" type="{http://dev.docuware.com/schema/public/services/platform}LogicalOperator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogPropertiesSearch", propOrder = {
    "logicalOperator"
})
public class DialogPropertiesSearch
    extends DialogProperties
{

    /**
     * The logical operator used for the search conditions
     * 
     */
    @XmlElement(name = "LogicalOperator", required = true)
    protected LogicalOperator logicalOperator;

    /**
     * The logical operator used for the search conditions
     * 
     * @return
     *     possible object is
     *     {@link LogicalOperator }
     *     
     */
    public LogicalOperator getLogicalOperator() {
        return logicalOperator;
    }

    /**
     * Sets the value of the logicalOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalOperator }
     *     
     * @see #getLogicalOperator()
     */
    public void setLogicalOperator(LogicalOperator value) {
        this.logicalOperator = value;
    }

}
