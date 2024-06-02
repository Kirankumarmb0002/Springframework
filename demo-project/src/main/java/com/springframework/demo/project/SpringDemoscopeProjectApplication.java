package com.springframework.demo.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.springframework.demo.project.cdi.SomeCdiBussiness;
import com.springframework.demo.project.cdi.SomeCdiDAO;
import com.springframework.demo.project.scope.PersonDao;

@SpringBootApplication
public class SpringDemoscopeProjectApplication {

	public static void main(String[] args) {
		
		Logger LOGGER=LoggerFactory.getLogger(SpringDemoscopeProjectApplication.class);
		
		ApplicationContext applicationContext = SpringApplication.run(SpringDemoscopeProjectApplication.class);
		SomeCdiBussiness cdibussiness = applicationContext.getBean(SomeCdiBussiness.class);
			
			
			LOGGER.info("{} dao--{} ", cdibussiness, cdibussiness.getSomecdDao());


	}

}
