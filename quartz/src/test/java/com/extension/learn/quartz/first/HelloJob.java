package com.extension.learn.quartz.first;

import com.extension.learn.quartz.utils.DateformatUtil;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

public class HelloJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("HelloJob execute: " +
                DateformatUtil.defaultFormat(new Date()) + " " + Thread.currentThread().getName());
    }
}
