
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A class which contains data for batch update processes.
 * 
 * &lt;p&gt;Java class for BatchUpdateProcess complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="BatchUpdateProcess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Source" type="{http://dev.docuware.com/schema/public/services/platform}BatchUpdateSource"/&gt;
 *         &lt;element name="Data" type="{http://dev.docuware.com/schema/public/services/platform}BatchUpdateProcessData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchUpdateProcess", propOrder = {
    "source",
    "data"
})
public class BatchUpdateProcess {

    /**
     * The source of the items to be updated.
     * 
     */
    @XmlElement(name = "Source", required = true)
    protected BatchUpdateSource source;
    /**
     * The data which is used to specify the updated data and update process control.
     * 
     */
    @XmlElement(name = "Data", required = true)
    protected BatchUpdateProcessData data;

    /**
     * The source of the items to be updated.
     * 
     * @return
     *     possible object is
     *     {@link BatchUpdateSource }
     *     
     */
    public BatchUpdateSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchUpdateSource }
     *     
     * @see #getSource()
     */
    public void setSource(BatchUpdateSource value) {
        this.source = value;
    }

    /**
     * The data which is used to specify the updated data and update process control.
     * 
     * @return
     *     possible object is
     *     {@link BatchUpdateProcessData }
     *     
     */
    public BatchUpdateProcessData getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchUpdateProcessData }
     *     
     * @see #getData()
     */
    public void setData(BatchUpdateProcessData value) {
        this.data = value;
    }

}
