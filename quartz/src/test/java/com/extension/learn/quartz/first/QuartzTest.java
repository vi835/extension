package com.extension.learn.quartz.first;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.concurrent.TimeUnit;

public class QuartzTest {
    public static void main(String[] args) {
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

            scheduler.start();

            JobDetail job = JobBuilder
                    .newJob(HelloJob.class)
                    .withIdentity("job1", "group1")
                    .build();

            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("trigger1", "group1")
                    .startNow()
                    // 启动策略
                    .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                            .withIntervalInSeconds(5)
                            .repeatForever()).build();

            scheduler.scheduleJob(job, trigger);

            TimeUnit.SECONDS.sleep(20);
            scheduler.shutdown();
        } catch (SchedulerException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
