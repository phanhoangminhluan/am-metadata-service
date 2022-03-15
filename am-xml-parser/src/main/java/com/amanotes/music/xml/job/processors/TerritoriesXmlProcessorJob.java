package com.amanotes.music.xml.job.processors;

import com.amanotes.music.xml.job.AbstractXmlProcessorJob;
import com.amanotes.music.xsd.model.transformed.collection.Territories;
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
 * Created on: 2022.03.15 11:48
 */
@Configuration
@EnableBatchProcessing
public class TerritoriesXmlProcessorJob extends AbstractXmlProcessorJob<Territories> {

    private InputStreamResource inputStreamResource;
    @Override
    protected Class<Territories> getElement() {
        return Territories.class;
    }

    @Override
    protected void onReceiveRecord(Territories items) {
        items.getTerritories().forEach(item -> System.out.println(this.getElement().getSimpleName() + " - " + item.getId()));
    }

    @Override
    protected InputStreamResource openInputStream() {
        this.inputStreamResource = this.getInputStream();
        return this.inputStreamResource;
    }

    @Override
    @Bean("Territories-itemReader")
    public ItemReader<Territories> itemReader() {
        return super.itemReader();
    }

    @Override
    @Bean("Territories-itemWriter")
    public ItemWriter<Territories> itemWriter() {
        return super.itemWriter();
    }

    @Override
    @Bean("Territories-step")
    public Step step() {
        return super.step();
    }

    @Override
    @Bean("territoriesSyncingJob")
    public Job process() {
        return super.process();
    }
}
