
package com.amanotes.music.xsd.model.transformed.collection;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.amanotes.music.xsd.model.AudibleMagicEntity;
import com.amanotes.music.xsd.model.jaxb.ArtistType;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Artist-Types", propOrder = {
    "artistTypes"
}, namespace = "##default", factoryClass = javax.xml.bind.annotation.XmlType.DEFAULT.class, factoryMethod = "")
@XmlRootElement(name = "Artist-Types")
@Data
public class ArtistTypes
    extends AudibleMagicEntity
{

    @XmlElement(name = "Artist-Type", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private List<ArtistType> artistTypes = new ArrayList<ArtistType>();

}
