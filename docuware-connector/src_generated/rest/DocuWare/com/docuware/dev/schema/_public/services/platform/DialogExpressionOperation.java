
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DialogExpressionOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DialogExpressionOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="And"/&gt;
 *     &lt;enumeration value="Or"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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

    public String value() {
        return value;
    }

    public static DialogExpressionOperation fromValue(String v) {
        for (DialogExpressionOperation c: DialogExpressionOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
