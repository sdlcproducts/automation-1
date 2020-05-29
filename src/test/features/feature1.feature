@Demo
 Feature: Lightspeed Website Navigation
 Background:
 Given user navigates to "https://lsvp.com/"
 Scenario: User searches for Portfolio
 When user clicks "link60" Link
 Then user scrolls to "link70" element
 Then user clicks "link80" link