
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for WorkAreaType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="WorkAreaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Basket"/&gt;
 *     &lt;enumeration value="Search"/&gt;
 *     &lt;enumeration value="TaskList"/&gt;
 *     &lt;enumeration value="Workflow"/&gt;
 *     &lt;enumeration value="TreeView"/&gt;
 *     &lt;enumeration value="Forms"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "WorkAreaType")
@XmlEnum
public enum WorkAreaType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Basket")
    BASKET("Basket"),
    @XmlEnumValue("Search")
    SEARCH("Search"),
    @XmlEnumValue("TaskList")
    TASK_LIST("TaskList"),
    @XmlEnumValue("Workflow")
    WORKFLOW("Workflow"),
    @XmlEnumValue("TreeView")
    TREE_VIEW("TreeView"),
    @XmlEnumValue("Forms")
    FORMS("Forms");
    private final String value;

    WorkAreaType(String v) {
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
    public static WorkAreaType fromValue(String v) {
        for (WorkAreaType c: WorkAreaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
