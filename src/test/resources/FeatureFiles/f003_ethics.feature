Feature: Ethics and Compliance

  @sanity @regression
  Scenario: Ethics and Compliance Page
    Given user navigates beCognizant portal
    When user clicks on Corporate Function
    Then user hover to Legal & Corporate Affairs
    Then user click on Ethics and Compliance
    When Ethics and Compliance page is visible to user
    Then user prints the details of Director
    Then user prints all the links present in page
    Then user prints the details of EAC officer along with seven elements of ethics and compliance
    When user clicks on Ethics and Compliance Risks
    Then user print all the risks present in the web page
