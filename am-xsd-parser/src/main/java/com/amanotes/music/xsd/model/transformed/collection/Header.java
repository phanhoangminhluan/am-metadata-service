
package com.amanotes.music.xsd.model.transformed.collection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.amanotes.music.xsd.model.AudibleMagicEntity;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "createdDate",
    "feedType",
    "sequenceNumber",
    "version",
    "lastAMGProcessed"
}, namespace = "##default", factoryClass = javax.xml.bind.annotation.XmlType.DEFAULT.class, factoryMethod = "")
@XmlRootElement(name = "Header")
@Data
public class Header
    extends AudibleMagicEntity
{

    @XmlElement(name = "Created-Date", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    @XmlSchemaType(name = "dateTime", namespace = "http://www.w3.org/2001/XMLSchema", type = javax.xml.bind.annotation.XmlSchemaType.DEFAULT.class)
    private XMLGregorianCalendar createdDate;
    @XmlElement(name = "Feed-Type", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String feedType;
    @XmlElement(name = "Sequence-Number", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private int sequenceNumber;
    @XmlElement(name = "Version", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String version;
    @XmlElement(name = "Last-AMG-processed", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String lastAMGProcessed;

}
