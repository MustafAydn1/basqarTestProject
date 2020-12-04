Feature: Subject Categories in Education

  Scenario: Create new Subject Category and Delete
    Given Navigate to basqar website
    When  Login with valid username and password

    And Go to Subject Categories
    |btneducation|
    |setupEducation|
    |subjectCategories|

    And Create a Subject Category
      | inputName | Aydinlar1 |
      | inputCode | 10291     |

    And Delete Subject Category
    |inputSearchName|Aydinlar1|
    |inputSearchCode|10291|

    Then Check control successfully

    #PASSED
