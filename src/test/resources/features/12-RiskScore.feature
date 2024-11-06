@Regression @RiskScoreRegression
Feature: Investment Planing Questions

  Scenario: User Attend Investment Planing Question
    Given user login with new user
    And user click by text "I invest, but have not done any financial planning"
    And user click by text "Continue"
    When user click static text "Back"
    Then user click by text "I have a financial plan and I follow it for my investments"
    And user click by text "Continue"
    When user click by text "I am yet to do my tax planning for the year"
    And user click by text "Continue"
    Then user click by text "I do not have any term insurance"
    And user click by text "Continue"
    When user click by text "Continue"
    Then user click do it later for sms permission
    When user clicks on Track Expenses
    Then  user click do it later for sms permission
    And user go back from "My Transactions" screen
    When user clicks on Track Expenses
    Then user verify static text "My Transactions"
    And user go back from "My Transactions" screen
    And user delete the new user account

  Scenario: User register as corporate user
    Given user login with corporate user
    And user click by text "I invest, but have not done any financial planning"
    And user click by text "Continue"
    When user click by text "I am yet to do my tax planning for the year"
    And user click by text "Continue"
    Then user click by text "I do not have any term insurance"
    And user click by text "Continue"
    When user click by text "Continue"
    Then user click do it later for sms permission
    When user click on hamburger menu
    Then user verify static text "ValueValueFloat Technologies"

  @Smoke @RiskScoreSmoke
  Scenario: User Check Personal Risk Score
    Given user login with new user
    And user click by text "I invest, but have not done any financial planning"
    And user click by text "Continue"
    Then user click by text "I do not need to do tax planning"
    And user click by text "Continue"
    Then user click by text "I do not have any term insurance"
    And user click by text "Continue"
    When user click by text "Continue"
    Then  user click do it later for sms permission
    When user click on check your personal risk score
    And user click by text "Continue"
    When user click by text "A) Protect my investment capital"
    And user click by text "Continue"
    And user click by text "B) Short term, i.e. 1 to 3 years"
    And user click by text "Continue"
    And user click by text "C) Competent"
    And user click by text "Continue"
    And user click by text "D) Best case +25% & worst case -20%"
    And user click by text "Continue"
    And user click by text "E) I understand that investments are for long term, I would not be worried about fluctuations in its value"
    And user click by text "Continue"
    And user click by text "E) More than 10 years"
    Then user click by text "Submit"
    When user click by text "Male"
    And user click by text "Yes"
    And user click by text "North"
    And user click by text "Private Sector"
    And user select date of birth
    And user click by text "Submit"
    And user wait for "5000" milli second
    Then user verify static text "40"
    And user verify static text "My Risk Profile: Balanced"
    When user click by text "Set a Financial Goal"
    And user go back from "Select Goal Category" screen
    And user click by text "Go to Dashboard"
    And user delete the new user account

  Scenario: User Re-evaluate Risk Score
    Given user login with this user "9989799998 | 9989799998"
    And application launched successfully
    And user wait for "5000" milli second
    When user click on check your personal risk score
    And user wait for "5000" milli second
    Then user click by text "Re-Evaluate"
    When user click by text "C) Balance between capital protection and portfolio growth"
    And user click by text "Continue"
    And user click by text "C) Medium term, i.e. 3 to 5 years"
    And user click by text "Continue"
    And user click by text "C) Competent"
    And user click by text "Continue"
    And user click by text "C) Best case +15% & worst case -10%"
    And user click by text "Continue"
    And user click by text "C) Continue to hold, but would sell if the loss is around 20%"
    And user click by text "Continue"
    And user click by text "C) 3 to 5 years"
    Then user click by text "Submit"
    When user click by text "Female"
    And user click by text "No"
    And user click by text "East"
    And user click by text "Business"
    And user select date of birth
    And user click by text "Submit"
    And user wait for "5000" milli second
    Then user verify static text "36"
    And user verify static text "My Risk Profile: Balanced"
    When user click by text "Go to Dashboard"
    Then user verify check your personal risk score
