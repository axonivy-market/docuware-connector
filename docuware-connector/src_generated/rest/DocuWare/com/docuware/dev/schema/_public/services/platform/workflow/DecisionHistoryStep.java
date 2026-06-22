
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DecisionHistoryStep complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
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
 * }&lt;/pre&gt;
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

    /**
     * List of fields which has been confirmed.
     * 
     */
    @XmlElement(name = "InputFields")
    protected List<HistoryField> inputFields;
    /**
     * List of assignments which has been executed in this step.
     * 
     */
    @XmlElement(name = "Assignments")
    protected List<HistoryField> assignments;
    /**
     * List of file cabinet assignments which has been executed in this step.
     * 
     */
    @XmlElement(name = "FileCabinetAssignments")
    protected List<FileCabinetHistoryField> fileCabinetAssignments;
    /**
     * Document user version when the task is confirmed.
     * 
     */
    @XmlAttribute(name = "DocumentUserVersion")
    protected String documentUserVersion;
    /**
     * Name of the user who confirmed the task.
     * 
     */
    @XmlAttribute(name = "UserName")
    protected String userName;
    /**
     * Name of the decision which has been confirmed.
     * 
     */
    @XmlAttribute(name = "DecisionName")
    protected String decisionName;

    /**
     * List of fields which has been confirmed.
     * 
     * Gets the value of the inputFields property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the inputFields property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInputFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryField }
     * </p>
     * 
     * 
     * @return
     *     The value of the inputFields property.
     */
    public List<HistoryField> getInputFields() {
        if (inputFields == null) {
            inputFields = new ArrayList<>();
        }
        return this.inputFields;
    }

    /**
     * List of assignments which has been executed in this step.
     * 
     * Gets the value of the assignments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assignments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAssignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryField }
     * </p>
     * 
     * 
     * @return
     *     The value of the assignments property.
     */
    public List<HistoryField> getAssignments() {
        if (assignments == null) {
            assignments = new ArrayList<>();
        }
        return this.assignments;
    }

    /**
     * List of file cabinet assignments which has been executed in this step.
     * 
     * Gets the value of the fileCabinetAssignments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fileCabinetAssignments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFileCabinetAssignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileCabinetHistoryField }
     * </p>
     * 
     * 
     * @return
     *     The value of the fileCabinetAssignments property.
     */
    public List<FileCabinetHistoryField> getFileCabinetAssignments() {
        if (fileCabinetAssignments == null) {
            fileCabinetAssignments = new ArrayList<>();
        }
        return this.fileCabinetAssignments;
    }

    /**
     * Document user version when the task is confirmed.
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
     * @see #getDocumentUserVersion()
     */
    public void setDocumentUserVersion(String value) {
        this.documentUserVersion = value;
    }

    /**
     * Name of the user who confirmed the task.
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
     * @see #getUserName()
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Name of the decision which has been confirmed.
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
     * @see #getDecisionName()
     */
    public void setDecisionName(String value) {
        this.decisionName = value;
    }

}
