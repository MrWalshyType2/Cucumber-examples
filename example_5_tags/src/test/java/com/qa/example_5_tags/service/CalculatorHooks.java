package com.qa.example_5_tags.service;

import io.cucumber.java.Before;

public class CalculatorHooks {

	private Calculator calculator;
	
	@Before("@service and @calculator")
	public void setup() {
		this.calculator = new Calculator();
	}

	public Calculator getCalculator() {
		return this.calculator;
	}
}
