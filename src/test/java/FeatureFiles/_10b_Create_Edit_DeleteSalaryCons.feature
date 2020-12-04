Feature:Salary Constants Functionality

  Background:
    Given Navigate to basqar website
    When  Login with valid username and password

    Scenario: Create And Edit And Delete Salary Constant

      Given Navigate to Salary Constant Page
        | btnHumanRsc   |
        | setupHuman    |
        | btnSalaryCons |

      When Create a new Salary Constant
        | nameSalaryCons   | Mustafa3|
        | inputKey         | qwert3   |
        | inputValue       | 1       |

      And Search Salary Constant
        | nameSerchSlryCon | Mustafa3 |
        | keySerchSlryCon  | qwert3   |

      And Edit this Salary Constant
        | nameSalaryCons   | Mustafa4|
        | inputKey         | qwert4   |
        | inputValue       | 2       |



      And Delete this Salary Constant
        | nameSerchSlryCon | Mustafa4 |
        | keySerchSlryCon  | qwert4   |

      Then Check control successfully


  #PASSED


  #Salary Constants::constıns::Maaş Sabitleri


