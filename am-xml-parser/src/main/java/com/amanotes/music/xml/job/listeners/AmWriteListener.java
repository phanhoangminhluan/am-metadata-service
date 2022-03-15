package com.amanotes.music.xml.job.listeners;

import com.amanotes.music.xsd.model.AudibleMagicEntity;
import org.springframework.batch.core.ItemWriteListener;

import java.util.List;

/**
 * @author Minh-Luan H. Phan
 * Created on: 2022.03.15 15:50
 */
public class AmWriteListener implements ItemWriteListener<AudibleMagicEntity> {
    @Override
    public void beforeWrite(List<? extends AudibleMagicEntity> items) {

    }

    @Override
    public void afterWrite(List<? extends AudibleMagicEntity> items) {

    }

    @Override
    public void onWriteError(Exception exception, List<? extends AudibleMagicEntity> items) {

    }
}
