
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of columns of dialog table field.
 * 
 * &lt;p&gt;Java class for DialogTableFieldColumns complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DialogTableFieldColumns"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DialogTableFieldColumn" type="{http://dev.docuware.com/schema/public/services/platform}DialogFieldBase" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogTableFieldColumns", propOrder = {
    "dialogTableFieldColumn"
})
public class DialogTableFieldColumns {

    /**
     * List of columns of dialog table field.
     * 
     */
    @XmlElement(name = "DialogTableFieldColumn")
    protected List<DialogFieldBase> dialogTableFieldColumn;

    /**
     * List of columns of dialog table field.
     * 
     * Gets the value of the dialogTableFieldColumn property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dialogTableFieldColumn property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDialogTableFieldColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DialogFieldBase }
     * </p>
     * 
     * 
     * @return
     *     The value of the dialogTableFieldColumn property.
     */
    public List<DialogFieldBase> getDialogTableFieldColumn() {
        if (dialogTableFieldColumn == null) {
            dialogTableFieldColumn = new ArrayList<>();
        }
        return this.dialogTableFieldColumn;
    }

}
