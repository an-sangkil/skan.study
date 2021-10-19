package com.schedule.quartz.util;

import java.util.Calendar;

import org.quartz.CronExpression;

/**
 * <pre>
 * Class Name  : Schedule01.java
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
public class CronScheduleUtil {
	
	/**
	 * cron : 초 분 시 날짜 월 요일 년
	 * 
	 * @param firstType 
	 * @param mmhhStr  시간 설정  14:01 
	 */
	public void cronString (int firstType , String mmhhStr, String typeOfday) {
		
		//0 15 10 15 * ?
		//매달 15 일  오전 10시 15분
		StringBuffer cronsb = new StringBuffer();
	
		
		String ss = "0";
		String dayMonth = "";		// 날자
		String mon = "";			// 월 1,2,3 ... 31
		String dayWeek = "";		// 요일  "MON","TUE" ...
		
		String year = "*";			// 년도
		
		switch (firstType) {
		case 0:	// 매월
			//31 일이 들어오면 마지막날(L)로 변환
			
			if("31".equals(typeOfday)) {
				typeOfday = "L";
			}
			
			dayMonth = typeOfday;		
			mon = "*";
			dayWeek = "?";
			
			break;
		case 1:	// 매주
			
			dayMonth = "?";
			mon = "*";
			dayWeek = typeOfday;			// 

			break;
		case 2: // 매일
			
			dayMonth = "*";
			mon = "*";
			dayWeek = "?";
			
			break;
		default:
			break;
		}
		
		cronsb
		.append(ss)
		.append(":")
		.append(mmhhStr)
		.append(":")
		.append(dayMonth)
		.append(":")
		.append(mon)
		.append(":")
		.append(dayWeek)
		.append(":")
		.append(year)
		;
		
		System.out.println(cronsb.toString().replaceAll(":", " "));
		System.out.println(CronExpression.isValidExpression(cronsb.toString().replaceAll(":", " ")));
		
	}
	
	public static void main(String[] args) {
		CronScheduleUtil scheduleCronUtil = new CronScheduleUtil();
		scheduleCronUtil.cronString(1, "10:17", "MON");
		
	}
	
	
	
	
	
	
}
