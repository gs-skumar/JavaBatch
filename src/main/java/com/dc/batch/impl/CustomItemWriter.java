package com.dc.batch.impl;

import com.dc.batch.Entry;
import com.dc.batch.model.UsageData;
import org.springframework.batch.core.launch.support.SimpleJobOperator;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by Sandeep on 23-05-2015.
 */
public class CustomItemWriter implements ItemWriter<UsageData> {

    @Override
    public void write(List<? extends UsageData> list) throws Exception {
        System.out.println("Writing in a batch of  size " + list.size());
        for(String jobs : Entry.simpleJobOperator.getJobNames()){
            System.out.println(jobs);

        }
    }
}
