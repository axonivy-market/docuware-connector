
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AnyExpression complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="AnyExpression"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="StringConstant" type="{http://dev.docuware.com/schema/public/services/platform}StringConstant"/&gt;
 *         &lt;element name="DateConstant" type="{http://dev.docuware.com/schema/public/services/platform}DateConstant"/&gt;
 *         &lt;element name="DateTimeConstant" type="{http://dev.docuware.com/schema/public/services/platform}DateTimeConstant"/&gt;
 *         &lt;element name="IntConstant" type="{http://dev.docuware.com/schema/public/services/platform}IntConstant"/&gt;
 *         &lt;element name="DoubleConstant" type="{http://dev.docuware.com/schema/public/services/platform}DoubleConstant"/&gt;
 *         &lt;element name="DecimalConstant" type="{http://dev.docuware.com/schema/public/services/platform}DecimalConstant"/&gt;
 *         &lt;element name="BooleanConstant" type="{http://dev.docuware.com/schema/public/services/platform}BooleanConstant"/&gt;
 *         &lt;element name="FieldValueExpression" type="{http://dev.docuware.com/schema/public/services/platform}FieldValueExpression"/&gt;
 *         &lt;element name="SystemVariableExpression" type="{http://dev.docuware.com/schema/public/services/platform}SystemVariableExpression"/&gt;
 *         &lt;element name="FunctionExpression" type="{http://dev.docuware.com/schema/public/services/platform}FunctionExpression"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnyExpression", propOrder = {
    "stringConstant",
    "dateConstant",
    "dateTimeConstant",
    "intConstant",
    "doubleConstant",
    "decimalConstant",
    "booleanConstant",
    "fieldValueExpression",
    "systemVariableExpression",
    "functionExpression"
})
public class AnyExpression {

    @XmlElement(name = "StringConstant")
    protected StringConstant stringConstant;
    @XmlElement(name = "DateConstant")
    protected DateConstant dateConstant;
    @XmlElement(name = "DateTimeConstant")
    protected DateTimeConstant dateTimeConstant;
    @XmlElement(name = "IntConstant")
    protected IntConstant intConstant;
    @XmlElement(name = "DoubleConstant")
    protected DoubleConstant doubleConstant;
    @XmlElement(name = "DecimalConstant")
    protected DecimalConstant decimalConstant;
    @XmlElement(name = "BooleanConstant")
    protected BooleanConstant booleanConstant;
    @XmlElement(name = "FieldValueExpression")
    protected FieldValueExpression fieldValueExpression;
    @XmlElement(name = "SystemVariableExpression")
    protected SystemVariableExpression systemVariableExpression;
    @XmlElement(name = "FunctionExpression")
    protected FunctionExpression functionExpression;

    /**
     * Gets the value of the stringConstant property.
     * 
     * @return
     *     possible object is
     *     {@link StringConstant }
     *     
     */
    public StringConstant getStringConstant() {
        return stringConstant;
    }

    /**
     * Sets the value of the stringConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringConstant }
     *     
     */
    public void setStringConstant(StringConstant value) {
        this.stringConstant = value;
    }

    /**
     * Gets the value of the dateConstant property.
     * 
     * @return
     *     possible object is
     *     {@link DateConstant }
     *     
     */
    public DateConstant getDateConstant() {
        return dateConstant;
    }

    /**
     * Sets the value of the dateConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateConstant }
     *     
     */
    public void setDateConstant(DateConstant value) {
        this.dateConstant = value;
    }

    /**
     * Gets the value of the dateTimeConstant property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeConstant }
     *     
     */
    public DateTimeConstant getDateTimeConstant() {
        return dateTimeConstant;
    }

    /**
     * Sets the value of the dateTimeConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeConstant }
     *     
     */
    public void setDateTimeConstant(DateTimeConstant value) {
        this.dateTimeConstant = value;
    }

    /**
     * Gets the value of the intConstant property.
     * 
     * @return
     *     possible object is
     *     {@link IntConstant }
     *     
     */
    public IntConstant getIntConstant() {
        return intConstant;
    }

    /**
     * Sets the value of the intConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntConstant }
     *     
     */
    public void setIntConstant(IntConstant value) {
        this.intConstant = value;
    }

    /**
     * Gets the value of the doubleConstant property.
     * 
     * @return
     *     possible object is
     *     {@link DoubleConstant }
     *     
     */
    public DoubleConstant getDoubleConstant() {
        return doubleConstant;
    }

    /**
     * Sets the value of the doubleConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoubleConstant }
     *     
     */
    public void setDoubleConstant(DoubleConstant value) {
        this.doubleConstant = value;
    }

    /**
     * Gets the value of the decimalConstant property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalConstant }
     *     
     */
    public DecimalConstant getDecimalConstant() {
        return decimalConstant;
    }

    /**
     * Sets the value of the decimalConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalConstant }
     *     
     */
    public void setDecimalConstant(DecimalConstant value) {
        this.decimalConstant = value;
    }

    /**
     * Gets the value of the booleanConstant property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanConstant }
     *     
     */
    public BooleanConstant getBooleanConstant() {
        return booleanConstant;
    }

    /**
     * Sets the value of the booleanConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanConstant }
     *     
     */
    public void setBooleanConstant(BooleanConstant value) {
        this.booleanConstant = value;
    }

    /**
     * Gets the value of the fieldValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link FieldValueExpression }
     *     
     */
    public FieldValueExpression getFieldValueExpression() {
        return fieldValueExpression;
    }

    /**
     * Sets the value of the fieldValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldValueExpression }
     *     
     */
    public void setFieldValueExpression(FieldValueExpression value) {
        this.fieldValueExpression = value;
    }

    /**
     * Gets the value of the systemVariableExpression property.
     * 
     * @return
     *     possible object is
     *     {@link SystemVariableExpression }
     *     
     */
    public SystemVariableExpression getSystemVariableExpression() {
        return systemVariableExpression;
    }

    /**
     * Sets the value of the systemVariableExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemVariableExpression }
     *     
     */
    public void setSystemVariableExpression(SystemVariableExpression value) {
        this.systemVariableExpression = value;
    }

    /**
     * Gets the value of the functionExpression property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionExpression }
     *     
     */
    public FunctionExpression getFunctionExpression() {
        return functionExpression;
    }

    /**
     * Sets the value of the functionExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionExpression }
     *     
     */
    public void setFunctionExpression(FunctionExpression value) {
        this.functionExpression = value;
    }

}
