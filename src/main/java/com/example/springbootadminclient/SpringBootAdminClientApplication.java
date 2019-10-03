package com.example.springbootadminclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.Servlet;

@SpringBootApplication
public class SpringBootAdminClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminClientApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean servletRegistrationBean(Servlet servlet) {

		ServletRegistrationBean bean = new ServletRegistrationBean(servlet
				, "/springHelloWorld/*");
		bean.setLoadOnStartup(1);
		bean.addInitParameter("message", "SpringHelloWorldServlet special message");
		return bean;
	}
}
