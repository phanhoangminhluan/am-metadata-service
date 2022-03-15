
package com.amanotes.music.xsd.model.transformed.collection;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.amanotes.music.xsd.model.AudibleMagicEntity;
import com.amanotes.music.xsd.model.jaxb.AssetType;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asset-Types", propOrder = {
    "assetTypes"
}, namespace = "##default", factoryClass = javax.xml.bind.annotation.XmlType.DEFAULT.class, factoryMethod = "")
@XmlRootElement(name = "Asset-Types")
@Data
public class AssetTypes
    extends AudibleMagicEntity
{

    @XmlElement(name = "Asset-Type", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private List<AssetType> assetTypes = new ArrayList<AssetType>();

}
