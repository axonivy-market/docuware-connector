
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Supported operations for dialog expression
 * 
 * &lt;p&gt;Java class for DialogExpressionOperation&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="DialogExpressionOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="And"/&gt;
 *     &lt;enumeration value="Or"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "DialogExpressionOperation")
@XmlEnum
public enum DialogExpressionOperation {


    /**
     * All conditions must be fulfilled.
     * 
     */
    @XmlEnumValue("And")
    AND("And"),

    /**
     * At least one condition must be fulfilled.
     * 
     */
    @XmlEnumValue("Or")
    OR("Or");
    private final String value;

    DialogExpressionOperation(String v) {
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
    public static DialogExpressionOperation fromValue(String v) {
        for (DialogExpressionOperation c: DialogExpressionOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
