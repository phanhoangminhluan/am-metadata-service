//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.14 at 10:05:49 AM ICT 
//


package com.amanotes.music.xsd.model.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Alt-Group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Alt-Group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Alt-Group-Id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Alt-Comp-Id" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Alt-Group", propOrder = {
    "altGroupId",
    "altCompIds"
})
public class AltGroup {

    @XmlElement(name = "Alt-Group-Id", required = true)
    protected BigInteger altGroupId;
    @XmlElement(name = "Alt-Comp-Id", required = true)
    protected List<BigInteger> altCompIds;

    /**
     * Gets the value of the altGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAltGroupId() {
        return altGroupId;
    }

    /**
     * Sets the value of the altGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAltGroupId(BigInteger value) {
        this.altGroupId = value;
    }

    /**
     * Gets the value of the altCompIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altCompIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltCompIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getAltCompIds() {
        if (altCompIds == null) {
            altCompIds = new ArrayList<BigInteger>();
        }
        return this.altCompIds;
    }

}