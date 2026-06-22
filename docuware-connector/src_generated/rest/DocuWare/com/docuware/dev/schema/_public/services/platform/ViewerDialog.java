
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ViewerDialog complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ViewerDialog"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Mode" type="{http://dev.docuware.com/schema/public/services/platform}ViewerDialogModes" default="AdHocEditMode" /&gt;
 *       &lt;attribute name="MarkFulltextSearchHits" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewerDialog")
public class ViewerDialog {

    /**
     * The mode in which the viewer is open to display a document from the result list
     * 
     */
    @XmlAttribute(name = "Mode")
    protected ViewerDialogModes mode;
    /**
     * Determines whether the occurrences that match the fulltext search are highlighted in the displayed document
     * 
     */
    @XmlAttribute(name = "MarkFulltextSearchHits")
    protected Boolean markFulltextSearchHits;

    /**
     * The mode in which the viewer is open to display a document from the result list
     * 
     * @return
     *     possible object is
     *     {@link ViewerDialogModes }
     *     
     */
    public ViewerDialogModes getMode() {
        if (mode == null) {
            return ViewerDialogModes.AD_HOC_EDIT_MODE;
        } else {
            return mode;
        }
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewerDialogModes }
     *     
     * @see #getMode()
     */
    public void setMode(ViewerDialogModes value) {
        this.mode = value;
    }

    /**
     * Determines whether the occurrences that match the fulltext search are highlighted in the displayed document
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMarkFulltextSearchHits() {
        if (markFulltextSearchHits == null) {
            return true;
        } else {
            return markFulltextSearchHits;
        }
    }

    /**
     * Sets the value of the markFulltextSearchHits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMarkFulltextSearchHits()
     */
    public void setMarkFulltextSearchHits(Boolean value) {
        this.markFulltextSearchHits = value;
    }

}
