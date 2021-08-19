Feature: Navigate to Bing

	As a user, I want to navigate to Bing so that I can search for junk on the web
	
	Scenario: Goes to Bing
		When I request www.bing.com
		Then I am on the bing home page
		
	Scenario: Search for Doge
	  Given I am on https://www.bing.com
	  When I search for doge
	  Then the title of the page should be "doge - Bing"
