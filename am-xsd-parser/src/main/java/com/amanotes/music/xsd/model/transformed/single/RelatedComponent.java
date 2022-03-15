
package com.amanotes.music.xsd.model.transformed.single;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.amanotes.music.xsd.model.AudibleMagicEntity;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Related-Component", propOrder = {
    "compId",
    "relatedCompId",
    "role",
    "createdDate",
    "lastUpdatedDate"
}, namespace = "##default", factoryClass = javax.xml.bind.annotation.XmlType.DEFAULT.class, factoryMethod = "")
@XmlRootElement(name = "Related-Component")
@Data
public class RelatedComponent
    extends AudibleMagicEntity
{

    @XmlElement(name = "Comp-Id", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger compId;
    @XmlElement(name = "Related-Comp-Id", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger relatedCompId;
    @XmlElement(name = "Role", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String role;
    @XmlElement(name = "Created-Date", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    @XmlSchemaType(name = "date", namespace = "http://www.w3.org/2001/XMLSchema", type = javax.xml.bind.annotation.XmlSchemaType.DEFAULT.class)
    private XMLGregorianCalendar createdDate;
    @XmlElement(name = "Last-Updated-Date", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    @XmlSchemaType(name = "date", namespace = "http://www.w3.org/2001/XMLSchema", type = javax.xml.bind.annotation.XmlSchemaType.DEFAULT.class)
    private XMLGregorianCalendar lastUpdatedDate;

}
