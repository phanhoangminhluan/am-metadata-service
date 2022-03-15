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
 * <p>Java class for Component-Parent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Component-Parent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Parent-Comp-Id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Child-Comp-Id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Component-Parent", propOrder = {
    "parentCompId",
    "childCompId"
})
public class ComponentParent {

    @XmlElement(name = "Parent-Comp-Id", required = true)
    protected BigInteger parentCompId;
    @XmlElement(name = "Child-Comp-Id", required = true)
    protected BigInteger childCompId;

    /**
     * Gets the value of the parentCompId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentCompId() {
        return parentCompId;
    }

    /**
     * Sets the value of the parentCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentCompId(BigInteger value) {
        this.parentCompId = value;
    }

    /**
     * Gets the value of the childCompId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChildCompId() {
        return childCompId;
    }

    /**
     * Sets the value of the childCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChildCompId(BigInteger value) {
        this.childCompId = value;
    }

}
