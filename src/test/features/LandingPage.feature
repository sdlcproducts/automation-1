Feature: This setups the automation project

Background:
	Given user opens "Application" portal on "TEST" environment
	Then user sees "Submit" object on "Home" page
 
Scenario: Validate Homepage
	Then user sees "Sign Out" object on "Landing" page
	Given user clicks "Submit" button
