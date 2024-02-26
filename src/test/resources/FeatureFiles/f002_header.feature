Feature: Header page exploration at beCognizant portal

  @sanity @regression
  Scenario: Getting data from header page of beCognizant portal
    Given user navigates beCognizant portal
    When user click on Company header
    Then user stores all header features displayed in Company header
    When user click on Service Lines
    Then user stores all header features displayed in Service Lines
    When user click on Sales Resources
    Then user stores all header features displayed in Sales Resources
    When user click on Markets and Countries
    Then user stores all header features displayed in Markets and Countries
    When user click on Corporate Functions
    Then user stores all header features displayed in Corporate Functions
    When user click on People
    Then user stores all header features displayed in People
