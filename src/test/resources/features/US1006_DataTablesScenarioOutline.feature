@datatable
Feature: user makes 5 different login in Datatables page

  Scenario Outline: TC08 user should make 5 different login

    When user goes to "datatablesUrl" page
    Then user clicks new button
    And user enters name in "<firstName>"
    And user enters lastname "<lastName>"
    And user enters position "<position>"
    And user enters office "<office>"
    And user enters extension "<extension>"
    And user enters start date "<startDate>"
    And user enters salary "<salary>"
    And user clicks create button
    When user searches with first name
    Then user validates his name in name field
    And close the Website



    Examples:

      | firstName | lastName | position | office    | extension | startDate  | salary |
      | John      | Dalton   | QA       | England   | -         | 2022-16-12 | 8000   |
      | Jason     | Noah     | Tester   | Berlin    | -         | 2022-18-12 | 9000   |
      | Chris     | Xing     | BA       | München   | -         | 2022-11-12 | 6000   |
      | Donald    | Boran    | PO       | Turkey    | -         | 2022-10-12 | 10000  |
      | Marshal   | Kelly    | Tester   | Argentina | -         | 2022-25-12 | 1500   |
