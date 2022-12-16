Feature: US1003 user should search using parameter

  @parameter
  Scenario: TC05 user should search on Amazon using parameter
    Given user goes to amazon page
    And user search for "Nutella"
    And user tests whether results contain "Nutella"
    Then close the Website