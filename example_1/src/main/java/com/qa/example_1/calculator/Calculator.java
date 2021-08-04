package com.qa.example_1.calculator;

import java.util.List;

public class Calculator {
	
	private Integer result = 0;

	public void addNumbers(List<Integer> integerNums) {
		for (Integer num : integerNums) result += num;
	}

	public Integer getResult() {
		return result;
	}

}

