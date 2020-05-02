@Smoke
 Feature: This setups the automation project
 
 Background:
 	Given user opens "Allegis" portal on "TEST" environment

 Scenario: Type in page
   Then user types "XYZ" into "input81" textbox
   Then user clicks "input90" button
   Then user types "LMNOP" into "input101" textbox
   Then user clicks "xyz" checkbox
   Then user unclicks "xyz" checkbox
