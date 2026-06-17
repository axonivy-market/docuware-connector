
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentDivideOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentDivideOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unclip"/&gt;
 *     &lt;enumeration value="Unstaple"/&gt;
 *     &lt;enumeration value="Split"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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

    public String value() {
        return value;
    }

    public static ContentDivideOperation fromValue(String v) {
        for (ContentDivideOperation c: ContentDivideOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
