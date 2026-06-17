
package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
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
 * </pre>
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

    public String value() {
        return value;
    }

    public static DocumentAction fromValue(String v) {
        for (DocumentAction c: DocumentAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
