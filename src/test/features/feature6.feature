@FB
 Feature: User logs in
 Background:
 Given user navigates to "https://www.facebook.com"
 Scenario: Login
 When user enter "myusername" in "text61" textbox 
 And "button70" in "password" textbox in "feature6" page
 And click the "Login" button
 Then user should navigate to home page99