
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Operator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Operator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Equals"/&gt;
 *     &lt;enumeration value="DoesNotEqual"/&gt;
 *     &lt;enumeration value="Contains"/&gt;
 *     &lt;enumeration value="DoesNotContain"/&gt;
 *     &lt;enumeration value="LessThan"/&gt;
 *     &lt;enumeration value="GreaterThan"/&gt;
 *     &lt;enumeration value="LessThanOrEqual"/&gt;
 *     &lt;enumeration value="GreaterThanOrEqual"/&gt;
 *     &lt;enumeration value="IsEmpty"/&gt;
 *     &lt;enumeration value="IsNotEmpty"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Operator")
@XmlEnum
public enum Operator {

    @XmlEnumValue("Equals")
    EQUALS("Equals"),
    @XmlEnumValue("DoesNotEqual")
    DOES_NOT_EQUAL("DoesNotEqual"),
    @XmlEnumValue("Contains")
    CONTAINS("Contains"),
    @XmlEnumValue("DoesNotContain")
    DOES_NOT_CONTAIN("DoesNotContain"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("LessThanOrEqual")
    LESS_THAN_OR_EQUAL("LessThanOrEqual"),
    @XmlEnumValue("GreaterThanOrEqual")
    GREATER_THAN_OR_EQUAL("GreaterThanOrEqual"),
    @XmlEnumValue("IsEmpty")
    IS_EMPTY("IsEmpty"),
    @XmlEnumValue("IsNotEmpty")
    IS_NOT_EMPTY("IsNotEmpty");
    private final String value;

    Operator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Operator fromValue(String v) {
        for (Operator c: Operator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
