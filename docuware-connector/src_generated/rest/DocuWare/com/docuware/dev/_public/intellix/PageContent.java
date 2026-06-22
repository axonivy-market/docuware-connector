
package com.docuware.dev._public.intellix;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PageContent complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="PageContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="TextZone" type="{http://dev.docuware.com/public/intellix}TextZone"/&gt;
 *           &lt;element name="PictureZone" type="{http://dev.docuware.com/public/intellix}PictureZone"/&gt;
 *           &lt;element name="TableZone" type="{http://dev.docuware.com/public/intellix}TableZone"/&gt;
 *           &lt;element name="rulerline" type="{http://dev.docuware.com/public/intellix}Rulerline"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="BarCodes" type="{http://dev.docuware.com/public/intellix}BarCodeZone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Candidates" type="{http://dev.docuware.com/public/intellix}CandidateInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://dev.docuware.com/public/intellix}ResolutionAttributes"/&gt;
 *       &lt;attribute name="Lang" type="{http://dev.docuware.com/public/intellix}Languages" /&gt;
 *       &lt;attribute name="LanguageDetection" type="{http://dev.docuware.com/public/intellix}LanguageDetection" default="Explicite" /&gt;
 *       &lt;attribute name="CandidateDetectionVersion" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="SizeX" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="SizeY" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="SkewAngle" type="{http://www.w3.org/2001/XMLSchema}double" default="0.0" /&gt;
 *       &lt;attribute name="Rotation" type="{http://dev.docuware.com/public/intellix}Rotation" default="Rotate0Degree" /&gt;
 *       &lt;attribute name="FileTag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageContent", propOrder = {
    "textZoneOrPictureZoneOrTableZone",
    "barCodes",
    "candidates"
})
public class PageContent {

    @XmlElements({
        @XmlElement(name = "TextZone", type = TextZone.class),
        @XmlElement(name = "PictureZone", type = PictureZone.class),
        @XmlElement(name = "TableZone", type = TableZone.class),
        @XmlElement(name = "rulerline", type = Rulerline.class)
    })
    protected List<RectangleBase> textZoneOrPictureZoneOrTableZone;
    @XmlElement(name = "BarCodes")
    protected List<BarCodeZone> barCodes;
    @XmlElement(name = "Candidates")
    protected List<CandidateInfo> candidates;
    @XmlAttribute(name = "Lang")
    protected String lang;
    @XmlAttribute(name = "LanguageDetection")
    protected LanguageDetection languageDetection;
    @XmlAttribute(name = "CandidateDetectionVersion")
    protected Integer candidateDetectionVersion;
    @XmlAttribute(name = "Version")
    protected Integer version;
    /**
     * The page width in pixel.
     * 
     */
    @XmlAttribute(name = "SizeX", required = true)
    protected int sizeX;
    /**
     * The page height in pixel.
     * 
     */
    @XmlAttribute(name = "SizeY", required = true)
    protected int sizeY;
    /**
     * The skew angle in degree denoting the amount by which the document image has to be rotated clockwise in order to match the text shot.
     * 
     */
    @XmlAttribute(name = "SkewAngle")
    protected Double skewAngle;
    /**
     * The rotation angle of the page.
     * 
     */
    @XmlAttribute(name = "Rotation")
    protected Rotation rotation;
    /**
     * A tag identifiying the file the page was created from.
     * 
     */
    @XmlAttribute(name = "FileTag")
    protected String fileTag;
    /**
     * Horizontal resolution in dpi.
     * 
     */
    @XmlAttribute(name = "HorizontalDpi", required = true)
    protected double horizontalDpi;
    /**
     * Vertical resolution in dpi.
     * 
     */
    @XmlAttribute(name = "VerticalDpi", required = true)
    protected double verticalDpi;

