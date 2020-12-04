Feature: Salary Modifiers Functionality

  Background:
    Given Navigate to basqar website
    When  Login with valid username and password

  Scenario: Create And Edit And Delete Salary Modifiers

    Given Navigate to Salary Modifiers Page
      | btnHumanRsc   |
      | setupHuman    |
      |btnSalaryModfrs|
    When Create a Salary Modifiers with Fixed Value
      | descrptModfr  | alim |
      | variableModfr | seni |
      | integratModfr | 23f7 |
      | priortyModfr  | 23   |
      | amaountModfr  | 12   |

    And Search Salary Modifiers
    |searchDesctModfr|alim|
    |searchVariableModfr|seni|

    And  Edit Salary Modifier and Delete
      | descrptModfr  | alim1 |
      | variableModfr | seni1 |
      | integratModfr | 23f71 |
      | priortyModfr  | 231   |
      | amaountModfr  | 121   |

    Then Check control successfully

    #no passed

