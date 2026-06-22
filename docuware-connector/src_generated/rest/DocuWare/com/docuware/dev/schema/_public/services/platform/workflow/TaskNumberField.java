
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A number field.
 * 
 * &lt;p&gt;Java class for TaskNumberField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TaskNumberField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform/workflow}CommonFormField"&gt;
 *       &lt;attribute name="Precision" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskNumberField")
@XmlSeeAlso({
    TaskTableNumberField.class
})
public class TaskNumberField
    extends CommonFormField
{

    /**
     * Precision of the field.
     * 
     */
    @XmlAttribute(name = "Precision", required = true)
    protected int precision;

    /**
     * Precision of the field.
     * 
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     */
    public void setPrecision(int value) {
        this.precision = value;
    }

}
