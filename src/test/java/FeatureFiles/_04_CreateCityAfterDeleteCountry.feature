Feature: Create City And Delete Country

  Scenario: Create city after delete country

  Scenario: Create a City and Delete

    Given Navigate to basqar website
    When  Login with valid username and password

    And Go to countries Page
      | btnSetup1    |
      | btnParamtrs  |
      | btnCountries |


    And Create a Country
      |inputName|SOMECOUNTRY1|
      |inputCode|SC|

    And Save click
      |btnSave|

    And Go to cities and create a city

    And  At first Delete country

    Then Check control error

    #PASSED