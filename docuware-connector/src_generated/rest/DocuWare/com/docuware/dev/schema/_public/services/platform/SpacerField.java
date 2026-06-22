
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SpacerField complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SpacerField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}WebFormField"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayLine" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
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
