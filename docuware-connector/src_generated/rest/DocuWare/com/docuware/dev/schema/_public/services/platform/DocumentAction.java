
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Actions pereformed on document (ReIntellix e.g.)
 * 
 * &lt;p&gt;Java class for DocumentAction&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="DocumentAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ReIntellix"/&gt;
 *     &lt;enumeration value="Append"/&gt;
 *     &lt;enumeration value="SetLatestVersion"/&gt;
 *     &lt;enumeration value="UndoCheckOut"/&gt;
 *     &lt;enumeration value="CheckOut"/&gt;
 *     &lt;enumeration value="CheckIn"/&gt;
 *     &lt;enumeration value="EnhanceImage"/&gt;
 *     &lt;enumeration value="MergeAnnotations"/&gt;
 *     &lt;enumeration value="RotatePage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "DocumentAction")
@XmlEnum
public enum DocumentAction {


    /**
     * Resend textshots to Intellix
     * 
     */
    @XmlEnumValue("ReIntellix")
    RE_INTELLIX("ReIntellix"),

    /**
     * Append documents form other cabinet to document
     * 
     */
    @XmlEnumValue("Append")
    APPEND("Append"),

    /**
     * Set document as latest version
     * 
     */
    @XmlEnumValue("SetLatestVersion")
    SET_LATEST_VERSION("SetLatestVersion"),

    /**
     * Undo check out of the document
     * 
     */
    @XmlEnumValue("UndoCheckOut")
    UNDO_CHECK_OUT("UndoCheckOut"),

    /**
     * Check out document to specific cabinet. Accept CheckOutActionParameters
     * 
     */
    @XmlEnumValue("CheckOut")
    CHECK_OUT("CheckOut"),

    /**
     * Check in document to the original cabinet. Accept CheckInActionParameters
     * 
     */
    @XmlEnumValue("CheckIn")
    CHECK_IN("CheckIn"),

    /**
     * Enchance section image by applying deskew and rotate. Accept EnhanceImageParameters
     * 
     */
    @XmlEnumValue("EnhanceImage")
    ENHANCE_IMAGE("EnhanceImage"),

    /**
     * Merge annotations into section image. Aplicable only for PDFs. Accept MergeAnnotationsParameters
     * 
     */
    @XmlEnumValue("MergeAnnotations")
    MERGE_ANNOTATIONS("MergeAnnotations"),

    /**
     * Rotate section page (image + annotations). Aplicable only for raster files and PDFs. Accept RotatePageParameters
     * 
     */
    @XmlEnumValue("RotatePage")
    ROTATE_PAGE("RotatePage");
    private final String value;

    DocumentAction(String v) {
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
    public static DocumentAction fromValue(String v) {
        for (DocumentAction c: DocumentAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
