#@Regression @InsuranceRegression
Feature: Insurance Scenario

  Scenario: Verify User Can't Take any Insurance Without KYC
    Given user login with user "7967664949 | 7967664949"
    And application launched successfully
    When user click on insurance tab
    Then user click on life insurance
    When user click on Let's Calculate in insurance screen
    Then user go back from "Life Insurance Planner" screen
    When user click by text "Check Premium & Buy"
    Then user clicks on Cancel button
    And user go back from "Term Life Insurance" screen
    When user click on daily hospital cash card
    And user click by text "Get Insured"
    Then user clicks on Cancel button
    And user wait for "2000" milli second
    And user go back from "Daily Hospital Cash" screen
    When user click on mediclaim card
    And user click by text "Get Insured"
    And user clicks on start now button
    Then user verify text "Investor Onboarding"

  Scenario: Verify User Can Take any Insurance
    Given user login with user "9853625362 | 9853625362"
    And application launched successfully
    When user click on insurance tab
    And user click on life insurance
    And user click by text "Check Premium & Buy"
    And user wait for "6000" milli second
    Then user go back from "Term Insurance" screen
    And user go back from "Term Life Insurance" screen
    When user click on daily hospital cash card
    And user click by text "Get Insured"
    And user click cash benefit twenty thousand per day

  @Validation @InsuranceValidation
  Scenario: Verify Validation During Adding Policy
#    Given user login with user "9853625362 | 9853625362"
    Given application launched successfully
    When user click on insurance tab
    And user click by text "My Policies"
    And user click by text "Add Policy"
    Then user select insurance type as "Life Insurance"
    And user enter policy number as "FLOSty"
    And user select insurance company as "Aditya Birla Health Insurance Co. Ltd."
    And user enter sum assured as "499"
    And user enter premium paid as "400"
    And user scroll to view  policy document
    And user select premium frequency as "Annual"
    And user select next premium due date
    When user click by text "Save"
    Then verify validation error "Allowed limit is between ₹500 to ₹99,99,99,999"
    And user enter sum assured as "100000"
    And user enter premium paid as "1000000"
    Then verify validation error "Premium amount should be less than Sum Assured"
    When user go back from "Add Insurance Policy" screen
    And user click by text "Add Policy"
    Then user select insurance type as "Life Insurance"
    And user enter policy number as "FLOSty"
    And user select insurance company as "Aditya Birla Health Insurance Co. Ltd."
    And user enter sum assured as "10000"
    And user enter premium paid as "400"
    And user scroll to view  policy document
    And user select premium frequency as "Annual"
    And user select next premium due date
    When user click by text "Save"
    Then verify validation error "Policy number should contain min 5 character & 1 digit"

  @Smoke @InsuranceSmoke
  Scenario: User Create a Motor Insurance Policy Annually
#      Given user login with user "9853625362 | 9853625362"
    Given application launched successfully
    When user click on insurance tab
    And user click by text "My Policies"
    And user click by text "Add Policy"
    Then user select insurance type as "Motor Insurance"
    And user enter policy number as " FLO34we"
    And user select insurance company as "Aditya Birla Health Insurance Co. Ltd."
    And user enter sum assured as "1000000"
    And user enter premium paid as "1000"
    And user scroll to view  policy document
    And user select premium frequency as "Annual"
    And user select next annual premium due date
    When user click by text "Save"
    And user click by text "Others"
    Then user verify static text "Motor Insurance"
    And user verify static text "Aditya Birla Health Insurance Co. Ltd."
    And user verify static text "  FLO34we"

  Scenario: User Create a Life Insurance Policy Quarterly
    Given application launched successfully
    When user click on insurance tab
    And user click by text "My Policies"
    And user click by text "Add Policy"
    Then user select insurance type as "Life Insurance"
    And user enter policy number as "RE2343WR"
    And user select insurance company as "Birla Sun Life Insurance Co. Ltd."
    And user enter sum assured as "200000"
    And user enter premium paid as "2000"
    And user scroll to view  policy document
    And user select premium frequency as "Quarterly"
    And user select next quarterly premium due date
    When user click by text "Save"
    Then user verify static text "Life Insurance"
    And user verify static text "Birla Sun Life Insurance Co. Ltd."
    And user verify static text " RE2343WR"

  @Smoke @InsuranceSmoke
  Scenario: User Create a Health Insurance Policy Monthly
    Given application launched successfully
    When user click on insurance tab
    And user click by text "My Policies"
    And user click by text "Add Policy"
    Then user select insurance type as "Health Insurance"
    And user enter policy number as "RE09432WQ"
    And user select insurance company as "Max Life Insurance Co. Ltd."
    And user enter sum assured as "500000"
    And user enter premium paid as "10000"
    And user scroll to view  policy document
    And user select premium frequency as "Monthly"
    And user select next monthly premium due date
    When user click by text "Save"
    And user click by text "Health"
    Then user verify static text "Health Insurance"
    And user verify static text "Max Life Insurance Co. Ltd."
    And user verify static text " RE09432WQ"
    When user click on insurance card slide drow
    Then user verify static text "RE09432WQ"
    And user verify static text "₹5.00 Lakhs"
    And user verify static text "Monthly"
    And user verify static text "₹10,000"
#    And user verify next premium due in policy detail screen

  Scenario: User Delete Insurance Policies
    Given application launched successfully
    When user click on insurance tab
    And user click by text "My Policies"
    And user delete insurance card from policy detail screen


