package com.springframework.demo.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.demo.project.basic.BinnarySearchImpl;
import com.springframework.demo.project.xmlbasedconf.xmlPersonDao;

@Configuration
@ComponentScan("com.springframework.demo.project.basic")
public class SpringDemoxmlcontextApplication2 {

	public static void main(String[] args) {
		//BinnarySearchImpl binnarysearch =new BinnarySearchImpl(new Quicksort());
		
		
		Logger LOGGER=LoggerFactory.getLogger(SpringDemoxmlcontextApplication2.class);
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){
		
			xmlPersonDao xmlperson = applicationContext.getBean(xmlPersonDao.class);
			LOGGER.info("{}",xmlperson.getXmlJdbcConnection());
		}
	}

}
