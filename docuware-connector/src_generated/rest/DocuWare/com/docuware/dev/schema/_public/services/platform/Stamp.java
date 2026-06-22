
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import com.docuware.dev.schema._public.services.Links;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Models a DocuWare stamp.
 * 
 * &lt;p&gt;Java class for Stamp complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Stamp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormField" type="{http://dev.docuware.com/schema/public/services/platform}StampFormField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Fields" type="{http://dev.docuware.com/schema/public/services/platform}StampField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HeadFont" type="{http://dev.docuware.com/schema/public/services/platform}Font"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="TextStamp" type="{http://dev.docuware.com/schema/public/services/platform}TextStamp"/&gt;
 *           &lt;element name="StrokeStamp" type="{http://dev.docuware.com/schema/public/services/platform}StrokeStamp"/&gt;
 *           &lt;element name="BitmapStamp" type="{http://dev.docuware.com/schema/public/services/platform}BitmapStamp"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PasswordProtected" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Signature" use="required" type="{http://dev.docuware.com/schema/public/services/platform}StampSignatureType" /&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DisplayName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsHidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="Autosave" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
 *       &lt;attribute name="CloseAfterStampSet" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="AutomaticallyOpenNextDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="KeepStampActive" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stamp", propOrder = {
    "formField",
    "fields",
    "headFont",
    "textStamp",
    "strokeStamp",
    "bitmapStamp",
    "links"
})
public class Stamp {

    /**
     * List of the stamp form fields.
     * 
     */
    @XmlElement(name = "FormField")
    protected List<StampFormField> formField;
    /**
     * List of the stamp fields.
     * 
     */
    @XmlElement(name = "Fields")
    protected List<StampField> fields;
    /**
     * Font for the additional items of information.
     * 
     */
    @XmlElement(name = "HeadFont", required = true)
    protected Font headFont;
    @XmlElement(name = "TextStamp")
    protected TextStamp textStamp;
    @XmlElement(name = "StrokeStamp")
    protected StrokeStamp strokeStamp;
    @XmlElement(name = "BitmapStamp")
    protected BitmapStamp bitmapStamp;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    /**
     * If this flag is true password is needed to place the stamp.
     * 
     */
    @XmlAttribute(name = "PasswordProtected", required = true)
    protected boolean passwordProtected;
    /**
     * The type of the stamp signature if there is any.
     * 
     */
    @XmlAttribute(name = "Signature", required = true)
    protected StampSignatureType signature;
    /**
     * The name of the stamp.
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    /**
     * The display name of the stamp.
     * 
     */
    @XmlAttribute(name = "DisplayName", required = true)
    protected String displayName;
    /**
     * If this flag is true the system will overwrite existing database entries with the stamp entries.
     * 
     */
    @XmlAttribute(name = "Overwrite")
    protected Boolean overwrite;
    /**
     * The id of the stamp, which is a GUID usually.
     * 
     */
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    /**
     * Determines whether the stamp is visible.
     * 
     */
    @XmlAttribute(name = "IsHidden")
    protected Boolean isHidden;
    /**
     * Automatically save the stamp after specified period in seconds. Value -1 mean the stamp have to be saved on user action.
     * 
     */
    @XmlAttribute(name = "Autosave")
    protected Integer autosave;
    /**
     * Automatically close the window after stamp is placed in a document
     * 
     */
    @XmlAttribute(name = "CloseAfterStampSet")
    protected Boolean closeAfterStampSet;
    /**
     * Determines whether the stamp remains active after being stored.
     * 
     */
    @XmlAttribute(name = "AutomaticallyOpenNextDocument")
    protected Boolean automaticallyOpenNextDocument;
    /**
     * Determines whether next document is opened automatically after the stamp is stored.
     * 
     */
    @XmlAttribute(name = "KeepStampActive")
    protected Boolean keepStampActive;

    /**
     * List of the stamp form fields.
     * 
     * Gets the value of the formField property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the formField property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFormField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StampFormField }
     * </p>
     * 
     * 
     * @return
     *     The value of the formField property.
     */
    public List<StampFormField> getFormField() {
        if (formField == null) {
            formField = new ArrayList<>();
        }
        return this.formField;
    }

    /**
     * List of the stamp fields.
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
     * {@link StampField }
     * </p>
     * 
     * 
     * @return
     *     The value of the fields property.
     */
    public List<StampField> getFields() {
        if (fields == null) {
            fields = new ArrayList<>();
        }
        return this.fields;
    }

    /**
     * Font for the additional items of information.
     * 
     * @return
     *     possible object is
     *     {@link Font }
     *     
     */
    public Font getHeadFont() {
        return headFont;
    }

