package com.amanotes.music.xml.job;

import com.amanotes.music.xml.utils.ClassUtils;
import com.amanotes.music.xsd.model.AudibleMagicEntity;
import lombok.SneakyThrows;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.xml.builder.StaxEventItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.InputStreamResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import java.io.FileInputStream;
import java.util.zip.GZIPInputStream;

/**
 * @author Minh-Luan H. Phan
 * Created on: 2022.03.13 23:36
 */
@Configuration
public abstract class AbstractXmlProcessorJob<T extends AudibleMagicEntity> {

    public static final String zipFile = "/Users/luan.phm/engineering/Projects/amanotes/am-metadata-service/am-xml-parser/src/main/resources/RT-Full.xml.gz";

    protected abstract Class<T> getElement();

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @SneakyThrows
    public ItemReader<T> itemReader() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setClassesToBeBound(this.getElement());

        return new StaxEventItemReaderBuilder<T>()
                .name(this.getElement().getName())
                .resource(this.openInputStream())
                .addFragmentRootElements(ClassUtils.getXmlRootName(this.getElement()))
                .unmarshaller(jaxb2Marshaller)
                .build();
    }

    @StepScope
    public ItemWriter<T> itemWriter() {
        return (items) -> {
            System.out.println(this.getElement().getSimpleName() + " - " + items);
            items.forEach(this::onReceiveRecord);
        };
    }

    protected abstract void onReceiveRecord(T item);

    @SneakyThrows
    protected abstract InputStreamResource openInputStream();

    @SneakyThrows
    protected InputStreamResource getInputStream() {
        return new InputStreamResource(new GZIPInputStream(new FileInputStream(zipFile)));
    }

    @SneakyThrows
    protected void closeInputStream(InputStreamResource inputStreamResource) {
        if (inputStreamResource != null && inputStreamResource.isOpen()) {
            inputStreamResource.getInputStream().close();
        }
    }

    public Step step() {
        return stepBuilderFactory.get(String.format("%s - Step 1", this.getElement().getSimpleName()))
                .<T, T>chunk(10)
                .reader(itemReader())
                .writer(itemWriter())
                .build();
    }


    public Job process() {
        return jobBuilderFactory.get(String.format("%s - Process 1", this.getElement().getSimpleName()))
                .incrementer(new RunIdIncrementer()).flow(step())
                .end()
                .build();
    }
}
