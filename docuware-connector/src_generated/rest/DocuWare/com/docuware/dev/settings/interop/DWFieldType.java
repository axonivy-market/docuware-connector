
package com.docuware.dev.settings.interop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type of a DocuWare file cabinet field.
 * 				Please Do Not Change order because it matches DocuWare.FileCabinet.Settings.DocuWareType
 * 
 * &lt;p&gt;Java class for DWFieldType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="DWFieldType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Text"/&gt;
 *     &lt;enumeration value="Numeric"/&gt;
 *     &lt;enumeration value="Memo"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="Keyword"/&gt;
 *     &lt;enumeration value="Decimal"/&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *     &lt;enumeration value="Table"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "DWFieldType", namespace = "http://dev.docuware.com/settings/interop")
@XmlEnum
public enum DWFieldType {

    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric"),
    @XmlEnumValue("Memo")
    MEMO("Memo"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Table")
    TABLE("Table");
    private final String value;

    DWFieldType(String v) {
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
    public static DWFieldType fromValue(String v) {
        for (DWFieldType c: DWFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
