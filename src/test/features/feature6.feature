@FB
 Feature: User logs in
 Background:
 Given user navigates to "https://www.facebook.com"
 Scenario: Login
 When user enter "myusername" in "defaultText" textbox
 And "mypwd" in "defaultText" textbox in "feature6" page
 And click the "LoginButton" button
 Then user should navigate to home page