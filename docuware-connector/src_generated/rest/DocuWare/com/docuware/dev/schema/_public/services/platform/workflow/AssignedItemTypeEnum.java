
package com.docuware.dev.schema._public.services.platform.workflow;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssignedItemTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssignedItemTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="User"/&gt;
 *     &lt;enumeration value="Role"/&gt;
 *     &lt;enumeration value="SubstitutionRule"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssignedItemTypeEnum")
@XmlEnum
public enum AssignedItemTypeEnum {


    /**
     * User
     * 
     */
    @XmlEnumValue("User")
    USER("User"),

    /**
     * Role
     * 
     */
    @XmlEnumValue("Role")
    ROLE("Role"),

    /**
     * Substitution rule
     * 
     */
    @XmlEnumValue("SubstitutionRule")
    SUBSTITUTION_RULE("SubstitutionRule");
    private final String value;

    AssignedItemTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssignedItemTypeEnum fromValue(String v) {
        for (AssignedItemTypeEnum c: AssignedItemTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
