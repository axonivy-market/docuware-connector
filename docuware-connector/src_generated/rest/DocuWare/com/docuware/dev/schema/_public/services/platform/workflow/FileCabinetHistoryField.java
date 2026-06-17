
package com.docuware.dev.schema._public.services.platform.workflow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileCabinetHistoryField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
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
 * </pre>
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

    @XmlElement(name = "FileCabinetName", required = true)
    protected String fileCabinetName;
    @XmlElement(name = "DocId", required = true)
    protected String docId;

    /**
     * Gets the value of the fileCabinetName property.
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
     */
    public void setFileCabinetName(String value) {
        this.fileCabinetName = value;
    }

    /**
     * Gets the value of the docId property.
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
     */
    public void setDocId(String value) {
        this.docId = value;
    }

}
