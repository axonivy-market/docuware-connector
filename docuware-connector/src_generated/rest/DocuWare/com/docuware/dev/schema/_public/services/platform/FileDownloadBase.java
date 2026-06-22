
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define how a page of a document can be downloaded
 * 
 * &lt;p&gt;Java class for FileDownloadBase complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FileDownloadBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Layers" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="KeepAnnotations" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDownloadBase", propOrder = {
    "layers"
})
@XmlSeeAlso({
    FileDownload.class,
    FileDownloadPage.class
})
public abstract class FileDownloadBase {

    /**
     * This flag applies only to the PDF target format.
     * 
     */
    @XmlElement(name = "Layers", type = Integer.class)
    protected List<Integer> layers;
    /**
     * This flag applies only to the PDF target format.
     * 
     */
    @XmlAttribute(name = "KeepAnnotations")
    protected Boolean keepAnnotations;

    /**
     * This flag applies only to the PDF target format.
     * 
     * Gets the value of the layers property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the layers property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLayers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the layers property.
     */
    public List<Integer> getLayers() {
        if (layers == null) {
            layers = new ArrayList<>();
        }
        return this.layers;
    }

    /**
     * This flag applies only to the PDF target format.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isKeepAnnotations() {
        if (keepAnnotations == null) {
            return true;
        } else {
            return keepAnnotations;
        }
    }

    /**
     * Sets the value of the keepAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isKeepAnnotations()
     */
    public void setKeepAnnotations(Boolean value) {
        this.keepAnnotations = value;
    }

}
