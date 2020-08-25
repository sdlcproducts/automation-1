@Test
 Feature: Google
 Background:
 Given user navigates to "https://www.google.com"
 Scenario: type stuff in
 When user sees "SearchBarText" element on "feature1" page
 Then user types "Hello" into "SearchBarText" textbox on "feature1" page
 Then user clicks on "defaultButton" button in "feature1" page
 When user sees "SearchBarText" element on "feature1" page