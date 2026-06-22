
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for LetterCase&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="LetterCase"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="UpperCase"/&gt;
 *     &lt;enumeration value="LowerCase"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "LetterCase")
@XmlEnum
public enum LetterCase {


    /**
     * As in the database
     * 
     */
    @XmlEnumValue("Default")
    DEFAULT("Default"),

    /**
     * Upper case letters
     * 
     */
    @XmlEnumValue("UpperCase")
    UPPER_CASE("UpperCase"),

    /**
     * Lower case letters
     * 
     */
    @XmlEnumValue("LowerCase")
    LOWER_CASE("LowerCase");
    private final String value;

    LetterCase(String v) {
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
    public static LetterCase fromValue(String v) {
        for (LetterCase c: LetterCase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
