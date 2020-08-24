package com.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	protected Class<?>[] getRootConfigClasses() {

		return null;
	}

	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { WebConfig.class };
	}

	protected String[] getServletMappings() {

		return new String[] { "/" };
	}
}
