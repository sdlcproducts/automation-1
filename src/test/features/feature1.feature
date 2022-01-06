@Test
 Feature: Google
 Background:
 Given user navigates to "https://www.google.com"
 Scenario: Search on Google
 When user sees "defaultText" element
 Then user types "Hello" into "defaultText" textbox
 Then user clicks on "SearchButton" button