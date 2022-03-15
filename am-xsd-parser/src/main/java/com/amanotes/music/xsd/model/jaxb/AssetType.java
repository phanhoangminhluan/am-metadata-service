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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Asset-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Asset-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Asset-Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Asset-Code-Tag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description-Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Drm-Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="File-Extension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Buy-Price-Scope-Id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asset-Type", propOrder = {
    "assetCode",
    "assetCodeTag",
    "description",
    "descriptionCode",
    "drmCode",
    "fileExtension",
    "buyPriceScopeId"
})
public class AssetType {

    @XmlElement(name = "Asset-Code", required = true)
    protected String assetCode;
    @XmlElement(name = "Asset-Code-Tag", required = true)
    protected String assetCodeTag;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Description-Code", required = true)
    protected String descriptionCode;
    @XmlElement(name = "Drm-Code", required = true)
    protected String drmCode;
    @XmlElement(name = "File-Extension", required = true)
    protected String fileExtension;
    @XmlElement(name = "Buy-Price-Scope-Id")
    protected BigInteger buyPriceScopeId;

    /**
     * Gets the value of the assetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetCode() {
        return assetCode;
    }

    /**
     * Sets the value of the assetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetCode(String value) {
        this.assetCode = value;
    }

    /**
     * Gets the value of the assetCodeTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetCodeTag() {
        return assetCodeTag;
    }

    /**
     * Sets the value of the assetCodeTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetCodeTag(String value) {
        this.assetCodeTag = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the descriptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionCode() {
        return descriptionCode;
    }

    /**
     * Sets the value of the descriptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionCode(String value) {
        this.descriptionCode = value;
    }

    /**
     * Gets the value of the drmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrmCode() {
        return drmCode;
    }

    /**
     * Sets the value of the drmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrmCode(String value) {
        this.drmCode = value;
    }

    /**
     * Gets the value of the fileExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileExtension() {
        return fileExtension;
    }

    /**
     * Sets the value of the fileExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileExtension(String value) {
        this.fileExtension = value;
    }

    /**
     * Gets the value of the buyPriceScopeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBuyPriceScopeId() {
        return buyPriceScopeId;
    }

    /**
     * Sets the value of the buyPriceScopeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBuyPriceScopeId(BigInteger value) {
        this.buyPriceScopeId = value;
    }

}