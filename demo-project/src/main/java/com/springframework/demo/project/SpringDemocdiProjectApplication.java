package com.springframework.demo.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.springframework.demo.project.basic.BinnarySearchImpl;

@SpringBootApplication
public class SpringDemocdiProjectApplication {

	public static void main(String[] args) {
		//BinnarySearchImpl binnarysearch =new BinnarySearchImpl(new Quicksort());
		
		
		
		ApplicationContext applicationContext = SpringApplication.run(SpringDemocdiProjectApplication.class, args);
		BinnarySearchImpl binnarySearchImpl = applicationContext.getBean(BinnarySearchImpl.class);
		BinnarySearchImpl binnarySearchImpl1 = applicationContext.getBean(BinnarySearchImpl.class);
		System.out.println(binnarySearchImpl);
		System.out.println(binnarySearchImpl1);
		int result = binnarySearchImpl.search(new int[] {10, 20,2,},2);
		System.out.println(result);
	}

}
