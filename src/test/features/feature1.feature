@Demo
 Feature: Scequoia Homepage
 Background:
 Given user navigates to "https://www.sequoiacap.com/"
 Scenario: Find Company
 When user clicks "link60" link
 Then user sees "link70" element
 Then user clicks "link80" link
 Scenario: User searches website
 When user clicks "link100" link
 Then user types in "Wow" in "text111" textbox
 Scenario: Navigate to people page
 When userss clicks "link130" link
 Then users clicks "link140" link
 Then user clickss on "link150" link