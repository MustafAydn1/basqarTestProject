Feature:

  Background:
    Given Navigate to basqar website
    When  Login with valid username and password



  Scenario: Create Country and Cities and first delete country
    When Go to countries Page
      | btnSetup1    |
      | btnParamtrs  |
      | btnCountries |


    And Create a Country
    |inputName|SOMECOUNTRY1|
    |inputCode|SC|

    And Save click
    |btnSave|

    When Go to cities and create a city

    And  At first Delete country

    Then Check control error

    Then Delete first city after country

    Then Check control successfully

#ALL OF THİS PASSED

