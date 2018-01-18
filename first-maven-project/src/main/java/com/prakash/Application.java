package com.prakash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Application.class, args);
	}

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver vr= new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/jsp/");
		vr.setSuffix(".jsp");
		vr.setViewClass(JstlView.class);
		return vr;
	}
}
