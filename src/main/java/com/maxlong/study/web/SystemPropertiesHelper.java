package com.maxlong.study.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Enumeration;

public class SystemPropertiesHelper implements ServletContextListener {

	private ServletContext context = null;
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		context = sce.getServletContext();
		Enumeration<String> params = context.getInitParameterNames();
		while (params.hasMoreElements()) {
			String param = (String) params.nextElement();
			String value = context.getInitParameter(param);
			if (param.startsWith("javax.net.ssl.")) {
				System.setProperty(param, value);
			}
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
