Feature: Bank Account Functionality
  Background:

    Given Navigate to basqar website
    When  Login with valid username and password

    Scenario: Create a Bank Account then Edit and Delete
      Given  Go to Bank Account Page
        | btnSetup1      |
        | btnParamtrs    |
        | btnBankAccount |

      When Create a Bank Account
        | inputName           | Banka1          |
        | ibanBankAccount     | DE 123434545634 |
        | integrationCodeBank | 2.4             |

      And Search  new Bank Account
      |inputSearchName|Banka1|


      And Edit Bank Account and Delete
        | inputName           | Banka2           |
        | ibanBankAccount     | DE 1234345456342 |
        | integrationCodeBank | 2.4              |

      Then Check control successfully

      #PASSED
