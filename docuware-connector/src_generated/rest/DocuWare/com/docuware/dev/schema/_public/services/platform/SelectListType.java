
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SelectListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Standard"/&gt;
 *     &lt;enumeration value="Multifield"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SelectListType")
@XmlEnum
public enum SelectListType {


    /**
     * Standard select list.
     * 
     */
    @XmlEnumValue("Standard")
    STANDARD("Standard"),

    /**
     * Multi-field select list.
     * 
     */
    @XmlEnumValue("Multifield")
    MULTIFIELD("Multifield");
    private final String value;

    SelectListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SelectListType fromValue(String v) {
        for (SelectListType c: SelectListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
