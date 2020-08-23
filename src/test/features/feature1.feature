@Test
 Feature: Google
 Background:
 Given user navigates to "https://www.google.com"
 Scenario: type stuff in
 When user sees "text60" element on "feature1" page
 Then user types "Hello" into "text71" textbox on "feature1" page
 Then user clicks on "button80" button in "feature1" page
 When user sees "text90" element on "feature1" page