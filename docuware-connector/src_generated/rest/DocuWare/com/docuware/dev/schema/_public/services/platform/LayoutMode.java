
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LayoutMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LayoutMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AllInOne"/&gt;
 *     &lt;enumeration value="Separate"/&gt;
 *     &lt;enumeration value="StoreView"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LayoutMode")
@XmlEnum
public enum LayoutMode {

    @XmlEnumValue("AllInOne")
    ALL_IN_ONE("AllInOne"),
    @XmlEnumValue("Separate")
    SEPARATE("Separate"),
    @XmlEnumValue("StoreView")
    STORE_VIEW("StoreView");
    private final String value;

    LayoutMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LayoutMode fromValue(String v) {
        for (LayoutMode c: LayoutMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
