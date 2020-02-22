@Herokuapp
Feature: Log in to Herokuapp account 

Scenario Outline: Herokuapp login 

	Given I am on Herokuapp login page 
	When I enter "<username>" and click next
	And I enter "<password>" 
	Then I click next to log in 
	
	Examples: 
		|username |password             |
		|tomsmith |SuperSecretPassword! |