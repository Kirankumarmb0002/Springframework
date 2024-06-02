package com.springframework.demo.project.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class BinnarySearchImpl {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Autowired
	@Qualifier("bubblesort")
	private SortAlgo sortAlgo;
	
	public BinnarySearchImpl(SortAlgo sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}
	
	@PostConstruct
	public void postconstruct() {
		logger.info("Postconstruct");
	}
	
	@PreDestroy
	public void predestroy() {
		logger.info("Pre Destroy");
	}

	public int search(int[] numbers, int numbertosearch) {

		int[] sortednumbers = sortAlgo.sort(numbers);
		System.out.println(sortAlgo);
		// logic for binary search
		return 3;
	}
}
