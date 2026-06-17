
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViewerDialogModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ViewerDialogModes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EditMode"/&gt;
 *     &lt;enumeration value="AdHocEditMode"/&gt;
 *     &lt;enumeration value="ReadOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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

    public String value() {
        return value;
    }

    public static ViewerDialogModes fromValue(String v) {
        for (ViewerDialogModes c: ViewerDialogModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
