package com.amanotes.music.xsd;

import com.amanotes.music.xsd.model.AudibleMagicEntity;
import com.amanotes.music.xsd.model.jaxb.*;
import lombok.Data;
import org.springframework.core.annotation.AnnotationUtils;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Minh-Luan H. Phan
 * Created on: 2022.03.14 13:45
 */
public class AmModelTransformer {

    private static final Map<Class, String> collectionEntities = new HashMap<>() {{
       put(ActiveStatusCode.class, getXmlRootName(ActiveStatusCode.class));
       put(TfIndicator.class, getXmlRootName(TfIndicator.class));
       put(Header.class, getXmlRootName(Header.class));
       put(Feed.Statistics.class, getXmlRootName(Feed.Statistics.class));
       put(GenreReference.class, getXmlRootName(GenreReference.class));
       put(ComponentTypes.class, getXmlRootName(ComponentTypes.class));
       put(MetadataTypes.class, getXmlRootName(MetadataTypes.class));
       put(MetadataSpecialCodes.class, getXmlRootName(MetadataSpecialCodes.class));
       put(ArtistTypes.class, getXmlRootName(ArtistTypes.class));
       put(Territories.class, getXmlRootName(Territories.class));
       put(Currencies.class, getXmlRootName(Currencies.class));
       put(PriceScopes.class, getXmlRootName(PriceScopes.class));
       put(LabelOwners.class, getXmlRootName(LabelOwners.class));
       put(Labels.class, getXmlRootName(Labels.class));
       put(Artists.class, getXmlRootName(Artists.class));
       put(Languages.class, getXmlRootName(Languages.class));
       put(Components.class, getXmlRootName(Components.class));
//       put(TerritoryData.class, getXmlRootName(TerritoryData.class));
       put(ArtistComponents.class, getXmlRootName(ArtistComponents.class));
       put(ArtistMetadata.class, getXmlRootName(ArtistMetadata.class));
       put(ComponentParents.class, getXmlRootName(ComponentParents.class));
       put(Metadata.class, getXmlRootName(Metadata.class));
       put(ComponentActions.class, getXmlRootName(ComponentActions.class));
//       put(ActionsByAsset.class, getXmlRootName(ActionsByAsset.class));
       put(WholesalePrices.class, getXmlRootName(WholesalePrices.class));
       put(RetailPrices.class, getXmlRootName(RetailPrices.class));
       put(AssetTypes.class, getXmlRootName(AssetTypes.class));
       put(CollectionAssetsMap.class, getXmlRootName(CollectionAssetsMap.class));
       put(MediaFiles.class, getXmlRootName(MediaFiles.class));
       put(RelatedComponents.class, getXmlRootName(RelatedComponents.class));
       put(AlternateComponents.class, getXmlRootName(AlternateComponents.class));
       put(CountsByCompType.class, getXmlRootName(CountsByCompType.class));
       put(CountsArtistCompType.class, getXmlRootName(CountsArtistCompType.class));
       put(MetadataStats.class, getXmlRootName(MetadataStats.class));
    }};

    private static final Map<Class, String> singleEntities = new HashMap<>() {{
        put(Genre.class,getXmlRootName(Genre.class));
        put(ComponentType.class,getXmlRootName(ComponentType.class));
        put(MetadataType.class,getXmlRootName(MetadataType.class));
        put(SpecialCode.class,getXmlRootName(SpecialCode.class));
        put(ArtistType.class,getXmlRootName(ArtistType.class));
        put(Territory.class,getXmlRootName(Territory.class));
        put(Currency.class,getXmlRootName(Currency.class));
        put(PriceScope.class,getXmlRootName(PriceScope.class));
        put(LabelOwner.class,getXmlRootName(LabelOwner.class));
        put(Label.class,getXmlRootName(Label.class));
        put(Artist.class,getXmlRootName(Artist.class));
        put(Languages.class,getXmlRootName(Languages.class));
        put(Component.class,getXmlRootName(Component.class));
        put(TerritoryData.class,getXmlRootName(TerritoryData.class));
        put(ArtistComponent.class,getXmlRootName(ArtistComponent.class));
        put(ArtistMetadataItem.class,getXmlRootName(ArtistMetadataItem.class));
        put(ComponentParent.class,getXmlRootName(ComponentParent.class));
        put(MetadataItem.class,getXmlRootName(MetadataItem.class));
        put(ComponentAction.class,getXmlRootName(ComponentAction.class));
        put(ActionsByAsset.class,getXmlRootName(ActionsByAsset.class));
        put(WholesalePrice.class,getXmlRootName(WholesalePrice.class));
        put(RetailPrice.class,getXmlRootName(RetailPrice.class));
        put(AssetType.class,getXmlRootName(AssetType.class));
        put(CamItem.class,getXmlRootName(CamItem.class));
        put(File.class,getXmlRootName(File.class));
        put(RelatedComponent.class,getXmlRootName(RelatedComponent.class));
        put(AltGroup.class,getXmlRootName(AltGroup.class));
    }};

    public static String getXmlRootName(Class clazz) {
        XmlType xmlType = AnnotationUtils.getAnnotation(clazz, XmlType.class);
        if (xmlType == null) {
            return null;
        }
        return xmlType.name();
    }
    public static void main(String[] args) {

        String collectionPackage = "com.amanotes.music.xsd.model.transformed.collection";
        String singlePackage = "com.amanotes.music.xsd.model.transformed.single";

        collectionEntities
                .keySet()
                .forEach(clazz -> buildClass(clazz, collectionEntities.get(clazz), collectionPackage));

        singleEntities
                .keySet()
                .forEach(clazz -> buildClass(clazz, singleEntities.get(clazz), singlePackage));

    }

    public static void buildClass(Class transformingClass, String elementName, String targetPackage) {
        try {
            System.out.println("Transform " + transformingClass.getSimpleName());
            CodeGenerator codeGenerator = new CodeGenerator(transformingClass, targetPackage);
            codeGenerator.cloneFields();
            codeGenerator.cloneClassAnnotations();
            codeGenerator.annotateClass(XmlRootElement.class, jAnnotationUse -> {
                jAnnotationUse.param("name", elementName);
            });
            codeGenerator.annotateClass(Data.class, jAnnotationUse -> {});
            codeGenerator.extendClass(AudibleMagicEntity.class);
            codeGenerator.build();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
