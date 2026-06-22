
package com.docuware.dev._public.intellix;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for LineStyle&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="LineStyle"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="single"/&gt;
 *     &lt;enumeration value="dotted"/&gt;
 *     &lt;enumeration value="thick"/&gt;
 *     &lt;enumeration value="dash"/&gt;
 *     &lt;enumeration value="double"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "LineStyle")
@XmlEnum
public enum LineStyle {


    /**
     * The line isn't visible
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * The line is a single continous line
     * 
     */
    @XmlEnumValue("single")
    SINGLE("single"),

    /**
     * The line consist of many dot
     * 
     */
    @XmlEnumValue("dotted")
    DOTTED("dotted"),

    /**
     * A thick continous line
     * 
     */
    @XmlEnumValue("thick")
    THICK("thick"),

    /**
     * The line consist of many dash
     * 
     */
    @XmlEnumValue("dash")
    DASH("dash"),

    /**
     * Two single continous line
     * 
     */
    @XmlEnumValue("double")
    DOUBLE("double");
    private final String value;

    LineStyle(String v) {
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
    public static LineStyle fromValue(String v) {
        for (LineStyle c: LineStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
