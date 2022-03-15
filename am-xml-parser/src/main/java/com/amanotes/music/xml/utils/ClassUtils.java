package com.amanotes.music.xml.utils;

import com.amanotes.music.xsd.model.jaxb.ArtistTypes;
import org.springframework.core.annotation.AnnotationUtils;

import javax.xml.bind.annotation.XmlType;

/**
 * @author Minh-Luan H. Phan
 * Created on: 2022.03.14 00:23
 */
public class ClassUtils {

    public static String getXmlRootName(Class generatedClass) {
        XmlType xmlType = AnnotationUtils.getAnnotation(generatedClass, XmlType.class);
        if (xmlType == null) {
            return null;
        }
        return xmlType.name();
    }

    public static void main(String[] args) {
        System.out.println(getXmlRootName(ArtistTypes.class));
    }


}
