
package com.docuware.dev.schema._public.services.platform.workflow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A multi value field.
 * 
 * <p>Java class for MultiValueField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiValueField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform/workflow}CommonFormField"&gt;
 *       &lt;attribute name="IsMultiselect" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiValueField")
@XmlSeeAlso({
    UserField.class,
    RoleField.class,
    SubstitutionRuleField.class
})
public class MultiValueField
    extends CommonFormField
{

    @XmlAttribute(name = "IsMultiselect", required = true)
    protected boolean isMultiselect;

    /**
     * Gets the value of the isMultiselect property.
     * 
     */
    public boolean isIsMultiselect() {
        return isMultiselect;
    }

    /**
     * Sets the value of the isMultiselect property.
     * 
     */
    public void setIsMultiselect(boolean value) {
        this.isMultiselect = value;
    }

}
