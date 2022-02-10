@Thor
 Feature: Thor Fi
 Background: Navigation
 Then user navigates to "chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html"
 And user clicks "ChainButton" button on "feature11" page
 And user clicks "AvaxButton" button on "feature11" page
 Scenario: Claim Thor
 Given user navigates to "https://app.thor.financial/farm"
 When user clicks "ClaimRewardsButton" button on "feature11" page
 Then user navigates to "chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html"
 And user clicks "ConfirmButton" button on "feature11" page
 Scenario: Hydrate Drip
 Given user navigates to "https://drip.community/faucet"
 And user clicks "ConnectWalletButton" button on "feature11" page
 When user clicks "HydrateButton" button on "feature11" page
 Then user navigates to "chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html"
 And user clicks "ConfirmButton" button on "feature11" page