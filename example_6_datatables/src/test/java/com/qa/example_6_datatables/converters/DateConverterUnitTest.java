package com.qa.example_6_datatables.converters;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DateConverterUnitTest {

	private DateConverter dateConverter;
	
	@Before
	public void setup() {
		this.dateConverter = new DateConverter();
	}
	
	@Test
	public void convertTest() {
		// year, month, day
		LocalDateTime dateToConvert = LocalDateTime.of(LocalDate.of(1992, 1, 3), LocalTime.MIDNIGHT);
		String expectedOutput = "Friday 3 January 1992";
		
		String actualOutput = dateConverter.convert(dateToConvert);
		
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void convertListTest() {
		// Given
		List<LocalDateTime> datesToConvert = List.of(LocalDateTime.of(LocalDate.of(1992, 1, 3), LocalTime.MIDNIGHT),
													 LocalDateTime.of(LocalDate.of(2021, 4, 2), LocalTime.MIDNIGHT));
		List<String> expectedOutput = List.of("Friday 3 January 1992",
											  "Friday 2 April 2021");
		
		List<String> actualOutput = dateConverter.convertList(datesToConvert);
		
		assertEquals(expectedOutput, actualOutput);
	}
}
