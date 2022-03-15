
package com.amanotes.music.xsd.model.transformed.single;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.amanotes.music.xsd.model.AudibleMagicEntity;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Alt-Group", propOrder = {
    "altGroupId",
    "altCompIds"
}, namespace = "##default", factoryClass = javax.xml.bind.annotation.XmlType.DEFAULT.class, factoryMethod = "")
@XmlRootElement(name = "Alt-Group")
@Data
public class AltGroup
    extends AudibleMagicEntity
{

    @XmlElement(name = "Alt-Group-Id", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger altGroupId;
    @XmlElement(name = "Alt-Comp-Id", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private List<BigInteger> altCompIds = new ArrayList<BigInteger>();

}
