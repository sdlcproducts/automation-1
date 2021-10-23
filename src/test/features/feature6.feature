@FB
 Feature: User logs in
 Background:
 Given user navigates to "https://www.facebook.com"
 Scenario: Login
 When user enter "myusername" in "text61" textbox 
 And "mypwd" in "text71" textbox in "feature6" page
 And click the "button80" button
 Then user should navigate to home page66