
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Subset of content operations.
 * 
 * &lt;p&gt;Java class for ContentMergeOperation&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="ContentMergeOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Clip"/&gt;
 *     &lt;enumeration value="Staple"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
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
    public static ContentMergeOperation fromValue(String v) {
        for (ContentMergeOperation c: ContentMergeOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
