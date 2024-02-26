Feature: Validation of user details at be.cognizant

  @regression
  Scenario: Successful validation of user details
    Given user navigates beCognizant portal
    Then user click on myaccount menu
    Then user should see user account details
