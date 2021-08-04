@calculator @service
Feature: Calculator addition
  Testing whether the calculator can successfully add numbers.
  
  As a user, I want to add two or more numbers so I can then use 
  the sum in further calculations or data based decision making.

  Scenario Outline: Integer addition
    Given the first number <num1>
    And the second number <num2>
    When the numbers are added
    Then the result should be <result>
    
    Examples:
			| num1 | num2 | result |
			| 2    | 2    | 4      |
			| 4    | 4    | 8      |
			| 10   | 10   | 20     |
			| 145  | 155  | 300    |
			
	
