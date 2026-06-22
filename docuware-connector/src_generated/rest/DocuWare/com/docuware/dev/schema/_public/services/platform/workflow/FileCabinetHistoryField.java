
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FileCabinetHistoryField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FileCabinetHistoryField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform/workflow}HistoryField"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileCabinetName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DocId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileCabinetHistoryField", propOrder = {
    "fileCabinetName",
    "docId"
})
public class FileCabinetHistoryField
    extends HistoryField
{

    /**
     * File cabinet name
     * 
     */
    @XmlElement(name = "FileCabinetName", required = true)
    protected String fileCabinetName;
    /**
     * Document id
     * 
     */
    @XmlElement(name = "DocId", required = true)
    protected String docId;

    /**
     * File cabinet name
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileCabinetName() {
        return fileCabinetName;
    }

    /**
     * Sets the value of the fileCabinetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFileCabinetName()
     */
    public void setFileCabinetName(String value) {
        this.fileCabinetName = value;
    }

    /**
     * Document id
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocId()
     */
    public void setDocId(String value) {
        this.docId = value;
    }

}
