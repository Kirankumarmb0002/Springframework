package com.springframework.demo.project.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Quicksort implements SortAlgo{
	public int[] sort(int[] numbers) {
		//logic for bubble sort 
		return numbers;
	}
}
