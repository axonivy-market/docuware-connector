
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The CheckInRequestDocument enumeration specifies the document that has to be returned by check in operation.
 * 
 * &lt;p&gt;Java class for CheckInReturnDocument&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="CheckInReturnDocument"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Original"/&gt;
 *     &lt;enumeration value="CheckedIn"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "CheckInReturnDocument")
@XmlEnum
public enum CheckInReturnDocument {


    /**
     * Specifies that the original document should be returned.
     * 
     */
    @XmlEnumValue("Original")
    ORIGINAL("Original"),

    /**
     * Specifies that the currently checked in document should be returned.
     * 
     */
    @XmlEnumValue("CheckedIn")
    CHECKED_IN("CheckedIn");
    private final String value;

    CheckInReturnDocument(String v) {
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
    public static CheckInReturnDocument fromValue(String v) {
        for (CheckInReturnDocument c: CheckInReturnDocument.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
