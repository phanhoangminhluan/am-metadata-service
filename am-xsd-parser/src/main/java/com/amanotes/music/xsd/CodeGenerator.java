package com.amanotes.music.xsd;

import com.sun.codemodel.*;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author Minh-Luan H. Phan
 * Created on: 2022.03.14 16:34
 */
@Data
public class CodeGenerator {

    private JCodeModel jCodeModel;
    private JDefinedClass jDefinedClass;
    private Class originalClass;

    private final Map<Class<? extends Annotation>, BiConsumer<JAnnotationUse, Annotation>> annotationMapper = new HashMap<>() {{

        put(XmlElement.class, ((jAnnotationUse, annotationInstance) -> {
            XmlElement xmlElement = (XmlElement) annotationInstance;
            jAnnotationUse.param("name", xmlElement.name());
            jAnnotationUse.param("nillable", xmlElement.nillable());
            jAnnotationUse.param("required", xmlElement.required());
            jAnnotationUse.param("namespace", xmlElement.namespace());
            jAnnotationUse.param("type", xmlElement.type());
        }));

        put(XmlSchemaType.class, (jAnnotationUse, annotation) -> {
            XmlSchemaType xmlSchemaType = (XmlSchemaType) annotation;
            jAnnotationUse.param("name", xmlSchemaType.name());
            jAnnotationUse.param("namespace", xmlSchemaType.namespace());
            jAnnotationUse.param("type", xmlSchemaType.type());
        });

        put(XmlType.class, (jAnnotationUse, annotation) -> {
            XmlType xmlType = (XmlType) annotation;
            jAnnotationUse.param("name", xmlType.name());
            JAnnotationArrayMember jAnnotationArrayMember = jAnnotationUse.paramArray("propOrder");
            for (String s : xmlType.propOrder()) {
                jAnnotationArrayMember.param(s);
            }
            jAnnotationUse.param("namespace", xmlType.namespace());
            jAnnotationUse.param("factoryClass", xmlType.factoryClass());
            jAnnotationUse.param("factoryMethod", xmlType.factoryMethod());
        });

        put(XmlAccessorType.class, (jAnnotationUse, annotation) -> {
            XmlAccessorType xmlAccessorType = (XmlAccessorType) annotation;
            jAnnotationUse.param("value", xmlAccessorType.value());
        });
        put(XmlRootElement.class, (jAnnotationUse, annotation) -> {
            XmlRootElement xmlRootElement = (XmlRootElement) annotation;
            jAnnotationUse.param("namespace", xmlRootElement.namespace());
            jAnnotationUse.param("name", xmlRootElement.name());
        });
    }};

    public CodeGenerator(Class originalClass, String packageName) throws JClassAlreadyExistsException {
        this.originalClass = originalClass;
        this.jCodeModel = new JCodeModel();
        this.jDefinedClass = jCodeModel._class(packageName + "." + originalClass.getSimpleName(), ClassType.CLASS);
    }

    public void cloneFields() throws ClassNotFoundException {
        for (Field declaredField : this.originalClass.getDeclaredFields()) {
            JFieldVar jFieldVar = this.cloneField(declaredField);
            this.annotateClonedField(jFieldVar, Arrays.asList(declaredField.getAnnotations()));
        }
    }

    public void annotateClonedField(JFieldVar jFieldVar, List<Annotation> annotations) {
        annotations
                .forEach(annotation -> {
                    JAnnotationUse jAnnotationUse = jFieldVar.annotate(annotation.annotationType());
                    annotationMapper
                            .get(annotation.annotationType())
                            .accept(jAnnotationUse, annotation);
                });
    }

    private JFieldVar cloneField(Field field) throws ClassNotFoundException {
        JFieldVar jFieldVar;
        if (field.getType() == List.class) {
            JClass dataType = this.buildJClassGenericList(List.class, field.getGenericType().getTypeName());
            JExpression initStatement = JExpr._new(this.buildJClassGenericList(ArrayList.class, field.getGenericType().getTypeName()));
            jFieldVar = this.jDefinedClass.field(JMod.PRIVATE, dataType, field.getName(), initStatement);
        } else {
            jFieldVar = this.jDefinedClass.field(JMod.PRIVATE, field.getType() , field.getName());
        }
        return jFieldVar;
    }

    public void cloneClassAnnotations() {
        Arrays
                .stream(this.originalClass.getAnnotations())
                .forEach(annotation -> {
                    JAnnotationUse jAnnotationUse = this.jDefinedClass.annotate(annotation.annotationType());
                    annotationMapper
                            .get(annotation.annotationType())
                            .accept(jAnnotationUse, annotation);
                });

    }


    private JClass buildJClassGenericList(Class<? extends List> collectionClass, String typeName) throws ClassNotFoundException {
        JClass jClass = this.jCodeModel.ref(collectionClass);
        String parameterizedTypeName = typeName.substring(typeName.indexOf("<") + 1, typeName.lastIndexOf(">"));
        return jClass.narrow(Class.forName(parameterizedTypeName));
    }

    public void annotateClass(Class<? extends Annotation> annotationClass, Consumer<JAnnotationUse> jAnnotationUseConsumer) {
        JAnnotationUse jAnnotationUse = this.jDefinedClass.annotate(annotationClass);
        jAnnotationUseConsumer.accept(jAnnotationUse);
    }

    public void extendClass(Class superClass) {
        jDefinedClass._extends(superClass);
    }

    public void build() throws IOException {
        this.jCodeModel.build(new File("/Users/luan.phm/engineering/Projects/amanotes/am-metadata-service/am-xsd-parser/src/main/java"));
    }


}
