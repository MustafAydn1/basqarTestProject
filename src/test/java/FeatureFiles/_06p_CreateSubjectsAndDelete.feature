Feature: Subjects in Education

  Scenario: Create a Subject And Delete
    Given Navigate to basqar website
    When  Login with valid username and password

    And Go to Subjects
    |btneducation|
    |setupEducation|
    |subjects|

    And  Create a Subject
      | inputName       | Musta5 |
      | inputCode       | Ms5    |
      | newSubCatName   | Musta6 |
      | newSubCatCode   | Ms6    |

      And  Delete this subject

      | inputSearchName | Musta5 |
      | inputSearchCode | Ms5    |

    Then Check control successfully

    #PASSED