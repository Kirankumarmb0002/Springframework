package com.springframework.demo.project.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Bubblesort implements SortAlgo {
public int[] sort(int[] numbers) {
	//logic for bubble sort 
	return numbers;
}
}
