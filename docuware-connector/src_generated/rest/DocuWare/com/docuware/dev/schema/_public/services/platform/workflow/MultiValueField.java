
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A multi value field.
 * 
 * &lt;p&gt;Java class for MultiValueField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="MultiValueField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform/workflow}CommonFormField"&gt;
 *       &lt;attribute name="IsMultiselect" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
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

    /**
     * Determines whether the field is multi select (value can be a range of values from a select list).
     * 
     */
    @XmlAttribute(name = "IsMultiselect", required = true)
    protected boolean isMultiselect;

    /**
     * Determines whether the field is multi select (value can be a range of values from a select list).
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
