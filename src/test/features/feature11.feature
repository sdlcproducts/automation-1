@Thor
 Feature: Thor Fi
 Background:
 Given user navigates to "https://app.thor.financial/farm"
 Scenario: Claim Thor
 When user clicks "ClaimRewardsButton" button on "feature11" page
 Then user navigates to "chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html"
 And user clicks "ConfirmButton" button on "feature11" page