package com.dc.batch.impl;

import com.dc.batch.model.UsageData;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by Sandeep on 24-05-2015.
 */
public class AggregateUasgeWriter implements ItemWriter<UsageData> {
    @Override
    public void write(List<? extends UsageData> list) throws Exception {

    }
}
