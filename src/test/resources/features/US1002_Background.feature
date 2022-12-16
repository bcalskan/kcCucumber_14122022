Feature: US1002 common steps work with background

  Background:
    Given user goes to amazon page

  Scenario: TC04 search nutella on Amazon
    And user search for Nutella
    Then user tests whether results contain Nutella
    And close the Website


  Scenario: TC05 search java on Amazon
    And user search for Java
    Then user tests whether results contain Java
    And close the Website
