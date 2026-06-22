
package com.docuware.dev._public.intellix;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for Rotation&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="Rotation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Rotate0Degree"/&gt;
 *     &lt;enumeration value="Rotate90Degree"/&gt;
 *     &lt;enumeration value="Rotate180Degree"/&gt;
 *     &lt;enumeration value="Rotate270Degree"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "Rotation")
@XmlEnum
public enum Rotation {


    /**
     * The original page is not rotated.
     * 
     */
    @XmlEnumValue("Rotate0Degree")
    ROTATE_0_DEGREE("Rotate0Degree"),

    /**
     * The original page has to be rotated by 90 degree clock wise in order to match the text shot.
     * 
     */
    @XmlEnumValue("Rotate90Degree")
    ROTATE_90_DEGREE("Rotate90Degree"),

    /**
     * The original page has to be rotated by 180 degree order to match the text shot.
     * 
     */
    @XmlEnumValue("Rotate180Degree")
    ROTATE_180_DEGREE("Rotate180Degree"),

    /**
     * The original page has to be rotated by 270 degree clock wise (that is, 90 degree clock-wise) in order to match the text shot.
     * 
     */
    @XmlEnumValue("Rotate270Degree")
    ROTATE_270_DEGREE("Rotate270Degree");
    private final String value;

    Rotation(String v) {
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
    public static Rotation fromValue(String v) {
        for (Rotation c: Rotation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
