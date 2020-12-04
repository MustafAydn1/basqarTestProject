Feature: Salary Types Functionality

  Background:
    Given Navigate to basqar website
    When  Login with valid username and password

    Scenario: Create and Edit And Delete a Salary Type
      Given Navigate to Salary Types Page
        | btnHumanRsc   |
        | setupHuman     |
        | btnSalaryTypes |

      When Create a Salary Type
      |inputName|Ali2|

      And Search Salary Type
      |inputSearchNameSlry|Ali2|


      And Edit Salary Type
        |inputName|Ali3|

      And Search Salary Type
        |inputSearchNameSlry|Ali3|

      And  Delete Salary Type

      Then Check control successfully



     # PASSED


