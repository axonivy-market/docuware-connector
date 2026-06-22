
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Condition for specific field.
 * 
 * &lt;p&gt;Java class for MultiColumnSelectListExpressionCondition complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="MultiColumnSelectListExpressionCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DialogExpressionCondition"&gt;
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiColumnSelectListExpressionCondition")
public class MultiColumnSelectListExpressionCondition
    extends DialogExpressionCondition
{

    /**
     * The type of the field
     * 
     */
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * The type of the field
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

}
