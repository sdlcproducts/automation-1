@NewTestJCPenny
Feature: JCPenny login

Background:
User navigates to "https://www.jcpenney.com/signin?isfromMyAccount=true"

Scenario: Login
When user enters "Email" as "email" on "feature7" page
And enters "Password" as "password"
And click the "login" button
Then user should navigate to the home page
    