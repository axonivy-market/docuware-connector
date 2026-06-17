
package com.docuware.dev.schema._public.services.platform.workflow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.platform.AnnotationPoint;


/**
 * Data which is sent when a user confirm a task using a stamp.
 * 
 * <p>Java class for StampConfirmedData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
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
 * </pre>
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

    @XmlElement(name = "Position")
    protected AnnotationPoint position;
    @XmlElement(name = "Section")
    protected int section;
    @XmlElement(name = "Page")
    protected int page;
    @XmlElement(name = "Layer")
    protected int layer;

    /**
     * Gets the value of the position property.
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
     */
    public void setPosition(AnnotationPoint value) {
        this.position = value;
    }

    /**
     * Gets the value of the section property.
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
     * Gets the value of the page property.
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
     * Gets the value of the layer property.
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
