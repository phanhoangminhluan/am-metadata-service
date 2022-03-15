package com.amanotes.music.xml.job.processors;

import com.amanotes.music.xml.job.AbstractXmlProcessorJob;
import com.amanotes.music.xsd.model.transformed.collection.Artists;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.InputStreamResource;

/**
 * @author Minh-Luan H. Phan
 * Created on: 2022.03.15 11:46
 */
@Configuration
@EnableBatchProcessing
public class ArtistsXmlProcessorJob extends AbstractXmlProcessorJob<Artists> {

    private InputStreamResource inputStreamResource;

    @Override
    protected Class<Artists> getElement() {
        return Artists.class;
    }

    @Override
    protected void onReceiveRecord(Artists items) {
        items.getArtists().forEach(item -> System.out.println(this.getElement().getSimpleName() + " - " + item.getId()));
    }

    @Override
    protected InputStreamResource openInputStream() {
        this.inputStreamResource = getInputStream();
        return this.inputStreamResource;
    }

    @Override
    @Bean("Artists-itemReader")
    public ItemReader<Artists> itemReader() {
        return super.itemReader();
    }

    @Override
    @Bean("Artists-itemWriter")
    public ItemWriter<Artists> itemWriter() {
        return super.itemWriter();
    }

    @Override
    @Bean("Artists-step")
    public Step step() {
        return super.step();
    }

    @Override
    @Bean("artistsSyncingJob")
    public Job process() {
        return super.process();
    }
}
