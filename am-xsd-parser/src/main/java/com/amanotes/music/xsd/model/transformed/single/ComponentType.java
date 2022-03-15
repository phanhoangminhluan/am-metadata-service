
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
import com.amanotes.music.xsd.model.jaxb.TfIndicator;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Component-Type", propOrder = {
    "id",
    "typeCode",
    "parentInd",
    "genreCategory",
    "createdDate"
}, namespace = "##default", factoryClass = javax.xml.bind.annotation.XmlType.DEFAULT.class, factoryMethod = "")
@XmlRootElement(name = "Component-Type")
@Data
public class ComponentType
    extends AudibleMagicEntity
{

    @XmlElement(name = "Id", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger id;
    @XmlElement(name = "Type-Code", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String typeCode;
    @XmlElement(name = "Parent-Ind", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private TfIndicator parentInd;
    @XmlElement(name = "Genre-Category", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String genreCategory;
    @XmlElement(name = "Created-Date", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    @XmlSchemaType(name = "date", namespace = "http://www.w3.org/2001/XMLSchema", type = javax.xml.bind.annotation.XmlSchemaType.DEFAULT.class)
    private XMLGregorianCalendar createdDate;

}
