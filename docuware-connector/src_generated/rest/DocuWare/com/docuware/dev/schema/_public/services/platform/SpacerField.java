
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpacerField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpacerField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}WebFormField"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayLine" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpacerField", propOrder = {
    "displayLine"
})
public class SpacerField
    extends WebFormField
{

    @XmlElement(name = "DisplayLine")
    protected boolean displayLine;

    /**
     * Gets the value of the displayLine property.
     * 
     */
    public boolean isDisplayLine() {
        return displayLine;
    }

    /**
     * Sets the value of the displayLine property.
     * 
     */
    public void setDisplayLine(boolean value) {
        this.displayLine = value;
    }

}
