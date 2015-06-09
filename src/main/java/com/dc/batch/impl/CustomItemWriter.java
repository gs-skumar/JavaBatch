package com.dc.batch.impl;

import com.dc.batch.Entry;
import com.dc.batch.model.UsageData;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStream;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemWriter;

import java.util.List;

/**
 * Created by Sandeep on 23-05-2015.
 */
public class CustomItemWriter implements ItemWriter<UsageData>,ItemStream {


    public JobRepository jobRepository;
    public static int count;
    public static String batchCount;
    FlatFileItemWriter<UsageData> delegate;
    @Override
    public void write(List<? extends UsageData> list) throws Exception {
        System.out.println("\n Writing in a batch of  size " + list.size()+" Count "+count++ +"\n");
        batchCount = "Batch:"+count;
        for(String jobs : Entry.simpleJobOperator.getJobNames()){
            System.out.println(jobs);
        }
    }

    @Override
    public void open(ExecutionContext executionContext) throws ItemStreamException {
        System.out.println("Exceution context "+executionContext);
       System.out.println("jobrepository "+jobRepository);
    }

    @Override
    public void update(ExecutionContext executionContext) throws ItemStreamException {
        System.out.println("Exceution Update "+executionContext);
       // delegate.update(executionContext);
    }

    @Override
    public void close() throws ItemStreamException {
        System.out.println("Exceution Close ");
       // delegate.close();
    }
    public JobRepository getJobRepository() {
        return jobRepository;
    }

    public void setJobRepository(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }
}
