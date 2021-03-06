//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.14 at 10:05:49 AM ICT 
//


package com.amanotes.music.xsd.model.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Header complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Header">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Created-Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Feed-Type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="INCREMENTAL"/>
 *               &lt;enumeration value="FULL"/>
 *               &lt;enumeration value="INC_VERSIONCOPY"/>
 *               &lt;enumeration value="RUSH"/>
 *               &lt;enumeration value="RESUBMIT"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Sequence-Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Last-AMG-processed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "createdDate",
    "feedType",
    "sequenceNumber",
    "version",
    "lastAMGProcessed"
})
public class Header {

    @XmlElement(name = "Created-Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Feed-Type", required = true)
    protected String feedType;
    @XmlElement(name = "Sequence-Number")
    protected int sequenceNumber;
    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "Last-AMG-processed", required = true)
    protected String lastAMGProcessed;

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the feedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedType() {
        return feedType;
    }

    /**
     * Sets the value of the feedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedType(String value) {
        this.feedType = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     */
    public int getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     */
    public void setSequenceNumber(int value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the lastAMGProcessed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastAMGProcessed() {
        return lastAMGProcessed;
    }

    /**
     * Sets the value of the lastAMGProcessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastAMGProcessed(String value) {
        this.lastAMGProcessed = value;
    }

}
