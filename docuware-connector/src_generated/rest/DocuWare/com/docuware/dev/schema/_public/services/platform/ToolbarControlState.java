
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ToolbarControlState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ToolbarControlState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Toggled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ToolbarControlState")
@XmlEnum
public enum ToolbarControlState {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Toggled")
    TOGGLED("Toggled");
    private final String value;

    ToolbarControlState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ToolbarControlState fromValue(String v) {
        for (ToolbarControlState c: ToolbarControlState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
