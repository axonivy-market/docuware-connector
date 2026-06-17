
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LetterCase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LetterCase"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="UpperCase"/&gt;
 *     &lt;enumeration value="LowerCase"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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

    public String value() {
        return value;
    }

    public static LetterCase fromValue(String v) {
        for (LetterCase c: LetterCase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
