package org.springframework.sample.support;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println(String.format("%s preHandle", request.getAttribute(HandlerMapping.BEST_MATCHING_HANDLER_ATTRIBUTE)));
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
		System.out.println(String.format("%s postHandle", request.getAttribute(HandlerMapping.BEST_MATCHING_HANDLER_ATTRIBUTE)));
	}
}
