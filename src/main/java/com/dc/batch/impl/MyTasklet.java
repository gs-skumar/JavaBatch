package com.dc.batch.impl;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * Created by Sandeep on 02-06-2015.
 */
public class MyTasklet implements Tasklet{

    public MyTasklet(){
     System.out.println("My Tasklet :: initialized ");
    }

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        System.out.println("Ops some exception is caught!!");
        return RepeatStatus.FINISHED;
    }
}
