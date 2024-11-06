#@Regression @ReportsRegression
Feature: Reports Scenarios

  Scenario: Verify Validation During Download Reports
    Given user login with user "7020424242 | 7020424242"
    And application launched successfully
    When user click on reports
    Then user click by text "Mutual Fund Statement"
    And user select from date as today
    And user wait for "2000" milli second
    And user select to date as one month back
    When user click by text "Download"
    Then verify validation error "To Date should be greater than From Date"
    And user click by text "Mutual Fund Statement"
    And user click by text "Mutual Fund Statement"
    When user select from date as march three
    And user select to date as april three
    And user click by text "Download"
#    Then user verify partial text "No Mutual Fund investment found on your"
    And user click by text "Mutual Fund Statement"
    When user click by text "NPS Transaction Statement"
    When user click by text "Download"
    Then verify validation error "This field is required"

  Scenario: User Download Reports
    Given application launched successfully
    When user click on reports
    Then user click by text "Mutual Fund Statement"
    And user select from date as may first
    And user select to date as may twentyFive
    When user click by text "Download"
    And user wait for "7000" milli second
    And user click done for in download page
    And user click by text "Mutual Fund Portfolio"
    When user click by text "View"
    Then user go back from "wealth" screen
    When user click by text "Download"
#    Then
    When user click by text "NPS Transaction Statement"
    And user click by text "Tier-1"
    And user click by text "Download"
    And user wait for "7000" milli second
    Then user click done for in download page

  Scenario: User Can See All Investment Transaction History
    Given application launched successfully
    And user click on reports
    When user click by text "Mutual Funds"
    Then user verify partial text "View Details"
    And user go back from "History" screen
    When user click by text "Gold & Silver"
    Then user verify text "View"
    And user go back from "Digital gold" screen
    When user click by text "Utility Bill Payment"
    Then user verify partial text "Completed"
    And user go back from "Bill Pay History" screen
    When user click by text "Rewards"
    Then user go back from "My Rewards" screen
    When user click by text "NPS"
    Then user verify partial text "Download"