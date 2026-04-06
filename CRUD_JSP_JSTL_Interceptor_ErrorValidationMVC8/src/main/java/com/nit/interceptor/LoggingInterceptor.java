package com.nit.interceptor;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component // ??
public class LoggingInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("LoggingInterceptor.preHandle()");
		if (request.getServletPath().equalsIgnoreCase("/")) return true; //?? if remove
			
		//don't apply logic for home page

		LocalDateTime ldt = LocalDateTime.now();
		int hour = ldt.getHour();
		if (hour < 9 || hour >24) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB_INF/Pages/timeout.jsp");
			rd.forward(request, response);
			return false;
		}
		return true;

	}
}
