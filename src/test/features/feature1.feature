@Demo
 Feature: Felicis Website Navigation
 Background:
 Scenario: Navigate to Portfolios
 Given user navigates to "https://www.felicis.com/"
 Then user sees "link60" element
 Then user clicks "link70" link
 Then user scrolls to "link80" link