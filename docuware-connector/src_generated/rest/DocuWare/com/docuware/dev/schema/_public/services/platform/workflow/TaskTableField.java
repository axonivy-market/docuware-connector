
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A table field.
 * 
 * &lt;p&gt;Java class for TaskTableField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="TaskTableField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform/workflow}BaseForm"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Columns" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TaskTableColumn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InitialValues" type="{http://dev.docuware.com/schema/public/services/platform/workflow}TaskTableFieldInitialValues"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FieldName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskTableField", propOrder = {
    "columns",
    "initialValues"
})
public class TaskTableField
    extends BaseForm
{

    /**
     * Table field columns.
     * 
     */
    @XmlElement(name = "Columns")
    protected List<TaskTableColumn> columns;
    /**
     * Table field prefilled values
     * 
     */
    @XmlElement(name = "InitialValues", required = true)
    protected TaskTableFieldInitialValues initialValues;
    /**
     * DbName of the table field.
     * 
     */
    @XmlAttribute(name = "FieldName", required = true)
    protected String fieldName;

    /**
     * Table field columns.
     * 
     * Gets the value of the columns property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the columns property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskTableColumn }
     * </p>
     * 
     * 
     * @return
     *     The value of the columns property.
     */
    public List<TaskTableColumn> getColumns() {
        if (columns == null) {
            columns = new ArrayList<>();
        }
        return this.columns;
    }

    /**
     * Table field prefilled values
     * 
     * @return
     *     possible object is
     *     {@link TaskTableFieldInitialValues }
     *     
     */
    public TaskTableFieldInitialValues getInitialValues() {
        return initialValues;
    }

    /**
     * Sets the value of the initialValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskTableFieldInitialValues }
     *     
     * @see #getInitialValues()
     */
    public void setInitialValues(TaskTableFieldInitialValues value) {
        this.initialValues = value;
    }

    /**
     * DbName of the table field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFieldName()
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

}
