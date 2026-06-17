
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViewerToolbarType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ViewerToolbarType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Navigation"/&gt;
 *     &lt;enumeration value="Tools"/&gt;
 *     &lt;enumeration value="Display"/&gt;
 *     &lt;enumeration value="Stamps"/&gt;
 *     &lt;enumeration value="DocOverview"/&gt;
 *     &lt;enumeration value="Annotations"/&gt;
 *     &lt;enumeration value="DocLinks"/&gt;
 *     &lt;enumeration value="BWMStamps"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ViewerToolbarType")
@XmlEnum
public enum ViewerToolbarType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Navigation")
    NAVIGATION("Navigation"),
    @XmlEnumValue("Tools")
    TOOLS("Tools"),
    @XmlEnumValue("Display")
    DISPLAY("Display"),
    @XmlEnumValue("Stamps")
    STAMPS("Stamps"),
    @XmlEnumValue("DocOverview")
    DOC_OVERVIEW("DocOverview"),
    @XmlEnumValue("Annotations")
    ANNOTATIONS("Annotations"),
    @XmlEnumValue("DocLinks")
    DOC_LINKS("DocLinks"),
    @XmlEnumValue("BWMStamps")
    BWM_STAMPS("BWMStamps");
    private final String value;

    ViewerToolbarType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ViewerToolbarType fromValue(String v) {
        for (ViewerToolbarType c: ViewerToolbarType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
