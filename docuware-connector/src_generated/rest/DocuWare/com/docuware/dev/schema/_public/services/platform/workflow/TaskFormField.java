
package com.docuware.dev.schema._public.services.platform.workflow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskFormField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskFormField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="LinkForm" type="{http://dev.docuware.com/schema/public/services/platform/workflow}LinkForm"/&gt;
 *         &lt;element name="DescriptionFormField" type="{http://dev.docuware.com/schema/public/services/platform/workflow}DescriptionFormField"/&gt;
 *         &lt;element name="TextField" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TaskTextField"/&gt;
 *         &lt;element name="Number" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TaskNumberField"/&gt;
 *         &lt;element name="TaskDateTimeField" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TaskDateTimeField"/&gt;
 *         &lt;element name="UserField" type="{http://dev.docuware.com/schema/public/services/platform/workflow}UserField"/&gt;
 *         &lt;element name="RoleField" type="{http://dev.docuware.com/schema/public/services/platform/workflow}RoleField"/&gt;
 *         &lt;element name="SubstitutionRuleField" type="{http://dev.docuware.com/schema/public/services/platform/workflow}SubstitutionRuleField"/&gt;
 *         &lt;element name="KeywordsField" type="{http://dev.docuware.com/schema/public/services/platform/workflow}KeywordsField"/&gt;
 *         &lt;element name="TableField" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TaskTableField"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskFormField", propOrder = {
    "linkForm",
    "descriptionFormField",
    "textField",
    "number",
    "taskDateTimeField",
    "userField",
    "roleField",
    "substitutionRuleField",
    "keywordsField",
    "tableField"
})
public class TaskFormField {

    @XmlElement(name = "LinkForm")
    protected LinkForm linkForm;
    @XmlElement(name = "DescriptionFormField")
    protected DescriptionFormField descriptionFormField;
    @XmlElement(name = "TextField")
    protected TaskTextField textField;
    @XmlElement(name = "Number")
    protected TaskNumberField number;
    @XmlElement(name = "TaskDateTimeField")
    protected TaskDateTimeField taskDateTimeField;
    @XmlElement(name = "UserField")
    protected UserField userField;
    @XmlElement(name = "RoleField")
    protected RoleField roleField;
    @XmlElement(name = "SubstitutionRuleField")
    protected SubstitutionRuleField substitutionRuleField;
    @XmlElement(name = "KeywordsField")
    protected KeywordsField keywordsField;
    @XmlElement(name = "TableField")
    protected TaskTableField tableField;

    /**
     * Gets the value of the linkForm property.
     * 
     * @return
     *     possible object is
     *     {@link LinkForm }
     *     
     */
    public LinkForm getLinkForm() {
        return linkForm;
    }

    /**
     * Sets the value of the linkForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkForm }
     *     
     */
    public void setLinkForm(LinkForm value) {
        this.linkForm = value;
    }

    /**
     * Gets the value of the descriptionFormField property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionFormField }
     *     
     */
    public DescriptionFormField getDescriptionFormField() {
        return descriptionFormField;
    }

    /**
     * Sets the value of the descriptionFormField property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionFormField }
     *     
     */
    public void setDescriptionFormField(DescriptionFormField value) {
        this.descriptionFormField = value;
    }

    /**
     * Gets the value of the textField property.
     * 
     * @return
     *     possible object is
     *     {@link TaskTextField }
     *     
     */
    public TaskTextField getTextField() {
        return textField;
    }

    /**
     * Sets the value of the textField property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskTextField }
     *     
     */
    public void setTextField(TaskTextField value) {
        this.textField = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link TaskNumberField }
     *     
     */
    public TaskNumberField getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskNumberField }
     *     
     */
    public void setNumber(TaskNumberField value) {
        this.number = value;
    }

    /**
     * Gets the value of the taskDateTimeField property.
     * 
     * @return
     *     possible object is
     *     {@link TaskDateTimeField }
     *     
     */
    public TaskDateTimeField getTaskDateTimeField() {
        return taskDateTimeField;
    }

    /**
     * Sets the value of the taskDateTimeField property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskDateTimeField }
     *     
     */
    public void setTaskDateTimeField(TaskDateTimeField value) {
        this.taskDateTimeField = value;
    }

    /**
     * Gets the value of the userField property.
     * 
     * @return
     *     possible object is
     *     {@link UserField }
     *     
     */
    public UserField getUserField() {
        return userField;
    }

    /**
     * Sets the value of the userField property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserField }
     *     
     */
    public void setUserField(UserField value) {
        this.userField = value;
    }

    /**
     * Gets the value of the roleField property.
     * 
     * @return
     *     possible object is
     *     {@link RoleField }
     *     
     */
    public RoleField getRoleField() {
        return roleField;
    }

    /**
     * Sets the value of the roleField property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleField }
     *     
     */
    public void setRoleField(RoleField value) {
        this.roleField = value;
    }

    /**
     * Gets the value of the substitutionRuleField property.
     * 
     * @return
     *     possible object is
     *     {@link SubstitutionRuleField }
     *     
     */
    public SubstitutionRuleField getSubstitutionRuleField() {
        return substitutionRuleField;
    }

    /**
     * Sets the value of the substitutionRuleField property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstitutionRuleField }
     *     
     */
    public void setSubstitutionRuleField(SubstitutionRuleField value) {
        this.substitutionRuleField = value;
    }

    /**
     * Gets the value of the keywordsField property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordsField }
     *     
     */
    public KeywordsField getKeywordsField() {
        return keywordsField;
    }

    /**
     * Sets the value of the keywordsField property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordsField }
     *     
     */
    public void setKeywordsField(KeywordsField value) {
        this.keywordsField = value;
    }

    /**
     * Gets the value of the tableField property.
     * 
     * @return
     *     possible object is
     *     {@link TaskTableField }
     *     
     */
    public TaskTableField getTableField() {
        return tableField;
    }

    /**
     * Sets the value of the tableField property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskTableField }
     *     
     */
    public void setTableField(TaskTableField value) {
        this.tableField = value;
    }

}
