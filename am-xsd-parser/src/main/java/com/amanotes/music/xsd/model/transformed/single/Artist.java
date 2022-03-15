
package com.amanotes.music.xsd.model.transformed.single;

import java.math.BigInteger;
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
@XmlType(name = "Artist", propOrder = {
    "id",
    "amgId",
    "name",
    "sortName",
    "artistCategory",
    "createdDate",
    "lastUpdatedDate",
    "paEx"
}, namespace = "##default", factoryClass = javax.xml.bind.annotation.XmlType.DEFAULT.class, factoryMethod = "")
@XmlRootElement(name = "Artist")
@Data
public class Artist
    extends AudibleMagicEntity
{

    @XmlElement(name = "Id", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger id;
    @XmlElement(name = "Amg-Id", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String amgId;
    @XmlElement(name = "Name", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String name;
    @XmlElement(name = "Sort-Name", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String sortName;
    @XmlElement(name = "Artist-Category", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String artistCategory;
    @XmlElement(name = "Created-Date", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    @XmlSchemaType(name = "date", namespace = "http://www.w3.org/2001/XMLSchema", type = javax.xml.bind.annotation.XmlSchemaType.DEFAULT.class)
    private XMLGregorianCalendar createdDate;
    @XmlElement(name = "Last-Updated-Date", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    @XmlSchemaType(name = "date", namespace = "http://www.w3.org/2001/XMLSchema", type = javax.xml.bind.annotation.XmlSchemaType.DEFAULT.class)
    private XMLGregorianCalendar lastUpdatedDate;
    @XmlElement(name = "PA-Ex", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String paEx;

}
