
package com.amanotes.music.xsd.model.transformed.collection;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.amanotes.music.xsd.model.AudibleMagicEntity;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Metadata-stats", propOrder = {
    "isrc",
    "trackNumber",
    "diskNumber",
    "upc",
    "parentalAdvisory",
    "releaseDate",
    "amgId",
    "muzeId"
}, namespace = "##default", factoryClass = javax.xml.bind.annotation.XmlType.DEFAULT.class, factoryMethod = "")
@XmlRootElement(name = "Metadata-stats")
@Data
public class MetadataStats
    extends AudibleMagicEntity
{

    @XmlElement(name = "ISRC", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger isrc;
    @XmlElement(name = "TrackNumber", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger trackNumber;
    @XmlElement(name = "DiskNumber", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger diskNumber;
    @XmlElement(name = "UPC", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger upc;
    @XmlElement(name = "ParentalAdvisory", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger parentalAdvisory;
    @XmlElement(name = "ReleaseDate", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger releaseDate;
    @XmlElement(name = "AmgId", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger amgId;
    @XmlElement(name = "MuzeId", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger muzeId;

}
