
package com.amanotes.music.xsd.model.transformed.single;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.amanotes.music.xsd.model.AudibleMagicEntity;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asset-Type", propOrder = {
    "assetCode",
    "assetCodeTag",
    "description",
    "descriptionCode",
    "drmCode",
    "fileExtension",
    "buyPriceScopeId"
}, namespace = "##default", factoryClass = javax.xml.bind.annotation.XmlType.DEFAULT.class, factoryMethod = "")
@XmlRootElement(name = "Asset-Type")
@Data
public class AssetType
    extends AudibleMagicEntity
{

    @XmlElement(name = "Asset-Code", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String assetCode;
    @XmlElement(name = "Asset-Code-Tag", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String assetCodeTag;
    @XmlElement(name = "Description", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String description;
    @XmlElement(name = "Description-Code", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String descriptionCode;
    @XmlElement(name = "Drm-Code", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String drmCode;
    @XmlElement(name = "File-Extension", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String fileExtension;
    @XmlElement(name = "Buy-Price-Scope-Id", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger buyPriceScopeId;

}
