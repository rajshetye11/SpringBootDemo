package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springdemo.component.DemoBean;
import com.example.springdemo.controller.HelloRestController;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Spring Demo");
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println("Demo Bean "+demoBean);
		System.out.println(context.getBean(HelloRestController.class));
	}

}
