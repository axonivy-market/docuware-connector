
package com.docuware.dev.schema._public.services.platform.workflow;

import com.docuware.dev.schema._public.services.platform.AnnotationPoint;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Data which is sent when a user confirm a task using a stamp.
 * 
 * &lt;p&gt;Java class for StampConfirmedData complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="StampConfirmedData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform/workflow}ConfirmedData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Position" type="{http://dev.docuware.com/schema/public/services/platform}AnnotationPoint" minOccurs="0"/&gt;
 *         &lt;element name="Section" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Page" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Layer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StampConfirmedData", propOrder = {
    "position",
    "section",
    "page",
    "layer"
})
public class StampConfirmedData
    extends ConfirmedData
{

    /**
     * Start point of the stamp.
     * 
     */
    @XmlElement(name = "Position")
    protected AnnotationPoint position;
    /**
     * Number of the section to set stamp.
     * 
     */
    @XmlElement(name = "Section")
    protected int section;
    /**
     * Number of the page to set stamp.
     * 
     */
    @XmlElement(name = "Page")
    protected int page;
    /**
     * Layer where the stamp have to be placed.
     * 
     */
    @XmlElement(name = "Layer")
    protected int layer;

    /**
     * Start point of the stamp.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationPoint }
     *     
     */
    public AnnotationPoint getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationPoint }
     *     
     * @see #getPosition()
     */
    public void setPosition(AnnotationPoint value) {
        this.position = value;
    }

    /**
     * Number of the section to set stamp.
     * 
     */
    public int getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     */
    public void setSection(int value) {
        this.section = value;
    }

    /**
     * Number of the page to set stamp.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

    /**
     * Layer where the stamp have to be placed.
     * 
     */
    public int getLayer() {
        return layer;
    }

    /**
     * Sets the value of the layer property.
     * 
     */
    public void setLayer(int value) {
        this.layer = value;
    }

}
