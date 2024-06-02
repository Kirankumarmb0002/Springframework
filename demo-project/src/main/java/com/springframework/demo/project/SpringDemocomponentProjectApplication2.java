package com.springframework.demo.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springframework.demo.project.scope.PersonDao;
import com.springframework.project.component.ComponentPersonDao;

@SpringBootApplication
@ComponentScan("com.springframework.project.component")
public class SpringDemocomponentProjectApplication2 {

	public static void main(String[] args) {
		
		Logger LOGGER=LoggerFactory.getLogger(SpringDemocomponentProjectApplication2.class);
		
		ApplicationContext applicationContext = SpringApplication.run(SpringDemocomponentProjectApplication2.class);
			ComponentPersonDao ComponentPersonDao = applicationContext.getBean(ComponentPersonDao.class);
			
			
			LOGGER.info("{}", ComponentPersonDao);
			LOGGER.info("{}", ComponentPersonDao.getJdbcconnection());
			

	}

}
