
package com.docuware.dev.schema._public.services.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for WebClientPreferences complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="WebClientPreferences"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}ApplicationPreferences"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WorkAreas" type="{http://dev.docuware.com/schema/public/services/platform}WorkAreaPreferences" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GeneralSettings" type="{http://dev.docuware.com/schema/public/services/platform}GeneralSettings"/&gt;
 *         &lt;element name="WebClientLayout" type="{http://dev.docuware.com/schema/public/services/platform}WebClientLayout"/&gt;
 *         &lt;element name="Favorites" type="{http://dev.docuware.com/schema/public/services/platform}Favorites"/&gt;
 *         &lt;element name="Viewer" type="{http://dev.docuware.com/schema/public/services/platform}ViewerPreferences"/&gt;
 *         &lt;element name="MultiFCSearches" type="{http://dev.docuware.com/schema/public/services/platform}MultiFCSearches"/&gt;
 *         &lt;element name="LocalStorage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SurveyTimeStamp" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebClientPreferences", propOrder = {
    "workAreas",
    "generalSettings",
    "webClientLayout",
    "favorites",
    "viewer",
    "multiFCSearches",
    "localStorage",
    "surveyTimeStamp"
})
public class WebClientPreferences
    extends ApplicationPreferences
{

    @XmlElement(name = "WorkAreas")
    protected List<WorkAreaPreferences> workAreas;
    @XmlElement(name = "GeneralSettings", required = true)
    protected GeneralSettings generalSettings;
    @XmlElement(name = "WebClientLayout", required = true)
    protected WebClientLayout webClientLayout;
    @XmlElement(name = "Favorites", required = true)
    protected Favorites favorites;
    @XmlElement(name = "Viewer", required = true)
    protected ViewerPreferences viewer;
    @XmlElement(name = "MultiFCSearches", required = true)
    protected MultiFCSearches multiFCSearches;
    @XmlElement(name = "LocalStorage", required = true)
    protected String localStorage;
    @XmlElement(name = "SurveyTimeStamp", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar surveyTimeStamp;

    /**
     * Gets the value of the workAreas property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the workAreas property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWorkAreas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkAreaPreferences }
     * </p>
     * 
     * 
     * @return
     *     The value of the workAreas property.
     */
    public List<WorkAreaPreferences> getWorkAreas() {
        if (workAreas == null) {
            workAreas = new ArrayList<>();
        }
        return this.workAreas;
    }

    /**
     * Gets the value of the generalSettings property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralSettings }
     *     
     */
    public GeneralSettings getGeneralSettings() {
        return generalSettings;
    }

    /**
     * Sets the value of the generalSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralSettings }
     *     
     */
    public void setGeneralSettings(GeneralSettings value) {
        this.generalSettings = value;
    }

    /**
     * Gets the value of the webClientLayout property.
     * 
     * @return
     *     possible object is
     *     {@link WebClientLayout }
     *     
     */
    public WebClientLayout getWebClientLayout() {
        return webClientLayout;
    }

    /**
     * Sets the value of the webClientLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebClientLayout }
     *     
     */
    public void setWebClientLayout(WebClientLayout value) {
        this.webClientLayout = value;
    }

    /**
     * Gets the value of the favorites property.
     * 
     * @return
     *     possible object is
     *     {@link Favorites }
     *     
     */
    public Favorites getFavorites() {
        return favorites;
    }

    /**
     * Sets the value of the favorites property.
     * 
     * @param value
     *     allowed object is
     *     {@link Favorites }
     *     
     */
    public void setFavorites(Favorites value) {
        this.favorites = value;
    }

    /**
     * Gets the value of the viewer property.
     * 
     * @return
     *     possible object is
     *     {@link ViewerPreferences }
     *     
     */
    public ViewerPreferences getViewer() {
        return viewer;
    }

    /**
     * Sets the value of the viewer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewerPreferences }
     *     
     */
    public void setViewer(ViewerPreferences value) {
        this.viewer = value;
    }

    /**
     * Gets the value of the multiFCSearches property.
     * 
     * @return
     *     possible object is
     *     {@link MultiFCSearches }
     *     
     */
    public MultiFCSearches getMultiFCSearches() {
        return multiFCSearches;
    }

    /**
     * Sets the value of the multiFCSearches property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiFCSearches }
     *     
     */
    public void setMultiFCSearches(MultiFCSearches value) {
        this.multiFCSearches = value;
    }

    /**
     * Gets the value of the localStorage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalStorage() {
        return localStorage;
    }

    /**
     * Sets the value of the localStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalStorage(String value) {
        this.localStorage = value;
    }

    /**
     * Gets the value of the surveyTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSurveyTimeStamp() {
        return surveyTimeStamp;
    }

    /**
     * Sets the value of the surveyTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSurveyTimeStamp(XMLGregorianCalendar value) {
        this.surveyTimeStamp = value;
    }

}
