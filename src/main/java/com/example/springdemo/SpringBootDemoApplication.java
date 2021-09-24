package com.example.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springdemo.component.DemoBean;
import com.example.springdemo.controller.HelloRestController;

@SpringBootApplication
public class SpringBootDemoApplication {
	public static final Logger logger=LoggerFactory.getLogger(SpringBootDemoApplication.class);
	
	public static void main(String[] args) {
		logger.info("Hello, Welcome to Spring Demo");
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootDemoApplication.class, args);
		DemoBean demoBean=context.getBean(DemoBean.class);
		logger.debug("Demo Bean= "+demoBean.toString());
		logger.debug(""+context.getBean(HelloRestController.class));
	}

}
