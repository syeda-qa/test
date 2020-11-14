@promo 
Feature: Output the promo hidden text

Scenario: Output the promo hidden text

	Given user is on greenkart homepage 
	When user selects  any items
	And  user clicks on add to cart
	And   click on the shopping cart
	And   click on the procced to checkout
	And   Click on the apply button
	Then  get the hidden text on our console successfully 
	
	