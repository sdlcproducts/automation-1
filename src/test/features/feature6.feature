@FB
 Feature: User logs in
 Background:
 Given user navigates to "https://www.facebook.com"
 Scenario: Login
 When user will enter "myusername" in "username" textbox and "mypwd" in "text63" textbox in "feature6" page
 And click the "button70" button
 Then user should navigate to home page