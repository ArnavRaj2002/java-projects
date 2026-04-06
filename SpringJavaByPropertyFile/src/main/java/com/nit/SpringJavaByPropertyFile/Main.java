package com.nit.SpringJavaByPropertyFile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.AppConfig;
import com.nit.sbeans.MyApplication;

public class Main {

	public static void main(String[] args) {
  AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
  MyApplication appConfig = ctx.getBean(MyApplication.class);
  appConfig.printAppDetails();
	}

}
