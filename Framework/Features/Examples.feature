@examples 
Feature: Background test for common scenario 

Scenario Outline: 

	Given user is on homepage 
	When  user clicks on signon button 
	And   user  puts "<username>" and clicks next button
	And   user inputs "<password>" and clicks on submit button 
	Then  user will be logged in 
	
	Examples: 
		|username                |password  |
		|bristym27@gmail.com     |Akash331  |
		