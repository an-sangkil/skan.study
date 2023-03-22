package com.schedule.quartz;

import java.util.Date;
import java.util.List;

import org.quartz.CronExpression;
import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.GroupMatcher;

/**
 * <pre>
 * Class Name  : QuartzSchedule.java
 * Description : 
 * Modification Information
 *
 *    수정일　　　 　　  수정자　　　     수정내용
 *    ────────────   ─────────   ───────────────────────────────
 *    2015. 2. 10.        ask               최초생성
 * </pre>
 *
 * @author ask
 * @since 2015. 2. 10.
 * @version 
 *
 * Copyright (C) 2014 by SKAN.COMPANY All right reserved.
 */
public class QuartzSchedule {
	public static void main(String[] args) throws Exception {
		Scheduler scheduler =  StdSchedulerFactory.getDefaultScheduler();
		if(!scheduler.isStarted()){
			scheduler.start();
		}

		JobDetail jobDetail =   JobBuilder.newJob(JobTask01.class).withIdentity("projectName1", "SOFOS").build();
		Trigger trigger =  TriggerBuilder.newTrigger().withIdentity("Trigger1", "SOFOS").startNow().
				withSchedule(CronScheduleBuilder.cronSchedule("0 11 18 24 * ? *")).build();
		
		jobDetail.getJobDataMap().put("testKey1", "korea1");
		scheduler.scheduleJob(jobDetail, trigger);
		
		addJob("projectName2", "Trigger2");
		jobList();
		
		System.out.println("1. ========================================================");
		rescheduleJob("Trigger2", "SOFOS");
		jobList();
	
		System.out.println("2. ========================================================");
		rescheduleJobUpdate("Trigger2", "SOFOS" , "ffkfkffkfkf");
		jobList();
	}
	
	public static void addJob(String jobName , String triggerName) throws SchedulerException {
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		JobDetail jobDetail =   JobBuilder.newJob(JobTask01.class).withIdentity(jobName , "SOFOS").build();
		Trigger trigger =  TriggerBuilder.newTrigger().withIdentity(triggerName , "SOFOS").startNow().
				withSchedule(CronScheduleBuilder.cronSchedule("0 54 17 31 * ? *")).build();
		
		
		jobDetail.getJobDataMap().put("testKey2", "korea2");
		
		
		scheduler.scheduleJob(jobDetail, trigger);
	}
	
	
	public static void rescheduleJob(String triggerName, String group) throws Exception {
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		
		Trigger newTrigger = TriggerBuilder.newTrigger()
			    .withIdentity(triggerName, group)
			    .startNow().withSchedule(CronScheduleBuilder.cronSchedule("0 14 01 * * ? *"))
			    .build();
		
		scheduler.rescheduleJob(TriggerKey.triggerKey(triggerName, group), newTrigger);
	}
	
	public static void rescheduleJobUpdate(String triggerName, String group, String cronExpression) throws Exception {
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		
		Trigger oldTrigger = scheduler.getTrigger(TriggerKey.triggerKey(triggerName, group));
		TriggerBuilder<Trigger> tb = (TriggerBuilder<Trigger>) oldTrigger.getTriggerBuilder();
		
		Trigger newTrigger = tb
			    .withIdentity(triggerName, group)
			    .startNow().withSchedule(CronScheduleBuilder.cronSchedule("0 14 02 * * ? *"))
			    .build();
		
		scheduler.rescheduleJob(oldTrigger.getKey(), newTrigger);
	}
	
	public void getTrigger () throws SchedulerException {
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
	}
	
	
	public void getJob() throws SchedulerException {
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
	}
	
	public static void jobList () throws Exception {
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		 
		   for (String groupName : scheduler.getJobGroupNames()) {
		 
		     for (JobKey jobKey : scheduler.getJobKeys(GroupMatcher.jobGroupEquals(groupName))) {
		 
			  String jobName = jobKey.getName();
			  String jobGroup = jobKey.getGroup();
		 
			  //get job's trigger
			  List<Trigger> triggers = (List<Trigger>) scheduler.getTriggersOfJob(jobKey);
			  Date nextFireTime = triggers.get(0).getNextFireTime(); 
		 
				System.out.println("[jobName] : " + jobName + " [groupName] : "	+ jobGroup + " - " + nextFireTime);
		 
			  }
		 
		    }
	}

}
