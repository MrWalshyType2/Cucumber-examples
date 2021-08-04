package com.qa.example_1.calculator;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefinitions {
	
	private Calculator calculator;
	private List<Integer> integerNums;
	
	@Before
	public void setup() {
		this.calculator = new Calculator();
		this.integerNums = new ArrayList<Integer>();
	}
	
	@Given("the number {int}")
	public void theNumber(Integer num) {
	    integerNums.add(num);
	}

	@When("the numbers are added")
	public void theNumbersAreAdded() {
	    calculator.addNumbers(integerNums);
	}

	@Then("the result should be {int}")
	public void theResultShouldBe(Integer expectedResult) {
		Integer actualResult = calculator.getResult();
	    assertEquals(expectedResult, actualResult);
	}

}

