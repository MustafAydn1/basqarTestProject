Feature: Excell Template Functionality on Reports

  Background:
    Given Navigate to basqar website
    When  Login with valid username and password

    Scenario: Excel Template Create and Edit And Delete
      Given Navigate to Excel Template Page
        | btnreports       |
        | btnReportSetup   |
        | bntExcelTemplate |


      When Create a new Budget Excel Template part Budget Template
        | inputName        |Betul2  |
        | excelPeriodCount | 10 |

      And Create a new Budget Excel Template part Version
        | excelRow | 12 |
        | excelCol | 13 |
        | excelRow | 22 |
        | excelCol | 23 |



      And Delete new Budget Excel Template
         |inputSearchName|Betul2|

      Then Check control successfully

      #PASSED