Feature:Human Resources

  Background:
    Given Navigate to basqar website
    When  Login with valid username and password

    Scenario: Position Salary
      When Go human resources link and create a new position salary
        | btnHumanRsc     |
        | setupHuman      |
        | btnPositionSlry |

      And Edit and delete position Salary



      Then Check control successfully

      #PASSED

