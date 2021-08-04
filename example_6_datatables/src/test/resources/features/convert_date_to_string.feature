Feature: Converting date from numbers to a string

	As a user, I want to convert a table of data concerning dates in a numerical format
	into string formats so I can display them in my terminal to read and understand the stored data.
	
	Scenario: Valid non-edge case dates
		Given the dates:
			| Day | Month | Year |
			| 3   | 1     | 1992 |
			| 2   | 4     | 2021 |
		And the expected output strings:
			| Friday 3 January 1992 |
			| Friday 2 April 2021   |
		When the conversion operation is performed
		Then the actual output list must contain the exact same contents as the expected output list

		