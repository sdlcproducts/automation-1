@Demo
 Feature: Felicis Website Navigation
 Background:
 Given user navigates to "https://www.felicis.com/"
 Scenario: Navigate to About page
 Then user sees "link60" element
 Then scrolls to "link70" element
 Then user clicks "link80" link
 Then user clicks "link90" link
 Scenario: User searches for Portfolio
 Then user clicks "link110" link
 Then scrolls to "link120" element
 Then user clicks "link130" link