
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of columns of dialog table field.
 * 
 * <p>Java class for DialogTableFieldColumns complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DialogTableFieldColumns"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DialogTableFieldColumn" type="{http://dev.docuware.com/schema/public/services/platform}DialogFieldBase" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogTableFieldColumns", propOrder = {
    "dialogTableFieldColumn"
})
public class DialogTableFieldColumns {

    @XmlElement(name = "DialogTableFieldColumn")
    protected List<DialogFieldBase> dialogTableFieldColumn;

    /**
     * Gets the value of the dialogTableFieldColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dialogTableFieldColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDialogTableFieldColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DialogFieldBase }
     * 
     * 
     */
    public List<DialogFieldBase> getDialogTableFieldColumn() {
        if (dialogTableFieldColumn == null) {
            dialogTableFieldColumn = new ArrayList<DialogFieldBase>();
        }
        return this.dialogTableFieldColumn;
    }

}
