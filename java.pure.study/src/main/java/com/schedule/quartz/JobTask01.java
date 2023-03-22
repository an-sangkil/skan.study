package com.schedule.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * <pre>
 * Class Name  : JobTask01.java
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
public class JobTask01 implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("hi~~");
		System.out.println(arg0.getJobDetail().getJobDataMap().get("testKey1"));
	}

}
