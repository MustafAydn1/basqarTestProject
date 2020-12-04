Feature: City Create Delete Functionality

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

    When Go to cities and create a city

    Then Delete city

    Then Check control successfully


    #PASSED