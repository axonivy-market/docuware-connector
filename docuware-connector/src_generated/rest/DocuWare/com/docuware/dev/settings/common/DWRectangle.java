
package com.docuware.dev.settings.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DWRectangle complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DWRectangle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Left" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="Top" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="Height" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DWRectangle")
public class DWRectangle {

    /**
     * The left coordinate of the rectangle.
     * 
     */
    @XmlAttribute(name = "Left", required = true)
    protected double left;
    /**
     * The top coordinate of the rectangle.
     * 
     */
    @XmlAttribute(name = "Top", required = true)
    protected double top;
    /**
     * The width of the rectangle in coordinates.
     * 
     */
    @XmlAttribute(name = "Width", required = true)
    protected double width;
    /**
     * The height of the rectangle in coordinates.
     * 
     */
    @XmlAttribute(name = "Height", required = true)
    protected double height;

    /**
     * The left coordinate of the rectangle.
     * 
     */
    public double getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     * 
     */
    public void setLeft(double value) {
        this.left = value;
    }

    /**
     * The top coordinate of the rectangle.
     * 
     */
    public double getTop() {
        return top;
    }

    /**
     * Sets the value of the top property.
     * 
     */
    public void setTop(double value) {
        this.top = value;
    }

    /**
     * The width of the rectangle in coordinates.
     * 
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(double value) {
        this.width = value;
    }

    /**
     * The height of the rectangle in coordinates.
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(double value) {
        this.height = value;
    }

}
