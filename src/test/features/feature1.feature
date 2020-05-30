@Demo
 Feature: Kliener Perkins Homepage
 Background:
 Given user navigates to Kleiner Pekins Homepage "https://www.kleinerperkins.com/"
 Scenario: User moves to About page
 When sees the "button60" element
 Then user clicks the "button70" button
 Then sees "link80" element
 And clicks "link90" link
 Then user sees "text100" element
 Scenario: User searches for article
 When sees the "button120" element
 Then user clicks the "button130" button
 Then sees "link140" element
 And clicks "link150" link
 Then user sees "text160" element