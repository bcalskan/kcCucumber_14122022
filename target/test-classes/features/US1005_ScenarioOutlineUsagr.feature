  # go to Amazon and search nutella, java, apfel, birne
  # test if result texts contain these words


  Feature: US1005 user search desired words on Amazon

    Scenario Outline: TC07 search for words in a list

      Given user goes to "amazonUrl" page
      Then user search for "<desiredWord>"
      And user tests whether results contain "<desiredWordControl>"
      And close the Website

      Examples:
        | desiredWord | desiredWordControl |
        | Nutella     | Nutella            |
        | Java        | Java               |
        | Apfel       | Apfel              |
        | Birne       | Birne              |
