@Demo
 Feature: Kliener Perkins Homepage
 Background:
 Given user navigates to Kleiner Pekins Homepage "https://www.kleinerperkins.com/"
 Scenario: User moves to About page
 When user clicks the "button60" button
 And clicks "link70" link
 Then user sees "text80" element
 Scenario: User searches for article
 When user clicks the "button100" button
 And clicks "link110" link
 Then user sees "text120" element