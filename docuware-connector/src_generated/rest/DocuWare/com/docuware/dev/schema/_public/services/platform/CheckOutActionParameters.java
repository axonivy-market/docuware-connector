
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Parameters for CheckOut action
 * 
 * &lt;p&gt;Java class for CheckOutActionParameters complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="CheckOutActionParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DocumentActionParameters"&gt;
 *       &lt;attribute name="FileCabinetId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckOutActionParameters")
public class CheckOutActionParameters
    extends DocumentActionParameters
{

    /**
     * Identity of the destination cabinet.
     * 
     */
    @XmlAttribute(name = "FileCabinetId", required = true)
    protected String fileCabinetId;

    /**
     * Identity of the destination cabinet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileCabinetId() {
        return fileCabinetId;
    }

    /**
     * Sets the value of the fileCabinetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFileCabinetId()
     */
    public void setFileCabinetId(String value) {
        this.fileCabinetId = value;
    }

}
