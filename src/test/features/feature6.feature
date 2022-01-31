@UI
 Feature: Upload Invoice
 Scenario: Upload Invoice for Mehraj
 Given user navigates to "https://hr2.artech.com/psp/ps_hr/?cmd=login&languageCd=ENG&"
 Then user enters "126610" into "defaultText" textbox in "feature6" page
 And user enters "defaultText" into "Password" textbox in "feature6" page
 Then user clicks on "defaultButton" button on "feature6" page
 Then user navigates to "https://hr2.artech.com/psp/ps_hr/?cmd=login&languageCd=ENG&"