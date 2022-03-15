
package com.amanotes.music.xsd.model.transformed.collection;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.amanotes.music.xsd.model.AudibleMagicEntity;
import com.amanotes.music.xsd.model.jaxb.ComponentParent;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Component-Parents", propOrder = {
    "componentParents"
}, namespace = "##default", factoryClass = javax.xml.bind.annotation.XmlType.DEFAULT.class, factoryMethod = "")
@XmlRootElement(name = "Component-Parents")
@Data
public class ComponentParents
    extends AudibleMagicEntity
{

    @XmlElement(name = "Component-Parent", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private List<ComponentParent> componentParents = new ArrayList<ComponentParent>();

}
