@Test
 Background:
 Given user navigates to "https://www.google.com"
 Scenario: type stuff in
 When user sees "text50" element on "feature1" page
 Then user types "Hello" into "text61" textbox in "feature1" page
 Then user clicks on "text70" button in "feature1" page