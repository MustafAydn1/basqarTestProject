Feature: Cost Centers Functionality

  Background:
    Given Navigate to basqar website
    When  Login with valid username and password

    Scenario: Create And Edit And Delete Cost Centers

      Given Navigate to Cost Centers Page
      |btnBudget|
      |btnSetupBudget|
      |btnCostCenter|

      When Create a New Cost Center part1
        | nameCostCentr | Halid1 |
        | codeCostCentr | Hld1   |
        | orderNO       | 121    |

      And  Edit and Delete Cost Centers
        | nameCostCentr | Halid2 |
        | codeCostCentr | Hld2   |
        | orderNO       | 122    |

      Then Check control successfully






