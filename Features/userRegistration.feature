@userRegistration
Feature: user registration

@userRistrationValid
Scenario Outline: add a new valid user

Given I am on the application homepage
When I click on register link
And I enter "<first name>", "<last name>", "<phone>", "<email>", "<user name>", "<password>", "<confirm password>"
And I click on submit button
Then I find registration successful page

Examples:
|first name	|last name	|phone			|email				|user name	|password	|confirm password|
|Tapan		|Minnesota	|234-432-4444	|tapan@yahoo.com		|mahbub1		|Password1	|Password1		 |
|Ummul		|Mukta		|237-432-4446	|mukta@yahoo.com		|mukta1		|Password2	|Password2		 |

