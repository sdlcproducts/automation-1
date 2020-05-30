@Demo
 Feature: Kliener Perkins Homepage
 Background:
 Given user navigates to Kleiner Pekins Homepage "https://www.kleinerperkins.com/"
 Scenario: User moves to About page
 When user clicks the "button60" button
 Then sees "link70" element
 And clicks "link80" link
 Then user sees "text90" element
 Scenario: User searches for article
 When user clicks the "button110" button
 Then sees "link120" element
 And clicks "link130" link
 Then user sees "text140" element