Feature: US1004 user uses configuration file with parameter

  @config
  Scenario: TC06 parameter usage from configuration properties file

    Given user goes to "brcUrl" page
    Then user wait 3 seconds
    And user tests whether url contain "blue"
    Then close the Website