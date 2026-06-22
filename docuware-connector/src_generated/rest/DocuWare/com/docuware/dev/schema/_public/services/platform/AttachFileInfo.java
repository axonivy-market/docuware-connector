
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AttachFileInfo complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="AttachFileInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FormattedSize" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Source" type="{http://dev.docuware.com/schema/public/services/platform}FileSource"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachFileInfo", propOrder = {
    "name",
    "formattedSize",
    "source"
})
public class AttachFileInfo {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "FormattedSize", required = true)
    protected String formattedSize;
    @XmlElement(name = "Source", required = true)
    @XmlSchemaType(name = "string")
    protected FileSource source;

    /**
     * Gets the value of the name property.
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
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the formattedSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedSize() {
        return formattedSize;
    }

    /**
     * Sets the value of the formattedSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedSize(String value) {
        this.formattedSize = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link FileSource }
     *     
     */
    public FileSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSource }
     *     
     */
    public void setSource(FileSource value) {
        this.source = value;
    }

}
