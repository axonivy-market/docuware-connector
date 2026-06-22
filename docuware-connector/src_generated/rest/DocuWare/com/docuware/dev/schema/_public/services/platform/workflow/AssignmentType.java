
package com.docuware.dev.schema._public.services.platform.workflow;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for AssignmentType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="AssignmentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GlobalVariable"/&gt;
 *     &lt;enumeration value="IndexField"/&gt;
 *     &lt;enumeration value="PDFFormField"/&gt;
 *     &lt;enumeration value="FileCabinetField"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "AssignmentType")
@XmlEnum
public enum AssignmentType {


    /**
     * Global variable
     * 
     */
    @XmlEnumValue("GlobalVariable")
    GLOBAL_VARIABLE("GlobalVariable"),

    /**
     * Index field
     * 
     */
    @XmlEnumValue("IndexField")
    INDEX_FIELD("IndexField"),

    /**
     * PDF form filed
     * 
     */
    @XmlEnumValue("PDFFormField")
    PDF_FORM_FIELD("PDFFormField"),

    /**
     * File cabinet filed
     * 
     */
    @XmlEnumValue("FileCabinetField")
    FILE_CABINET_FIELD("FileCabinetField");
    private final String value;

    AssignmentType(String v) {
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
    public static AssignmentType fromValue(String v) {
        for (AssignmentType c: AssignmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
