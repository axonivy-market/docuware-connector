
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for BatchUpdateDialogExpressionSource complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="BatchUpdateDialogExpressionSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}BatchUpdateSource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Expression" type="{http://dev.docuware.com/schema/public/services/platform}DialogExpression"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchUpdateDialogExpressionSource", propOrder = {
    "expression"
})
public class BatchUpdateDialogExpressionSource
    extends BatchUpdateSource
{

    /**
     * A dialog expression which is used to get the documents to be updated.
     * 
     */
    @XmlElement(name = "Expression", required = true)
    protected DialogExpression expression;

    /**
     * A dialog expression which is used to get the documents to be updated.
     * 
     * @return
     *     possible object is
     *     {@link DialogExpression }
     *     
     */
    public DialogExpression getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogExpression }
     *     
     * @see #getExpression()
     */
    public void setExpression(DialogExpression value) {
        this.expression = value;
    }

}
