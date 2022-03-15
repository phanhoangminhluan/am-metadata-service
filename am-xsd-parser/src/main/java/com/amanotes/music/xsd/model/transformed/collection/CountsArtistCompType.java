
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
@XmlType(name = "Counts-artist-comp-type", propOrder = {
    "artist",
    "album",
    "track",
    "collection",
    "musicvideo",
    "tvseries",
    "tvshow",
    "movie",
    "ebook",
    "ebtrack"
}, namespace = "##default", factoryClass = javax.xml.bind.annotation.XmlType.DEFAULT.class, factoryMethod = "")
@XmlRootElement(name = "Counts-artist-comp-type")
@Data
public class CountsArtistCompType
    extends AudibleMagicEntity
{

    @XmlElement(name = "ARTIST", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger artist;
    @XmlElement(name = "ALBUM", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger album;
    @XmlElement(name = "TRACK", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger track;
    @XmlElement(name = "COLLECTION", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger collection;
    @XmlElement(name = "MUSIC_VIDEO", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger musicvideo;
    @XmlElement(name = "TV_SERIES", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger tvseries;
    @XmlElement(name = "TV_SHOW", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger tvshow;
    @XmlElement(name = "MOVIE", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger movie;
    @XmlElement(name = "EBOOK", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger ebook;
    @XmlElement(name = "EB_TRACK", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger ebtrack;

}
