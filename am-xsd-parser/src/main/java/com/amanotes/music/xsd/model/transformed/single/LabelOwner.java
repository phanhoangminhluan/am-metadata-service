
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
import com.amanotes.music.xsd.model.jaxb.ActiveStatusCode;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Label-Owner", propOrder = {
    "id",
    "corpCode",
    "labelOwnerName",
    "activeStatusCode",
    "createdDate",
    "lastUpdatedDate"
}, namespace = "##default", factoryClass = javax.xml.bind.annotation.XmlType.DEFAULT.class, factoryMethod = "")
@XmlRootElement(name = "Label-Owner")
@Data
public class LabelOwner
    extends AudibleMagicEntity
{

    @XmlElement(name = "Id", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger id;
    @XmlElement(name = "Corp-Code", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String corpCode;
    @XmlElement(name = "Label-Owner-Name", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private String labelOwnerName;
    @XmlElement(name = "Active-Status-Code", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private ActiveStatusCode activeStatusCode;
    @XmlElement(name = "Created-Date", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    @XmlSchemaType(name = "date", namespace = "http://www.w3.org/2001/XMLSchema", type = javax.xml.bind.annotation.XmlSchemaType.DEFAULT.class)
    private XMLGregorianCalendar createdDate;
    @XmlElement(name = "Last-Updated-Date", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    @XmlSchemaType(name = "date", namespace = "http://www.w3.org/2001/XMLSchema", type = javax.xml.bind.annotation.XmlSchemaType.DEFAULT.class)
    private XMLGregorianCalendar lastUpdatedDate;

}
