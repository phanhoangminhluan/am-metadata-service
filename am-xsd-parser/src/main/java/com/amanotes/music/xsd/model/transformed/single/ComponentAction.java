
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
import com.amanotes.music.xsd.model.jaxb.ActionsByAsset;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Component-Action", propOrder = {
    "compId",
    "territoryId",
    "publishedDate",
    "downloadFrom",
    "streamFrom",
    "transfer2PdFrom",
    "itemPurchasableFrom",
    "setPurchasableFrom",
    "sampleFrom",
    "preorderFrom",
    "sampleDldFrom",
    "freeStreamFrom",
    "sendToFrom",
    "lastUpdatedDate"
}, namespace = "##default", factoryClass = javax.xml.bind.annotation.XmlType.DEFAULT.class, factoryMethod = "")
@XmlRootElement(name = "Component-Action")
@Data
public class ComponentAction
    extends AudibleMagicEntity
{

    @XmlElement(name = "Comp-Id", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger compId;
    @XmlElement(name = "Territory-Id", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private BigInteger territoryId;
    @XmlElement(name = "Published-Date", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    @XmlSchemaType(name = "date", namespace = "http://www.w3.org/2001/XMLSchema", type = javax.xml.bind.annotation.XmlSchemaType.DEFAULT.class)
    private XMLGregorianCalendar publishedDate;
    @XmlElement(name = "Download-From", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private ActionsByAsset downloadFrom;
    @XmlElement(name = "Stream-From", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private ActionsByAsset streamFrom;
    @XmlElement(name = "Transfer2Pd-From", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private ActionsByAsset transfer2PdFrom;
    @XmlElement(name = "Item-Purchasable-From", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private ActionsByAsset itemPurchasableFrom;
    @XmlElement(name = "Set-Purchasable-From", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private ActionsByAsset setPurchasableFrom;
    @XmlElement(name = "Sample-From", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private ActionsByAsset sampleFrom;
    @XmlElement(name = "Preorder-From", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private ActionsByAsset preorderFrom;
    @XmlElement(name = "SampleDld-From", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private ActionsByAsset sampleDldFrom;
    @XmlElement(name = "Free-Stream-From", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private ActionsByAsset freeStreamFrom;
    @XmlElement(name = "SendTo-From", nillable = false, required = false, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    private ActionsByAsset sendToFrom;
    @XmlElement(name = "Last-Updated-Date", nillable = false, required = true, namespace = "##default", type = javax.xml.bind.annotation.XmlElement.DEFAULT.class)
    @XmlSchemaType(name = "date", namespace = "http://www.w3.org/2001/XMLSchema", type = javax.xml.bind.annotation.XmlSchemaType.DEFAULT.class)
    private XMLGregorianCalendar lastUpdatedDate;

}
