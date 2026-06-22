
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for TableColumnValueTypeEnum&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="TableColumnValueTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Text"/&gt;
 *     &lt;enumeration value="Decimal"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "TableColumnValueTypeEnum")
@XmlEnum
public enum TableColumnValueTypeEnum {


    /**
     * Text column
     * 
     */
    @XmlEnumValue("Text")
    TEXT("Text"),

    /**
     * Decimal column
     * 
     */
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),

    /**
     * Date column
     * 
     */
    @XmlEnumValue("Date")
    DATE("Date"),

    /**
     * Date Time column
     * 
     */
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime");
    private final String value;

    TableColumnValueTypeEnum(String v) {
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
    public static TableColumnValueTypeEnum fromValue(String v) {
        for (TableColumnValueTypeEnum c: TableColumnValueTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
