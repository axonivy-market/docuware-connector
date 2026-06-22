
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for FormTypeEnum&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="FormTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Link"/&gt;
 *     &lt;enumeration value="Description"/&gt;
 *     &lt;enumeration value="Password"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *     &lt;enumeration value="Decimal"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *     &lt;enumeration value="User"/&gt;
 *     &lt;enumeration value="Role"/&gt;
 *     &lt;enumeration value="SubstitutionRule"/&gt;
 *     &lt;enumeration value="Keyword"/&gt;
 *     &lt;enumeration value="Table"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "FormTypeEnum")
@XmlEnum
public enum FormTypeEnum {


    /**
     * Link form
     * 
     */
    @XmlEnumValue("Link")
    LINK("Link"),

    /**
     * Description form
     * 
     */
    @XmlEnumValue("Description")
    DESCRIPTION("Description"),

    /**
     * Password field
     * 
     */
    @XmlEnumValue("Password")
    PASSWORD("Password"),

    /**
     * Text field
     * 
     */
    @XmlEnumValue("Text")
    TEXT("Text"),

    /**
     * Decimal field
     * 
     */
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),

    /**
     * Date field
     * 
     */
    @XmlEnumValue("Date")
    DATE("Date"),

    /**
     * DateTime field
     * 
     */
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),

    /**
     * User field
     * 
     */
    @XmlEnumValue("User")
    USER("User"),

    /**
     * Role field
     * 
     */
    @XmlEnumValue("Role")
    ROLE("Role"),

    /**
     * Substitution rule field
     * 
     */
    @XmlEnumValue("SubstitutionRule")
    SUBSTITUTION_RULE("SubstitutionRule"),

    /**
     * Keyword field
     * 
     */
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),

    /**
     * Table field
     * 
     */
    @XmlEnumValue("Table")
    TABLE("Table");
    private final String value;

    FormTypeEnum(String v) {
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
    public static FormTypeEnum fromValue(String v) {
        for (FormTypeEnum c: FormTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
