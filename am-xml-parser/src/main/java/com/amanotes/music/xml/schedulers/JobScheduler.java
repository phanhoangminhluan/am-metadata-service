package com.amanotes.music.xml.schedulers;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Minh-Luan H. Phan
 * Created on: 2022.03.15 14:18
 */
@Component
public class JobScheduler {

    private final long MINUTES = 60 * 1000;

    @Autowired
    private Job artistsSyncingJob;

    @Autowired
    private Job territoriesSyncingJob;

    @Autowired
    private Job artistSyncingJob;

    @Autowired
    private JobLauncher jobLauncher;


//    @Scheduled(fixedDelay = 5 * MINUTES)
//    public void launchArtistsSyncingJob() throws Exception {
//        JobParameters params = new JobParametersBuilder()
//                .addString("JobID", String.valueOf(System.currentTimeMillis()))
//                .toJobParameters();
//        this.jobLauncher.run(artistsSyncingJob, params);
//    }
//
//    @Scheduled(fixedDelay = 2 * MINUTES)
//    public void launchTerritoriesSyncingJob() throws Exception {
//        JobParameters params = new JobParametersBuilder()
//                .addString("JobID", String.valueOf(System.currentTimeMillis()))
//                .toJobParameters();
//        this.jobLauncher.run(territoriesSyncingJob, params);
//    }

    @Scheduled(fixedDelay = 2 * MINUTES)
    public void launchArtistSyncingJob() throws Exception {
        JobParameters params = new JobParametersBuilder()
                .addString("JobID", String.valueOf(System.currentTimeMillis()))
                .toJobParameters();
        this.jobLauncher.run(artistSyncingJob, params);
    }


}
