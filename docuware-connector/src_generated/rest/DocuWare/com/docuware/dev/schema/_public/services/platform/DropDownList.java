
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DropDownList complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DropDownList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}WebFormField"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Options" type="{http://dev.docuware.com/schema/public/services/platform}WebFormListOptions"/&gt;
 *         &lt;element name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SelectListGuid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PredefinedValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DropDownList", propOrder = {
    "options",
    "sortOrder",
    "selectListGuid",
    "predefinedValue"
})
public class DropDownList
    extends WebFormField
{

    @XmlElement(name = "Options", required = true)
    protected WebFormListOptions options;
    @XmlElement(name = "SortOrder", required = true)
    protected String sortOrder;
    @XmlElement(name = "SelectListGuid", required = true)
    protected String selectListGuid;
    @XmlElement(name = "PredefinedValue", required = true)
    protected String predefinedValue;

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link WebFormListOptions }
     *     
     */
    public WebFormListOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebFormListOptions }
     *     
     */
    public void setOptions(WebFormListOptions value) {
        this.options = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortOrder(String value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the selectListGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectListGuid() {
        return selectListGuid;
    }

    /**
     * Sets the value of the selectListGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectListGuid(String value) {
        this.selectListGuid = value;
    }

    /**
     * Gets the value of the predefinedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredefinedValue() {
        return predefinedValue;
    }

    /**
     * Sets the value of the predefinedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredefinedValue(String value) {
        this.predefinedValue = value;
    }

}
