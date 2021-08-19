Feature: DVD store can remove old DVDs

  As a user, when I remove a DVD from the store, the DVD should longer be available in the stores item list.

  Scenario: Remove single dvd
	  Given a dvd store
	  And the following DVDs in the store
	    | Title 		| Year 		| Actor 		| ID |
	    | test  		| 2002 		| Actor1  	| 1  |
	    | test2     | 2005    | Actor2    | 2  |
	  And the expected outputs
	    | test - 2002 - Actor1 |
	  And the dvd to remove
	    | Title 		| Year 		| Actor 		| ID |
		  | test2     | 2005    | Actor2    | 2  |
	  When the dvd is removed
	  Then the get dvd list request should return the expected outputs
