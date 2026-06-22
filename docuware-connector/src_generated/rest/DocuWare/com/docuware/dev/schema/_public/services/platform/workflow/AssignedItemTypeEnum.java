
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for AssignedItemTypeEnum&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="AssignedItemTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="User"/&gt;
 *     &lt;enumeration value="Role"/&gt;
 *     &lt;enumeration value="SubstitutionRule"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
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
    public static AssignedItemTypeEnum fromValue(String v) {
        for (AssignedItemTypeEnum c: AssignedItemTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
