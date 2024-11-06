@Login
Feature: Login Scenarios

  Scenario Outline: Verify login with invalid mobile number
    When user clicks on get started button
    And user enters mobile number as "<mobile>"
    And user clicks on continue
    Then login should fail with error "<err>"
    Examples:
      | mobile     | err                       |
      | 1234567890 | Enter valid mobile number |

  Scenario Outline: Verify login with less than ten digit mobile number
    When user clicks on get started button
    And user enters mobile number as "<mobile>"
    And user clicks on continue
    Then login should fail with error "<err>"
    Examples:
      | mobile | err                                     |
      | 9876   | Mobile number should contain ten digits |


  Scenario Outline: Verify login with invalid OTP
    When user clicks on get started button
    And user enters mobile number as "<mobile>"
    And user clicks on continue
    And user enters invalid otp
    And user clicks on submit button
    Then login should fail with error "<err>"
    Examples:
      | mobile     | err         |
      | 9014672393 | Invalid OTP |

  Scenario Outline: Verify successful login with valid OTP
    When user logout of app
    When user clicks on get started button
    And user enters mobile number as "<mobile>"
    And user clicks on continue
    And user enters otp
    And user clicks on submit button
    And user allows permission
    Then user should see home page with profile name "<name>"
    Examples:
      | mobile     | name  |
      | 9014672393 | LITAN |







