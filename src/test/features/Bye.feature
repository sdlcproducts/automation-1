@Great
Feature: This setups the automation project

  Background:
    Given user opens "Allegis" portal on "TEST" environment
    Then user types into "username" textbox

  Scenario: Type in page
    Then user enter "ThisText" into "username" textbox
