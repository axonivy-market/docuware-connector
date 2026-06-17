
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentMergeOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentMergeOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Clip"/&gt;
 *     &lt;enumeration value="Staple"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContentMergeOperation")
@XmlEnum
public enum ContentMergeOperation {


    /**
     * Merge documents in one document with multiple sections. Accept list of documents. Produce a document
     * 
     */
    @XmlEnumValue("Clip")
    CLIP("Clip"),

    /**
     * Merge documents as one section with multiple pages. Accept list of documents. Produce a document
     * 
     */
    @XmlEnumValue("Staple")
    STAPLE("Staple");
    private final String value;

    ContentMergeOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContentMergeOperation fromValue(String v) {
        for (ContentMergeOperation c: ContentMergeOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
