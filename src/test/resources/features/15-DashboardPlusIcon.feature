#@Regression @DashboardPlusIconRegression
Feature: DashboardPlusIcon Scenarios

  Scenario: Verify Expense Section is Functional
    Given user login with user "7120921760 | 7120921760"
    And application launched successfully
    When user click plus icon in dashboard
    And user wait for "2000" milli second
    And user click by text "Track Expenses"
    Then user verify text "Filter"
    When user go back from "My Transactions" screen
    And user click plus icon in dashboard
    And user click on pay utility bills
    Then user verify static text "Postpaid Bills"

  Scenario: Verify Investment & Insurance section is Functional
    Given application launched successfully
    When user click plus icon in dashboard
    And user wait for "2000" milli second
    And user click by text "Set Goals"
    Then user go back from "Financial Goals" screen
    And user click plus icon in dashboard
    When user click by text "Invest in NPS"
    Then user go back from "NPS" screen
    And user click plus icon in dashboard
    When user click on invest in mutual fund
    Then user go back from "Mutual Funds" screen
    And user click plus icon in dashboard
    When user click on invest in mutual fund basket
    Then user go back from "Mutual Fund Baskets" screen
    And user click plus icon in dashboard
    When user click on invest in gold and silver
    Then user go back from "Digital Gold" screen
    And user click plus icon in dashboard
    When user click by text "Buy Insurance"
    Then user verify static text "Personal & Family Insurance"

  Scenario: Verify Reporting & Tracking section is Functional
    Given application launched successfully
    When user click plus icon in dashboard
    And user click on import mutual fund
    And user wait for "2000" milli second
    Then user go back from "Import Portfolio" screen
    And user wait for "2000" milli second
    And user click plus icon in dashboard
    When user click on add insurance policies
    Then user go back from "Add Insurance Policy" screen
    And user wait for "2000" milli second
    And user click plus icon in dashboard
    When user click on download reports
    Then user verify static text "Reports"