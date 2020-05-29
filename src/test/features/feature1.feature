@Demo
 Feature: Lightspeed Website Navigation
 Background:
 Scenario: User searches for Portfolio
 Given user navigates to "https://lsvp.com/"
 When user clicks "link60" Link
 Then user scrolls to "link70" element
 Then user clicks "link80" link