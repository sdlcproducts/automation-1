@Demo
 Feature: Scequoia Homepage
 Background:
 Given user navigates to "https://www.sequoiacap.com/"
 Scenario: Find Company
 Then user clicks "link60" link
 When user clicks "link70" button
 Then user sees "link80" element
 Then user clicks "link90" link
 Scenario: User searches website
 When user clicks "button110" button
 Then user types in "Wow" in "text121" textbox