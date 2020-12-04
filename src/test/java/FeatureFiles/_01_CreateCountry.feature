Feature: Create a country

  Scenario: Create a new country

    Given Navigate to basqar website
    When  Login with valid username and password

    When Go to countries Page
      | btnSetup1    |
      | btnParamtrs  |
      | btnCountries |


    And Create a Country
      |inputName|New Countr|
      |inputCode|NC|

    And Save click
      |btnSave|

    Then Check control successfully


    #PASSED