Feature: US1004 user uses configuration file with parameter

  @config
  Scenario: TC07 parameter usage from configuration properties file

    Given user goes to "amazonUrl" page
    And user tests whether url contain "amazon"
    Then close the Website