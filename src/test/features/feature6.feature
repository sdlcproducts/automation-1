@FB
 Feature: User logs in
 Background:
 Given user navigates to "https://www.facebook.com"
 Scenario: Login
 When user will enter the "myusername" in "username" textbox and "mypwd" in "password" textbox in "feature6" page
 And click the "button70" button
 Then user should navigate to home page