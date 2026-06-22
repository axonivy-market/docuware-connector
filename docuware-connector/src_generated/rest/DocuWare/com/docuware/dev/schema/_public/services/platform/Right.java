
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for Right&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="Right"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Admin_Owner"/&gt;
 *     &lt;enumeration value="Admin_ModifyRight"/&gt;
 *     &lt;enumeration value="Admin_Operator"/&gt;
 *     &lt;enumeration value="Admin_EditDialogs"/&gt;
 *     &lt;enumeration value="Admin_MigrationAdministration"/&gt;
 *     &lt;enumeration value="General_Store"/&gt;
 *     &lt;enumeration value="General_Append"/&gt;
 *     &lt;enumeration value="General_Search"/&gt;
 *     &lt;enumeration value="General_Edit"/&gt;
 *     &lt;enumeration value="General_DisplayDocument"/&gt;
 *     &lt;enumeration value="General_EditDocuments"/&gt;
 *     &lt;enumeration value="General_DeleteDocuments"/&gt;
 *     &lt;enumeration value="General_Export"/&gt;
 *     &lt;enumeration value="General_AppendToReadOnly"/&gt;
 *     &lt;enumeration value="General_ChangeToReadOnly"/&gt;
 *     &lt;enumeration value="General_Checkout"/&gt;
 *     &lt;enumeration value="General_AddEntries"/&gt;
 *     &lt;enumeration value="Annotation_New"/&gt;
 *     &lt;enumeration value="Annotation_Delete"/&gt;
 *     &lt;enumeration value="Annotation_All"/&gt;
 *     &lt;enumeration value="Annotation_Hide"/&gt;
 *     &lt;enumeration value="Annotation_Stamp_New"/&gt;
 *     &lt;enumeration value="Annotation_Stamp_Hide"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "Right")
@XmlEnum
public enum Right {


    /**
     * Owner
     * 
     */
    @XmlEnumValue("Admin_Owner")
    ADMIN_OWNER("Admin_Owner"),

    /**
     * Modify Rights
     * 
     */
    @XmlEnumValue("Admin_ModifyRight")
    ADMIN_MODIFY_RIGHT("Admin_ModifyRight"),

    /**
     * Operator
     * 
     */
    @XmlEnumValue("Admin_Operator")
    ADMIN_OPERATOR("Admin_Operator"),

    /**
     * Edit dialogs
     * 
     */
    @XmlEnumValue("Admin_EditDialogs")
    ADMIN_EDIT_DIALOGS("Admin_EditDialogs"),

    /**
     * Migration
     * 
     */
    @XmlEnumValue("Admin_MigrationAdministration")
    ADMIN_MIGRATION_ADMINISTRATION("Admin_MigrationAdministration"),

    /**
     * Store
     * 
     */
    @XmlEnumValue("General_Store")
    GENERAL_STORE("General_Store"),

    /**
     * Append
     * 
     */
    @XmlEnumValue("General_Append")
    GENERAL_APPEND("General_Append"),

    /**
     * Search
     * 
     */
    @XmlEnumValue("General_Search")
    GENERAL_SEARCH("General_Search"),

    /**
     * Edit index data
     * 
     */
    @XmlEnumValue("General_Edit")
    GENERAL_EDIT("General_Edit"),

    /**
     * Display document
     * 
     */
    @XmlEnumValue("General_DisplayDocument")
    GENERAL_DISPLAY_DOCUMENT("General_DisplayDocument"),

    /**
     * Edit documents
     * 
     */
    @XmlEnumValue("General_EditDocuments")
    GENERAL_EDIT_DOCUMENTS("General_EditDocuments"),

    /**
     * Delete documents
     * 
     */
    @XmlEnumValue("General_DeleteDocuments")
    GENERAL_DELETE_DOCUMENTS("General_DeleteDocuments"),

    /**
     * Export
     * 
     */
    @XmlEnumValue("General_Export")
    GENERAL_EXPORT("General_Export"),

    /**
     * Append to read only
     * 
     */
    @XmlEnumValue("General_AppendToReadOnly")
    GENERAL_APPEND_TO_READ_ONLY("General_AppendToReadOnly"),

    /**
     * Modify read-only document
     * 
     */
    @XmlEnumValue("General_ChangeToReadOnly")
    GENERAL_CHANGE_TO_READ_ONLY("General_ChangeToReadOnly"),

    /**
     * Check out
     * 
     */
    @XmlEnumValue("General_Checkout")
    GENERAL_CHECKOUT("General_Checkout"),

    /**
     * (Obsolete.Moved on dialog level)Add Entries to Select-List-Only-Fields
     * 
     */
    @XmlEnumValue("General_AddEntries")
    GENERAL_ADD_ENTRIES("General_AddEntries"),

    /**
     * New annotations
     * 
     */
    @XmlEnumValue("Annotation_New")
    ANNOTATION_NEW("Annotation_New"),

    /**
     * Delete annotations
     * 
     */
    @XmlEnumValue("Annotation_Delete")
    ANNOTATION_DELETE("Annotation_Delete"),

    /**
     * Change annotations
     * 
     */
    @XmlEnumValue("Annotation_All")
    ANNOTATION_ALL("Annotation_All"),

    /**
     * Hide annotations
     * 
     */
    @XmlEnumValue("Annotation_Hide")
    ANNOTATION_HIDE("Annotation_Hide"),

    /**
     * New stamp
     * 
     */
    @XmlEnumValue("Annotation_Stamp_New")
    ANNOTATION_STAMP_NEW("Annotation_Stamp_New"),

    /**
     * Hide a stamp
     * 
     */
    @XmlEnumValue("Annotation_Stamp_Hide")
    ANNOTATION_STAMP_HIDE("Annotation_Stamp_Hide");
    private final String value;

    Right(String v) {
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
    public static Right fromValue(String v) {
        for (Right c: Right.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
