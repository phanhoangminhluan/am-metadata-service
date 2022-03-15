
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
import com.amanotes.music.xsd.model.jaxb.ActiveStatusCode;
import com.amanotes.music.xsd.model.jaxb.Languages;
import com.amanotes.music.xsd.model.jaxb.TfIndicator;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Component", propOrder = {
    "id",
    "labelId",
    "compCode",
    "compTypeId",
    "activeStatusCode",
    "title",
    "sortTitle",
    "subtitle",
    "duration",
    "parentalAdvisory",
    "isrc",
    "itemNumber",
    "upc",
    "childItemsCount",
    "coverArt",
    "single",
    "shortDescription",
    "description",
    "audioLanguages",
    "subtitleLanguages",
    "diskNumber",
    "season",
    "imprint",
    "edition",
    "coverage",
    "tableOfContents",
    "amgId",
    "muzeId",
    "exclusiveInd",
    "specialCodes",
    "createdDate",
    "lastUpdatedDate"
}, namespace = "##default", factoryClass = javax.xml.bind.annotation.XmlType.DEFAULT.class, factoryMethod = "")
@XmlRootElement(name = "Component")
@Data
public class Component
    extends AudibleMagicEntity
{

    @XmlElement(name = "Id", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger id;
    @XmlElement(name = "Label-Id", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger labelId;
    @XmlElement(name = "Comp-Code", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String compCode;
    @XmlElement(name = "Comp-Type-Id", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger compTypeId;
    @XmlElement(name = "Active-Status-Code", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private ActiveStatusCode activeStatusCode;
    @XmlElement(name = "Title", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String title;
    @XmlElement(name = "Sort-Title", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String sortTitle;
    @XmlElement(name = "Subtitle", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String subtitle;
    @XmlElement(name = "Duration", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String duration;
    @XmlElement(name = "Parental-Advisory", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String parentalAdvisory;
    @XmlElement(name = "Isrc", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String isrc;
    @XmlElement(name = "Item-Number", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger itemNumber;
    @XmlElement(name = "Upc", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String upc;
    @XmlElement(name = "Child-Items-Count", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger childItemsCount;
    @XmlElement(name = "Cover-Art", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private TfIndicator coverArt;
    @XmlElement(name = "Single", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String single;
    @XmlElement(name = "Short-Description", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String shortDescription;
    @XmlElement(name = "Description", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String description;
    @XmlElement(name = "Audio-Languages", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private Languages audioLanguages;
    @XmlElement(name = "Subtitle-Languages", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private Languages subtitleLanguages;
    @XmlElement(name = "Disk-Number", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger diskNumber;
    @XmlElement(name = "Season", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String season;
    @XmlElement(name = "Imprint", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String imprint;
    @XmlElement(name = "Edition", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String edition;
    @XmlElement(name = "Coverage", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String coverage;
    @XmlElement(name = "Table-Of-Contents", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String tableOfContents;
    @XmlElement(name = "Amg-Id", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String amgId;
    @XmlElement(name = "Muze-Id", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String muzeId;
    @XmlElement(name = "Exclusive-Ind", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private TfIndicator exclusiveInd;
    @XmlElement(name = "Special-Codes", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String specialCodes;
    @XmlElement(name = "Created-Date", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    @XmlSchemaType(name = "date", namespace = "http://www.w3.org/2001/XMLSchema", type = javax.xml.bind.annotation.XmlSchemaType.DEFAULT.class)
    private XMLGregorianCalendar createdDate;
    @XmlElement(name = "Last-Updated-Date", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    @XmlSchemaType(name = "date", namespace = "http://www.w3.org/2001/XMLSchema", type = javax.xml.bind.annotation.XmlSchemaType.DEFAULT.class)
    private XMLGregorianCalendar lastUpdatedDate;

}
