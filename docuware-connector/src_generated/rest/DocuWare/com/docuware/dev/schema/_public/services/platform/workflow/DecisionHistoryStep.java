
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecisionHistoryStep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecisionHistoryStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InputFields" type="{http://dev.docuware.com/schema/public/services/platform/workflow}HistoryField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Assignments" type="{http://dev.docuware.com/schema/public/services/platform/workflow}HistoryField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FileCabinetAssignments" type="{http://dev.docuware.com/schema/public/services/platform/workflow}FileCabinetHistoryField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DocumentUserVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DecisionName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionHistoryStep", propOrder = {
    "inputFields",
    "assignments",
    "fileCabinetAssignments"
})
public class DecisionHistoryStep {

    @XmlElement(name = "InputFields")
    protected List<HistoryField> inputFields;
    @XmlElement(name = "Assignments")
    protected List<HistoryField> assignments;
    @XmlElement(name = "FileCabinetAssignments")
    protected List<FileCabinetHistoryField> fileCabinetAssignments;
    @XmlAttribute(name = "DocumentUserVersion")
    protected String documentUserVersion;
    @XmlAttribute(name = "UserName")
    protected String userName;
    @XmlAttribute(name = "DecisionName")
    protected String decisionName;

    /**
     * Gets the value of the inputFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryField }
     * 
     * 
     */
    public List<HistoryField> getInputFields() {
        if (inputFields == null) {
            inputFields = new ArrayList<HistoryField>();
        }
        return this.inputFields;
    }

    /**
     * Gets the value of the assignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryField }
     * 
     * 
     */
    public List<HistoryField> getAssignments() {
        if (assignments == null) {
            assignments = new ArrayList<HistoryField>();
        }
        return this.assignments;
    }

    /**
     * Gets the value of the fileCabinetAssignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileCabinetAssignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileCabinetAssignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileCabinetHistoryField }
     * 
     * 
     */
    public List<FileCabinetHistoryField> getFileCabinetAssignments() {
        if (fileCabinetAssignments == null) {
            fileCabinetAssignments = new ArrayList<FileCabinetHistoryField>();
        }
        return this.fileCabinetAssignments;
    }

    /**
     * Gets the value of the documentUserVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentUserVersion() {
        return documentUserVersion;
    }

    /**
     * Sets the value of the documentUserVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentUserVersion(String value) {
        this.documentUserVersion = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the decisionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionName() {
        return decisionName;
    }

    /**
     * Sets the value of the decisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionName(String value) {
        this.decisionName = value;
    }

}
