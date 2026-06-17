
package com.docuware.dev.schema._public.services.annotations;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;


/**
 * <p>Java class for ContentTypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentTypeList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="ContentType"&gt;
 *             &lt;complexType&gt;
 *               &lt;simpleContent&gt;
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                   &lt;attribute name="IntroducedIn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/extension&gt;
 *               &lt;/simpleContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="SchemaType"&gt;
 *             &lt;complexType&gt;
 *               &lt;simpleContent&gt;
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;QName"&gt;
 *                   &lt;attribute name="IntroducedIn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/extension&gt;
 *               &lt;/simpleContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ComplexType"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;any/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="IntroducedIn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IntroducedIn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentTypeList", propOrder = {
    "contentTypeOrSchemaTypeOrComplexType"
})
public class ContentTypeList {

    @XmlElements({
        @XmlElement(name = "ContentType", type = ContentTypeList.ContentType.class),
        @XmlElement(name = "SchemaType", type = ContentTypeList.SchemaType.class),
        @XmlElement(name = "ComplexType", type = ContentTypeList.ComplexType.class)
    })
    protected List<Object> contentTypeOrSchemaTypeOrComplexType;
    @XmlAttribute(name = "IntroducedIn")
    protected String introducedIn;

    /**
     * Gets the value of the contentTypeOrSchemaTypeOrComplexType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentTypeOrSchemaTypeOrComplexType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentTypeOrSchemaTypeOrComplexType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentTypeList.ContentType }
     * {@link ContentTypeList.SchemaType }
     * {@link ContentTypeList.ComplexType }
     * 
     * 
     */
    public List<Object> getContentTypeOrSchemaTypeOrComplexType() {
        if (contentTypeOrSchemaTypeOrComplexType == null) {
            contentTypeOrSchemaTypeOrComplexType = new ArrayList<Object>();
        }
        return this.contentTypeOrSchemaTypeOrComplexType;
    }

    /**
     * Gets the value of the introducedIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroducedIn() {
        return introducedIn;
    }

    /**
     * Sets the value of the introducedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroducedIn(String value) {
        this.introducedIn = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="IntroducedIn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class ComplexType {

        @XmlAnyElement(lax = true)
        protected Object any;
        @XmlAttribute(name = "IntroducedIn")
        protected String introducedIn;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        /**
         * Gets the value of the introducedIn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntroducedIn() {
            return introducedIn;
        }

        /**
         * Sets the value of the introducedIn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntroducedIn(String value) {
            this.introducedIn = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="IntroducedIn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ContentType {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "IntroducedIn")
        protected String introducedIn;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the introducedIn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntroducedIn() {
            return introducedIn;
        }

        /**
         * Sets the value of the introducedIn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntroducedIn(String value) {
            this.introducedIn = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;QName"&gt;
     *       &lt;attribute name="IntroducedIn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class SchemaType {

        @XmlValue
        protected QName value;
        @XmlAttribute(name = "IntroducedIn")
        protected String introducedIn;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link QName }
         *     
         */
        public QName getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link QName }
         *     
         */
        public void setValue(QName value) {
            this.value = value;
        }

        /**
         * Gets the value of the introducedIn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntroducedIn() {
            return introducedIn;
        }

        /**
         * Sets the value of the introducedIn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntroducedIn(String value) {
            this.introducedIn = value;
        }

    }

}
