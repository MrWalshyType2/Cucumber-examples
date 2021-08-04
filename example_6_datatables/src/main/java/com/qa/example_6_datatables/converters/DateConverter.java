package com.qa.example_6_datatables.converters;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class DateConverter {

	public List<String> convertList(List<LocalDateTime> dates) {
		return dates.stream()
				    .map(date -> convert(date))
				    .collect(Collectors.toList());
	}

	public String convert(LocalDateTime dateToConvert) {
		StringBuilder dateString = new StringBuilder();
		
		String day = dateToConvert.getDayOfWeek().toString();
		String month = dateToConvert.getMonth().toString();
		
		dateString.append(day.substring(0,1))
				  .append(day.substring(1).toLowerCase())
				  .append(" ")
				  .append(dateToConvert.getDayOfMonth())
			      .append(" ")
			      .append(month.substring(0, 1))
			      .append(month.substring(1).toLowerCase())
			      .append(" ")
			      .append(dateToConvert.getYear());
		
		return dateString.toString();
	}

}
