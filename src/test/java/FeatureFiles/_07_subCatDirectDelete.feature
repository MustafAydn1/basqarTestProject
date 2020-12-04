Feature: Subject Category Delete Functionality

  Background:

    Given Navigate to basqar website
    When  Login with valid username and password


  Scenario: A exist Subject Category direct deleting
    And Go to Subject Categories
      |btneducation|
      |setupEducation|
      |subjectCategories|

    And Create a Subject Category
      | inputName | MySubjectCat1019 |
      | inputCode | 110219     |

    And Go to Subjetc page Create new Subject
      |inputName|Aydin99|
      |inputCode|Ay99|


    And Navigate to Subject Categories and Delete
    |inputSearchName|MySubjectCat1019|
    |inputSearchCode|110219|

    Then Check control error


    #PASSED