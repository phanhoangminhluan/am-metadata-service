//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.14 at 10:05:49 AM ICT 
//


package com.amanotes.music.xsd.model.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Component-Action complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Component-Action">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comp-Id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Territory-Id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Published-Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Download-From" type="{}ActionsByAsset" minOccurs="0"/>
 *         &lt;element name="Stream-From" type="{}ActionsByAsset" minOccurs="0"/>
 *         &lt;element name="Transfer2Pd-From" type="{}ActionsByAsset" minOccurs="0"/>
 *         &lt;element name="Item-Purchasable-From" type="{}ActionsByAsset" minOccurs="0"/>
 *         &lt;element name="Set-Purchasable-From" type="{}ActionsByAsset" minOccurs="0"/>
 *         &lt;element name="Sample-From" type="{}ActionsByAsset" minOccurs="0"/>
 *         &lt;element name="Preorder-From" type="{}ActionsByAsset" minOccurs="0"/>
 *         &lt;element name="SampleDld-From" type="{}ActionsByAsset" minOccurs="0"/>
 *         &lt;element name="Free-Stream-From" type="{}ActionsByAsset" minOccurs="0"/>
 *         &lt;element name="SendTo-From" type="{}ActionsByAsset" minOccurs="0"/>
 *         &lt;element name="Last-Updated-Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Component-Action", propOrder = {
    "compId",
    "territoryId",
    "publishedDate",
    "downloadFrom",
    "streamFrom",
    "transfer2PdFrom",
    "itemPurchasableFrom",
    "setPurchasableFrom",
    "sampleFrom",
    "preorderFrom",
    "sampleDldFrom",
    "freeStreamFrom",
    "sendToFrom",
    "lastUpdatedDate"
})
public class ComponentAction {

    @XmlElement(name = "Comp-Id", required = true)
    protected BigInteger compId;
    @XmlElement(name = "Territory-Id", required = true)
    protected BigInteger territoryId;
    @XmlElement(name = "Published-Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publishedDate;
    @XmlElement(name = "Download-From")
    protected ActionsByAsset downloadFrom;
    @XmlElement(name = "Stream-From")
    protected ActionsByAsset streamFrom;
    @XmlElement(name = "Transfer2Pd-From")
    protected ActionsByAsset transfer2PdFrom;
    @XmlElement(name = "Item-Purchasable-From")
    protected ActionsByAsset itemPurchasableFrom;
    @XmlElement(name = "Set-Purchasable-From")
    protected ActionsByAsset setPurchasableFrom;
    @XmlElement(name = "Sample-From")
    protected ActionsByAsset sampleFrom;
    @XmlElement(name = "Preorder-From")
    protected ActionsByAsset preorderFrom;
    @XmlElement(name = "SampleDld-From")
    protected ActionsByAsset sampleDldFrom;
    @XmlElement(name = "Free-Stream-From")
    protected ActionsByAsset freeStreamFrom;
    @XmlElement(name = "SendTo-From")
    protected ActionsByAsset sendToFrom;
    @XmlElement(name = "Last-Updated-Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdatedDate;

    /**
     * Gets the value of the compId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCompId() {
        return compId;
    }

    /**
     * Sets the value of the compId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCompId(BigInteger value) {
        this.compId = value;
    }

    /**
     * Gets the value of the territoryId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTerritoryId() {
        return territoryId;
    }

    /**
     * Sets the value of the territoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTerritoryId(BigInteger value) {
        this.territoryId = value;
    }

    /**
     * Gets the value of the publishedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishedDate() {
        return publishedDate;
    }

    /**
     * Sets the value of the publishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishedDate(XMLGregorianCalendar value) {
        this.publishedDate = value;
    }

    /**
     * Gets the value of the downloadFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ActionsByAsset }
     *     
     */
    public ActionsByAsset getDownloadFrom() {
        return downloadFrom;
    }

    /**
     * Sets the value of the downloadFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsByAsset }
     *     
     */
    public void setDownloadFrom(ActionsByAsset value) {
        this.downloadFrom = value;
    }

    /**
     * Gets the value of the streamFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ActionsByAsset }
     *     
     */
    public ActionsByAsset getStreamFrom() {
        return streamFrom;
    }

    /**
     * Sets the value of the streamFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsByAsset }
     *     
     */
    public void setStreamFrom(ActionsByAsset value) {
        this.streamFrom = value;
    }

    /**
     * Gets the value of the transfer2PdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ActionsByAsset }
     *     
     */
    public ActionsByAsset getTransfer2PdFrom() {
        return transfer2PdFrom;
    }

    /**
     * Sets the value of the transfer2PdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsByAsset }
     *     
     */
    public void setTransfer2PdFrom(ActionsByAsset value) {
        this.transfer2PdFrom = value;
    }

    /**
     * Gets the value of the itemPurchasableFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ActionsByAsset }
     *     
     */
    public ActionsByAsset getItemPurchasableFrom() {
        return itemPurchasableFrom;
    }

    /**
     * Sets the value of the itemPurchasableFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsByAsset }
     *     
     */
    public void setItemPurchasableFrom(ActionsByAsset value) {
        this.itemPurchasableFrom = value;
    }

    /**
     * Gets the value of the setPurchasableFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ActionsByAsset }
     *     
     */
    public ActionsByAsset getSetPurchasableFrom() {
        return setPurchasableFrom;
    }

    /**
     * Sets the value of the setPurchasableFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsByAsset }
     *     
     */
    public void setSetPurchasableFrom(ActionsByAsset value) {
        this.setPurchasableFrom = value;
    }

    /**
     * Gets the value of the sampleFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ActionsByAsset }
     *     
     */
    public ActionsByAsset getSampleFrom() {
        return sampleFrom;
    }

    /**
     * Sets the value of the sampleFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsByAsset }
     *     
     */
    public void setSampleFrom(ActionsByAsset value) {
        this.sampleFrom = value;
    }

    /**
     * Gets the value of the preorderFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ActionsByAsset }
     *     
     */
    public ActionsByAsset getPreorderFrom() {
        return preorderFrom;
    }

    /**
     * Sets the value of the preorderFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsByAsset }
     *     
     */
    public void setPreorderFrom(ActionsByAsset value) {
        this.preorderFrom = value;
    }

    /**
     * Gets the value of the sampleDldFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ActionsByAsset }
     *     
     */
    public ActionsByAsset getSampleDldFrom() {
        return sampleDldFrom;
    }

    /**
     * Sets the value of the sampleDldFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsByAsset }
     *     
     */
    public void setSampleDldFrom(ActionsByAsset value) {
        this.sampleDldFrom = value;
    }

    /**
     * Gets the value of the freeStreamFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ActionsByAsset }
     *     
     */
    public ActionsByAsset getFreeStreamFrom() {
        return freeStreamFrom;
    }

    /**
     * Sets the value of the freeStreamFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsByAsset }
     *     
     */
    public void setFreeStreamFrom(ActionsByAsset value) {
        this.freeStreamFrom = value;
    }

    /**
     * Gets the value of the sendToFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ActionsByAsset }
     *     
     */
    public ActionsByAsset getSendToFrom() {
        return sendToFrom;
    }

    /**
     * Sets the value of the sendToFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsByAsset }
     *     
     */
    public void setSendToFrom(ActionsByAsset value) {
        this.sendToFrom = value;
    }

    /**
     * Gets the value of the lastUpdatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * Sets the value of the lastUpdatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdatedDate(XMLGregorianCalendar value) {
        this.lastUpdatedDate = value;
    }

}
