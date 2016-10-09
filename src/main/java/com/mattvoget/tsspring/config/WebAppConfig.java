package com.mattvoget.tsspring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry){
		registry.addViewController("/home").setViewName("index.html");
		
		// Directives ===================================
		registry.addViewController("/home/login-form").setViewName("/public/app/login/login-form.html");
		registry.addViewController("/home/new-acct-form").setViewName("/public/app/login/new-account-form.html");
	}
	
}