    /**
     * Sets the value of the headFont property.
     * 
     * @param value
     *     allowed object is
     *     {@link Font }
     *     
     * @see #getHeadFont()
     */
    public void setHeadFont(Font value) {
        this.headFont = value;
    }

    /**
     * Gets the value of the textStamp property.
     * 
     * @return
     *     possible object is
     *     {@link TextStamp }
     *     
     */
    public TextStamp getTextStamp() {
        return textStamp;
    }

    /**
     * Sets the value of the textStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextStamp }
     *     
     */
    public void setTextStamp(TextStamp value) {
        this.textStamp = value;
    }

    /**
     * Gets the value of the strokeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link StrokeStamp }
     *     
     */
    public StrokeStamp getStrokeStamp() {
        return strokeStamp;
    }

    /**
     * Sets the value of the strokeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrokeStamp }
     *     
     */
    public void setStrokeStamp(StrokeStamp value) {
        this.strokeStamp = value;
    }

    /**
     * Gets the value of the bitmapStamp property.
     * 
     * @return
     *     possible object is
     *     {@link BitmapStamp }
     *     
     */
    public BitmapStamp getBitmapStamp() {
        return bitmapStamp;
    }

    /**
     * Sets the value of the bitmapStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BitmapStamp }
     *     
     */
    public void setBitmapStamp(BitmapStamp value) {
        this.bitmapStamp = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link Links }
     *     
     */
    public Links getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link Links }
     *     
     */
    public void setLinks(Links value) {
        this.links = value;
    }

    /**
     * If this flag is true password is needed to place the stamp.
     * 
     */
    public boolean isPasswordProtected() {
        return passwordProtected;
    }

    /**
     * Sets the value of the passwordProtected property.
     * 
     */
    public void setPasswordProtected(boolean value) {
        this.passwordProtected = value;
    }

    /**
     * The type of the stamp signature if there is any.
     * 
     * @return
     *     possible object is
     *     {@link StampSignatureType }
     *     
     */
    public StampSignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link StampSignatureType }
     *     
     * @see #getSignature()
     */
    public void setSignature(StampSignatureType value) {
        this.signature = value;
    }

    /**
     * The name of the stamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * The display name of the stamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDisplayName()
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * If this flag is true the system will overwrite existing database entries with the stamp entries.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOverwrite() {
        if (overwrite == null) {
            return false;
        } else {
            return overwrite;
        }
    }

    /**
     * Sets the value of the overwrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isOverwrite()
     */
    public void setOverwrite(Boolean value) {
        this.overwrite = value;
    }

    /**
     * The id of the stamp, which is a GUID usually.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getId()
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Determines whether the stamp is visible.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsHidden() {
        if (isHidden == null) {
            return false;
        } else {
            return isHidden;
        }
    }

    /**
     * Sets the value of the isHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsHidden()
     */
    public void setIsHidden(Boolean value) {
        this.isHidden = value;
    }

    /**
     * Automatically save the stamp after specified period in seconds. Value -1 mean the stamp have to be saved on user action.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getAutosave() {
        if (autosave == null) {
            return -1;
        } else {
            return autosave;
        }
    }

    /**
     * Sets the value of the autosave property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getAutosave()
     */
    public void setAutosave(Integer value) {
        this.autosave = value;
    }

    /**
     * Automatically close the window after stamp is placed in a document
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCloseAfterStampSet() {
        if (closeAfterStampSet == null) {
            return false;
        } else {
            return closeAfterStampSet;
        }
    }

    /**
     * Sets the value of the closeAfterStampSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCloseAfterStampSet()
     */
    public void setCloseAfterStampSet(Boolean value) {
        this.closeAfterStampSet = value;
    }

    /**
     * Determines whether the stamp remains active after being stored.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAutomaticallyOpenNextDocument() {
        if (automaticallyOpenNextDocument == null) {
            return false;
        } else {
            return automaticallyOpenNextDocument;
        }
    }

    /**
     * Sets the value of the automaticallyOpenNextDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAutomaticallyOpenNextDocument()
     */
    public void setAutomaticallyOpenNextDocument(Boolean value) {
        this.automaticallyOpenNextDocument = value;
    }

    /**
     * Determines whether next document is opened automatically after the stamp is stored.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isKeepStampActive() {
        if (keepStampActive == null) {
            return false;
        } else {
            return keepStampActive;
        }
    }

    /**
     * Sets the value of the keepStampActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isKeepStampActive()
     */
    public void setKeepStampActive(Boolean value) {
        this.keepStampActive = value;
    }

}
