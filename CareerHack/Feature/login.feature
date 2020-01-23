@login
Feature: log in to newtours with vaild username and password
Scenario Outline: log in to newtours
Given I am on my newtours homepages
When I put my "<user name>" and "<password>"
Then I click login


Examples:
|user name| |password|
|guest|     |guest|


@invalidlogin

Scenario:
Given I am on my newtours homepages
When I put my valid user name and invalid password
Then I click login
