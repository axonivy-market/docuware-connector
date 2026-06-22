
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Data which is sent when you want to get the best position for a workflow stamp
 * 
 * &lt;p&gt;Java class for StampPositionData complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="StampPositionData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform/workflow}ConfirmedData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SectionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Page" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StampPositionData", propOrder = {
    "sectionId",
    "page"
})
public class StampPositionData
    extends ConfirmedData
{

    /**
     * ID of the section to set stamp.
     * 
     */
    @XmlElement(name = "SectionId", required = true)
    protected String sectionId;
    /**
     * Number of the page to set stamp.
     * 
     */
    @XmlElement(name = "Page")
    protected int page;

    /**
     * ID of the section to set stamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionId() {
        return sectionId;
    }

    /**
     * Sets the value of the sectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSectionId()
     */
    public void setSectionId(String value) {
        this.sectionId = value;
    }

    /**
     * Number of the page to set stamp.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

}
