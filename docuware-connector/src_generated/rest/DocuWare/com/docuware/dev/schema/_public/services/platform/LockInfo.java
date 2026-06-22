
package com.docuware.dev.schema._public.services.platform;

import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Define how a document will be locked
 * 
 * &lt;p&gt;Java class for LockInfo complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="LockInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Interval" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="Operation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LockInfo")
public class LockInfo {

    /**
     * Define the lifetime interval for the lock.
     *           This parameter contains a time interval specification in the form:
     *           [ws][-]{ d | [d.]hh:mm[:ss[.ff]] }[ws]
     *           Elements in square brackets ([ and ]) are optional. One selection from the list of alternatives enclosed in braces ({ and }) and separated by vertical bars (|) is required.
     *           For more details check http://msdn.microsoft.com/en-us/library/se73z7b9.aspx
     * 
     */
    @XmlAttribute(name = "Interval")
    protected Duration interval;
    /**
     * Optional arbitrary string that define the purpose of the lock operation. Only one operation will successfully apply a lock on one document at same time.
     * 
     */
    @XmlAttribute(name = "Operation")
    protected String operation;

    /**
     * Define the lifetime interval for the lock.
     *           This parameter contains a time interval specification in the form:
     *           [ws][-]{ d | [d.]hh:mm[:ss[.ff]] }[ws]
     *           Elements in square brackets ([ and ]) are optional. One selection from the list of alternatives enclosed in braces ({ and }) and separated by vertical bars (|) is required.
     *           For more details check http://msdn.microsoft.com/en-us/library/se73z7b9.aspx
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getInterval()
     */
    public void setInterval(Duration value) {
        this.interval = value;
    }

    /**
     * Optional arbitrary string that define the purpose of the lock operation. Only one operation will successfully apply a lock on one document at same time.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperation()
     */
    public void setOperation(String value) {
        this.operation = value;
    }

}
