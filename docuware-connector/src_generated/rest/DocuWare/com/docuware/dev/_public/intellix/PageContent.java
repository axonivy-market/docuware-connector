
package com.docuware.dev._public.intellix;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
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
 * </pre>
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
    @XmlAttribute(name = "SizeX", required = true)
    protected int sizeX;
    @XmlAttribute(name = "SizeY", required = true)
    protected int sizeY;
    @XmlAttribute(name = "SkewAngle")
    protected Double skewAngle;
    @XmlAttribute(name = "Rotation")
    protected Rotation rotation;
    @XmlAttribute(name = "FileTag")
    protected String fileTag;
    @XmlAttribute(name = "HorizontalDpi", required = true)
    protected double horizontalDpi;
    @XmlAttribute(name = "VerticalDpi", required = true)
    protected double verticalDpi;

    /**
     * Gets the value of the textZoneOrPictureZoneOrTableZone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textZoneOrPictureZoneOrTableZone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextZoneOrPictureZoneOrTableZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextZone }
     * {@link PictureZone }
     * {@link TableZone }
     * {@link Rulerline }
     * 
     * 
     */
    public List<RectangleBase> getTextZoneOrPictureZoneOrTableZone() {
        if (textZoneOrPictureZoneOrTableZone == null) {
            textZoneOrPictureZoneOrTableZone = new ArrayList<RectangleBase>();
        }
        return this.textZoneOrPictureZoneOrTableZone;
    }

    /**
     * Gets the value of the barCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the barCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBarCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BarCodeZone }
     * 
     * 
     */
    public List<BarCodeZone> getBarCodes() {
        if (barCodes == null) {
            barCodes = new ArrayList<BarCodeZone>();
        }
        return this.barCodes;
    }

    /**
     * Gets the value of the candidates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the candidates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCandidates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CandidateInfo }
     * 
     * 
     */
    public List<CandidateInfo> getCandidates() {
        if (candidates == null) {
            candidates = new ArrayList<CandidateInfo>();
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
     * Gets the value of the sizeX property.
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
     * Gets the value of the sizeY property.
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
     * Gets the value of the skewAngle property.
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
     */
    public void setSkewAngle(Double value) {
        this.skewAngle = value;
    }

    /**
     * Gets the value of the rotation property.
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
     */
    public void setRotation(Rotation value) {
        this.rotation = value;
    }

    /**
     * Gets the value of the fileTag property.
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
     */
    public void setFileTag(String value) {
        this.fileTag = value;
    }

    /**
     * Gets the value of the horizontalDpi property.
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
     * Gets the value of the verticalDpi property.
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
