
package com.docuware.dev.schema._public.services.platform.workflow;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A history step for Assign data activity.
 * 
 * &lt;p&gt;Java class for AssignDataHistoryStep complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="AssignDataHistoryStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fields" type="{http://dev.docuware.com/schema/public/services/platform/workflow}HistoryField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FileCabinetFields" type="{http://dev.docuware.com/schema/public/services/platform/workflow}FileCabinetHistoryField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignDataHistoryStep", propOrder = {
    "fields",
    "fileCabinetFields"
})
public class AssignDataHistoryStep {

    /**
     * List of assignments fields. The label is destination field name. The "Value" property is assigned value in it.
     * 
     */
    @XmlElement(name = "Fields")
    protected List<HistoryField> fields;
    /**
     * List of assignments file cabinet fields. The label is destination field name. The "Value" property is assigned value in it.
     * 
     */
    @XmlElement(name = "FileCabinetFields")
    protected List<FileCabinetHistoryField> fileCabinetFields;

    /**
     * List of assignments fields. The label is destination field name. The "Value" property is assigned value in it.
     * 
     * Gets the value of the fields property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fields property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFields().add(newItem);
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
     *     The value of the fields property.
     */
    public List<HistoryField> getFields() {
        if (fields == null) {
            fields = new ArrayList<>();
        }
        return this.fields;
    }

    /**
     * List of assignments file cabinet fields. The label is destination field name. The "Value" property is assigned value in it.
     * 
     * Gets the value of the fileCabinetFields property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fileCabinetFields property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFileCabinetFields().add(newItem);
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
     *     The value of the fileCabinetFields property.
     */
    public List<FileCabinetHistoryField> getFileCabinetFields() {
        if (fileCabinetFields == null) {
            fileCabinetFields = new ArrayList<>();
        }
        return this.fileCabinetFields;
    }

}
