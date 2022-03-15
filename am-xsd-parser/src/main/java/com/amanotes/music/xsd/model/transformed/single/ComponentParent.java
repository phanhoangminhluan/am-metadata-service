
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
@XmlType(name = "Component-Parent", propOrder = {
    "parentCompId",
    "childCompId"
}, namespace = "##default", factoryClass = javax.xml.bind.annotation.XmlType.DEFAULT.class, factoryMethod = "")
@XmlRootElement(name = "Component-Parent")
@Data
public class ComponentParent
    extends AudibleMagicEntity
{

    @XmlElement(name = "Parent-Comp-Id", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger parentCompId;
    @XmlElement(name = "Child-Comp-Id", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger childCompId;

}
