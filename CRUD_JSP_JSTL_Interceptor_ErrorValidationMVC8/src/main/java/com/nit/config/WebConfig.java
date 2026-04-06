package com.nit.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.nit.interceptor.LoggingInterceptor;
@Component
//register interceptor for all paths
public class WebConfig implements WebMvcConfigurer {
	@Autowired
	private LoggingInterceptor loggingInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(loggingInterceptor); // No path patterns means → applies to ALL paths by default
		
		//registry.addInterceptor(new LoggingInterceptor()).addPathPatterns("/**"); // match ALL URLs => intercept every
																					// request
//		 registry.addInterceptor(loggingInterceptor)
//         .addPathPatterns("/**") ; 
	}
 
 }
