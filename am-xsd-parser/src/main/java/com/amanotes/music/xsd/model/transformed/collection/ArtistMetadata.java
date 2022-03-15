
package com.amanotes.music.xsd.model.transformed.collection;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.amanotes.music.xsd.model.AudibleMagicEntity;
import com.amanotes.music.xsd.model.jaxb.ArtistMetadataItem;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Artist-Metadata", propOrder = {
    "artistMetadataItems"
}, namespace = "##default", factoryClass = javax.xml.bind.annotation.XmlType.DEFAULT.class, factoryMethod = "")
@XmlRootElement(name = "Artist-Metadata")
@Data
public class ArtistMetadata
    extends AudibleMagicEntity
{

    @XmlElement(name = "Artist-Metadata-Item", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private List<ArtistMetadataItem> artistMetadataItems = new ArrayList<ArtistMetadataItem>();

}
