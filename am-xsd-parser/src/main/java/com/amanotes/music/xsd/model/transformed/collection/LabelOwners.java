
package com.amanotes.music.xsd.model.transformed.collection;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.amanotes.music.xsd.model.AudibleMagicEntity;
import com.amanotes.music.xsd.model.jaxb.LabelOwner;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Label-Owners", propOrder = {
    "labelOwners"
}, namespace = "##default", factoryClass = javax.xml.bind.annotation.XmlType.DEFAULT.class, factoryMethod = "")
@XmlRootElement(name = "Label-Owners")
@Data
public class LabelOwners
    extends AudibleMagicEntity
{

    @XmlElement(name = "Label-Owner", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private List<LabelOwner> labelOwners = new ArrayList<LabelOwner>();

}
