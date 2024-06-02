package com.springframework.demo.project;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springframework.demo.project.basic.BinnarySearchImpl;
import com.springframework.demo.project.properties.SomeExternalService;

@Configuration
@ComponentScan("com.springframework.demo.project.properties")
@PropertySource("classpath:app.properties")
//@PropertySource("classpath:application.properties")
public class SpringDemobasicexternalPropertiesApplication {

	public static void main(String[] args) {
		
		
		
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringDemobasicexternalPropertiesApplication.class)){
		
		SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
	
		System.out.println(service.returnServiceURL());
		
		}
	}

}
