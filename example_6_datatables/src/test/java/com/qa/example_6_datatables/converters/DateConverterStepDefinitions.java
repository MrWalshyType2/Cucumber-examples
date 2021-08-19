package com.qa.example_6_datatables.converters;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DateConverterStepDefinitions {
	
	List<LocalDateTime> dates;
	List<String> expectedOutputDates;
	List<String> actualOutputDates;
	
	DateConverter dateConverter = new DateConverter();
	
	@DataTableType
	public LocalDateTime localDate(Map<String, String> inputDates) {
		LocalDate date = LocalDate.of(Integer.valueOf(inputDates.get("Year")),
									  Integer.valueOf(inputDates.get("Month")),
									  Integer.valueOf(inputDates.get("Day")));
		return LocalDateTime.of(date, LocalTime.MIDNIGHT);
	}

	@Given("the dates:")
	public void theDates(List<LocalDateTime> inputDates) {
		dates = inputDates;
	}

	@Given("the expected output strings:")
	public void theExpectedOutputStrings(List<String> expectedOutputs) {
	    expectedOutputDates = expectedOutputs;
	}

	@When("the conversion operation is performed")
	public void theConversionOperationIsPerformed() {
	    actualOutputDates = dateConverter.convertList(dates);
	}

	@Then("the actual output list must contain the exact same contents as the expected output list")
	public void theActualOutputListMustContainTheExactSameContentsAsTheExpectedOutputList() {
	    assertEquals(expectedOutputDates, actualOutputDates);
	}
	
}
