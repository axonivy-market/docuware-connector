
package com.docuware.dev.schema._public.services.platform;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Favorites complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Favorites"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Baskets" type="{http://dev.docuware.com/schema/public/services/platform}FavoriteItems"/&gt;
 *         &lt;element name="StoreDialogs" type="{http://dev.docuware.com/schema/public/services/platform}FavoriteItems"/&gt;
 *         &lt;element name="SearchDialogs" type="{http://dev.docuware.com/schema/public/services/platform}FavoriteItems"/&gt;
 *         &lt;element name="TaskLists" type="{http://dev.docuware.com/schema/public/services/platform}FavoriteItems"/&gt;
 *         &lt;element name="TreeViews" type="{http://dev.docuware.com/schema/public/services/platform}FavoriteItems"/&gt;
 *         &lt;element name="MultiFCSearches" type="{http://dev.docuware.com/schema/public/services/platform}FavoriteItems"/&gt;
 *         &lt;element name="Forms" type="{http://dev.docuware.com/schema/public/services/platform}FavoriteItems"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Favorites", propOrder = {
    "baskets",
    "storeDialogs",
    "searchDialogs",
    "taskLists",
    "treeViews",
    "multiFCSearches",
    "forms"
})
public class Favorites {

    @XmlElement(name = "Baskets", required = true)
    protected FavoriteItems baskets;
    @XmlElement(name = "StoreDialogs", required = true)
    protected FavoriteItems storeDialogs;
    @XmlElement(name = "SearchDialogs", required = true)
    protected FavoriteItems searchDialogs;
    @XmlElement(name = "TaskLists", required = true)
    protected FavoriteItems taskLists;
    @XmlElement(name = "TreeViews", required = true)
    protected FavoriteItems treeViews;
    @XmlElement(name = "MultiFCSearches", required = true)
    protected FavoriteItems multiFCSearches;
    @XmlElement(name = "Forms", required = true)
    protected FavoriteItems forms;

    /**
     * Gets the value of the baskets property.
     * 
     * @return
     *     possible object is
     *     {@link FavoriteItems }
     *     
     */
    public FavoriteItems getBaskets() {
        return baskets;
    }

    /**
     * Sets the value of the baskets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FavoriteItems }
     *     
     */
    public void setBaskets(FavoriteItems value) {
        this.baskets = value;
    }

    /**
     * Gets the value of the storeDialogs property.
     * 
     * @return
     *     possible object is
     *     {@link FavoriteItems }
     *     
     */
    public FavoriteItems getStoreDialogs() {
        return storeDialogs;
    }

    /**
     * Sets the value of the storeDialogs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FavoriteItems }
     *     
     */
    public void setStoreDialogs(FavoriteItems value) {
        this.storeDialogs = value;
    }

    /**
     * Gets the value of the searchDialogs property.
     * 
     * @return
     *     possible object is
     *     {@link FavoriteItems }
     *     
     */
    public FavoriteItems getSearchDialogs() {
        return searchDialogs;
    }

    /**
     * Sets the value of the searchDialogs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FavoriteItems }
     *     
     */
    public void setSearchDialogs(FavoriteItems value) {
        this.searchDialogs = value;
    }

    /**
     * Gets the value of the taskLists property.
     * 
     * @return
     *     possible object is
     *     {@link FavoriteItems }
     *     
     */
    public FavoriteItems getTaskLists() {
        return taskLists;
    }

    /**
     * Sets the value of the taskLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link FavoriteItems }
     *     
     */
    public void setTaskLists(FavoriteItems value) {
        this.taskLists = value;
    }

    /**
     * Gets the value of the treeViews property.
     * 
     * @return
     *     possible object is
     *     {@link FavoriteItems }
     *     
     */
    public FavoriteItems getTreeViews() {
        return treeViews;
    }

    /**
     * Sets the value of the treeViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link FavoriteItems }
     *     
     */
    public void setTreeViews(FavoriteItems value) {
        this.treeViews = value;
    }

    /**
     * Gets the value of the multiFCSearches property.
     * 
     * @return
     *     possible object is
     *     {@link FavoriteItems }
     *     
     */
    public FavoriteItems getMultiFCSearches() {
        return multiFCSearches;
    }

    /**
     * Sets the value of the multiFCSearches property.
     * 
     * @param value
     *     allowed object is
     *     {@link FavoriteItems }
     *     
     */
    public void setMultiFCSearches(FavoriteItems value) {
        this.multiFCSearches = value;
    }

    /**
     * Gets the value of the forms property.
     * 
     * @return
     *     possible object is
     *     {@link FavoriteItems }
     *     
     */
    public FavoriteItems getForms() {
        return forms;
    }

    /**
     * Sets the value of the forms property.
     * 
     * @param value
     *     allowed object is
     *     {@link FavoriteItems }
     *     
     */
    public void setForms(FavoriteItems value) {
        this.forms = value;
    }

}