    /**
     * Gets the value of the textZoneOrPictureZoneOrTableZone property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the textZoneOrPictureZoneOrTableZone property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTextZoneOrPictureZoneOrTableZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PictureZone }
     * {@link Rulerline }
     * {@link TableZone }
     * {@link TextZone }
     * </p>
     * 
     * 
     * @return
     *     The value of the textZoneOrPictureZoneOrTableZone property.
     */
    public List<RectangleBase> getTextZoneOrPictureZoneOrTableZone() {
        if (textZoneOrPictureZoneOrTableZone == null) {
            textZoneOrPictureZoneOrTableZone = new ArrayList<>();
        }
        return this.textZoneOrPictureZoneOrTableZone;
    }

    /**
     * Gets the value of the barCodes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the barCodes property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBarCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BarCodeZone }
     * </p>
     * 
     * 
     * @return
     *     The value of the barCodes property.
     */
    public List<BarCodeZone> getBarCodes() {
        if (barCodes == null) {
            barCodes = new ArrayList<>();
        }
        return this.barCodes;
    }

    /**
     * Gets the value of the candidates property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the candidates property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCandidates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CandidateInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the candidates property.
     */
    public List<CandidateInfo> getCandidates() {
        if (candidates == null) {
            candidates = new ArrayList<>();
        }
        return this.candidates;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the languageDetection property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageDetection }
     *     
     */
    public LanguageDetection getLanguageDetection() {
        if (languageDetection == null) {
            return LanguageDetection.EXPLICITE;
        } else {
            return languageDetection;
        }
    }

    /**
     * Sets the value of the languageDetection property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageDetection }
     *     
     */
    public void setLanguageDetection(LanguageDetection value) {
        this.languageDetection = value;
    }

    /**
     * Gets the value of the candidateDetectionVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCandidateDetectionVersion() {
        if (candidateDetectionVersion == null) {
            return  0;
        } else {
            return candidateDetectionVersion;
        }
    }

    /**
     * Sets the value of the candidateDetectionVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCandidateDetectionVersion(Integer value) {
        this.candidateDetectionVersion = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getVersion() {
        if (version == null) {
            return  0;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

    /**
     * The page width in pixel.
     * 
     */
    public int getSizeX() {
        return sizeX;
    }

    /**
     * Sets the value of the sizeX property.
     * 
     */
    public void setSizeX(int value) {
        this.sizeX = value;
    }

    /**
     * The page height in pixel.
     * 
     */
    public int getSizeY() {
        return sizeY;
    }

    /**
     * Sets the value of the sizeY property.
     * 
     */
    public void setSizeY(int value) {
        this.sizeY = value;
    }

    /**
     * The skew angle in degree denoting the amount by which the document image has to be rotated clockwise in order to match the text shot.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getSkewAngle() {
        if (skewAngle == null) {
            return  0.0D;
        } else {
            return skewAngle;
        }
    }

    /**
     * Sets the value of the skewAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     * @see #getSkewAngle()
     */
    public void setSkewAngle(Double value) {
        this.skewAngle = value;
    }

    /**
     * The rotation angle of the page.
     * 
     * @return
     *     possible object is
     *     {@link Rotation }
     *     
     */
    public Rotation getRotation() {
        if (rotation == null) {
            return Rotation.ROTATE_0_DEGREE;
        } else {
            return rotation;
        }
    }

    /**
     * Sets the value of the rotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rotation }
     *     
     * @see #getRotation()
     */
    public void setRotation(Rotation value) {
        this.rotation = value;
    }

    /**
     * A tag identifiying the file the page was created from.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileTag() {
        return fileTag;
    }

    /**
     * Sets the value of the fileTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFileTag()
     */
    public void setFileTag(String value) {
        this.fileTag = value;
    }

    /**
     * Horizontal resolution in dpi.
     * 
     */
    public double getHorizontalDpi() {
        return horizontalDpi;
    }

    /**
     * Sets the value of the horizontalDpi property.
     * 
     */
    public void setHorizontalDpi(double value) {
        this.horizontalDpi = value;
    }

    /**
     * Vertical resolution in dpi.
     * 
     */
    public double getVerticalDpi() {
        return verticalDpi;
    }

    /**
     * Sets the value of the verticalDpi property.
     * 
     */
    public void setVerticalDpi(double value) {
        this.verticalDpi = value;
    }

}
