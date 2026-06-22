
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Mode in which the viewer is opened to display a document
 * 
 * &lt;p&gt;Java class for ViewerDialogModes&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="ViewerDialogModes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EditMode"/&gt;
 *     &lt;enumeration value="AdHocEditMode"/&gt;
 *     &lt;enumeration value="ReadOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "ViewerDialogModes")
@XmlEnum
public enum ViewerDialogModes {


    /**
     * Document is opened for editing and is locked for other users until it's closed.
     * 
     */
    @XmlEnumValue("EditMode")
    EDIT_MODE("EditMode"),

    /**
     * Document is opened for editing and is locked only while editing.
     * 
     */
    @XmlEnumValue("AdHocEditMode")
    AD_HOC_EDIT_MODE("AdHocEditMode"),

    /**
     * Document is opened as read-only.
     * 
     */
    @XmlEnumValue("ReadOnly")
    READ_ONLY("ReadOnly");
    private final String value;

    ViewerDialogModes(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static ViewerDialogModes fromValue(String v) {
        for (ViewerDialogModes c: ViewerDialogModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
