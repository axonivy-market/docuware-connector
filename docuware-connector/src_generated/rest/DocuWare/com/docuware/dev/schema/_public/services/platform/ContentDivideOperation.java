
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Subset of content operations.
 * 
 * &lt;p&gt;Java class for ContentDivideOperation&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="ContentDivideOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unclip"/&gt;
 *     &lt;enumeration value="Unstaple"/&gt;
 *     &lt;enumeration value="Split"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "ContentDivideOperation")
@XmlEnum
public enum ContentDivideOperation {


    /**
     * Split every section as a new document. Accept no arguments. Produce list of documents
     * 
     */
    @XmlEnumValue("Unclip")
    UNCLIP("Unclip"),

    /**
     * Split every page as a new document. Accept no arguments. Produce list of documents
     * 
     */
    @XmlEnumValue("Unstaple")
    UNSTAPLE("Unstaple"),

    /**
     * Split document on specific pages as new documents. Accept list of pages. Produce list of documents
     * 
     */
    @XmlEnumValue("Split")
    SPLIT("Split");
    private final String value;

    ContentDivideOperation(String v) {
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
    public static ContentDivideOperation fromValue(String v) {
        for (ContentDivideOperation c: ContentDivideOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
