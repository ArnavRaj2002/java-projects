package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.AppConfig;
import com.nit.sbeans.WeekDayAnalyzer;

public class DependencyInjection {
	public static void main(String[] args) {
		try ( AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			WeekDayAnalyzer weekDayAnalyzer = ctx.getBean("wda", WeekDayAnalyzer.class);
			System.out.println(weekDayAnalyzer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
