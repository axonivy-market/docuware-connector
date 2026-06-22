
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Structure for updating index fields, including the index fields values and the dialog used for updating.
 * 
 * &lt;p&gt;Java class for UpdateIndexFieldsInfo complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="UpdateIndexFieldsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexFields"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DialogId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NormalizeCoordinates" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateIndexFieldsInfo")
public class UpdateIndexFieldsInfo
    extends DocumentIndexFields
{

    /**
     * Define dialog which is used to update the fields. Used to override data that is not exposed to the user.
     * 
     */
    @XmlAttribute(name = "DialogId")
    protected String dialogId;
    /**
     * If this flag is true then the orientation of the coordinates in PointAndShootInfo will be aligned with the page.
     * 
     */
    @XmlAttribute(name = "NormalizeCoordinates")
    protected Boolean normalizeCoordinates;

    /**
     * Define dialog which is used to update the fields. Used to override data that is not exposed to the user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialogId() {
        return dialogId;
    }

    /**
     * Sets the value of the dialogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDialogId()
     */
    public void setDialogId(String value) {
        this.dialogId = value;
    }

    /**
     * If this flag is true then the orientation of the coordinates in PointAndShootInfo will be aligned with the page.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNormalizeCoordinates() {
        if (normalizeCoordinates == null) {
            return false;
        } else {
            return normalizeCoordinates;
        }
    }

    /**
     * Sets the value of the normalizeCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNormalizeCoordinates()
     */
    public void setNormalizeCoordinates(Boolean value) {
        this.normalizeCoordinates = value;
    }

}
