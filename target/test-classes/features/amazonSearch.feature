Feature: Amazon Search

  Scenario: TC01 search a word on Amazon
    Given user goes to amazon page
    Then user search for Nutella
    And user tests whether results contain Nutella
    And close the Website

    Scenario: TC02 search Java on Amazon
      Given user goes to amazon page
      Then user search for Java
      And user tests whether results contain Java
      And close the Website