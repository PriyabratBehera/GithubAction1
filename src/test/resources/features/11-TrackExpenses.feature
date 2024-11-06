@Regression @TrackExpenseRegression
Feature: Track Expenses Scenarios

  Scenario: User Create Transaction Type as Spending for Home Rent
    Given user clean up the app data for "7690234224 | 7690234224"
    And user login with user "7690234224 | 7690234224"
    And application launched successfully
    When user clicks on Track Expenses
    And  user click do it later for sms permission
    And user wait for expense dashboard
    And user click on add Transaction
    And user wait for "2000" milli second
    And user select transaction type as "Spending"
    And user choose transaction done for "Home"
    And user select sub category as "Rent"
    And user enters amount "10000" in add transaction screen
    And user select date of transaction as today
    When user click by text "Save"
    When user filter "Current Month" of expense
    Then user can see the budget transaction as "Home Rent ₹10,000"

  Scenario: User Create Transaction Type as Investment for Investing in MF
    Given application launched successfully
    When user clicks on Track Expenses
    And  user click do it later for sms permission
    And user wait for expense dashboard
    And user click on add Transaction
    And user wait for "2000" milli second
    And user select transaction type as "Investment"
    And user choose transaction done for "MutualFund"
    And user enters amount "5000" in add transaction screen
    And user select date of transaction as one month back
    When user click by text "Save"
    When user filter "Last Month" of expense
    Then user can see the budget transaction as "Investment MutualFund ₹5,000"

  Scenario: User Create Transaction For Income Home for Salary
    Given application launched successfully
    When user clicks on Track Expenses
    And  user click do it later for sms permission
    And user wait for expense dashboard
    And user click on add Transaction
    And user wait for "2000" milli second
    And user select transaction type as "Income"
    And user choose transaction done for "Salary"
    And user enters amount "25000" in add transaction screen
    And user select date of transaction as last year as jul
    When user click by text "Save"

  Scenario: User Create Transaction for Lone Repayment for EMI
    Given application launched successfully
    When user clicks on Track Expenses
    And  user click do it later for sms permission
    And user wait for expense dashboard
    And user click on add Transaction
    And user wait for "2000" milli second
    And user select transaction type as "Loan Repayment"
    And user choose transaction done for "EMI"
    And user enters amount "4000" in add transaction screen
    And user select date of transaction as last year
    When user click by text "Save"
    When user filter "Last Fiscal Year" of expense
    Then user can see the budget transaction as "LoanRepayment EMI ₹4,000"

  Scenario: User Edit the Expense
    Given user clean up the app data for "7690234224 | 7690234224"
    And application launched successfully
    When user clicks on Track Expenses
    And  user click do it later for sms permission
    And user wait for expense dashboard
    And user click on add Transaction
    And user wait for "2000" milli second
    And user select transaction type as "Investment"
    And user choose transaction done for "Equity"
    And user enters amount "30000" in add transaction screen
    And user select date of transaction as today
    When user click by text "Save"
    And user wait for "2000" milli second
    And user click on Investment Equity
    And user select transaction type as "Spending"
    And user choose transaction done for "Dining"
    And user select sub category as "Ordered"
    And user enters amount "12000" in add transaction screen
    And user select date of transaction as one month back
    And user click by text "Save"
    When user filter "Last Month" of expense
    Then user can see the budget transaction as "Dining Ordered ₹12,000"

  Scenario: User Delete the Existing Expense
    Given user clean up the app data for "7690234224 | 7690234224"
    Given application launched successfully
    When user clicks on Track Expenses
    And  user click do it later for sms permission
    And user wait for expense dashboard
    And user click on add Transaction
    And user wait for "2000" milli second
    And user select transaction type as "Investment"
    And user choose transaction done for "Equity"
    And user enters amount "30000" in add transaction screen
    And user select date of transaction as today
    When user click by text "Save"
    And user wait for "2000" milli second
    And user click on Investment Equity
    And user click on delete icon in track expense screen
    When user clicks on Cancel button
    Then user verify static text "Edit Transaction"
    And user click on delete icon in track expense screen
    When user click on yes button
    Then user unable to see investment in equity transaction

  @Smoke @TrackExpenseSmoke
  Scenario: After Adding Expense User Check the Budget Section
    Given user clean up the app data for "7690234224 | 7690234224"
#      And user login with user "7690234224 | 7690234224"
    And application launched successfully
    When user clicks on Track Expenses
    And  user click do it later for sms permission
    And user wait for expense dashboard
    And user click on add Transaction
    And user wait for "2000" milli second
    Then user select transaction type as "Spending"
    And user choose transaction done for "Home"
    And user select sub category as "Rent"
    And user enters amount "10000" in add transaction screen
    And user select date of transaction as today
    When user click by text "Save"
    And user click on add Transaction
    And user select transaction type as "Spending"
    And user choose transaction done for "Household"
    And user select sub category as "Electricals"
    And user enters amount "1000" in add transaction screen
    And user select date of transaction as today
    Then user click by text "Save"
    When user click on add Transaction
    And user select transaction type as "Spending"
    And user choose transaction done for "Personal"
    And user select sub category as "Salon"
    And user enters amount "500" in add transaction screen
    And user select date of transaction as today
    Then user click by text "Save"
    When user click on add Transaction
    And user select transaction type as "Investment"
    And user choose transaction done for "Equity"
    And user enters amount "30000" in add transaction screen
    And user select date of transaction as today
    Then user click by text "Save"
    When user click on add Transaction
    And user select transaction type as "Investment"
    And user choose transaction done for "MutualFund"
    And user enters amount "5000" in add transaction screen
    And user select date of transaction as today
    Then user click by text "Save"
    And user click on add Transaction
    And user select transaction type as "Income"
    And user choose transaction done for "Salary"
    And user enters amount "25000" in add transaction screen
    And user select date of transaction as today
    When user click by text "Save"
    And user click on add Transaction
    And user select transaction type as "Income"
    And user choose transaction done for "Profit"
    And user enters amount "3000" in add transaction screen
    And user select date of transaction as today
    When user click by text "Save"
    When user click on add Transaction
    And user select transaction type as "Loan Repayment"
    And user choose transaction done for "EMI"
    And user enters amount "4000" in add transaction screen
    And user select date of transaction as today
    Then user click by text "Save"
    And user go back from "My Transactions" screen
    And user wait for "4000" milli second
    When user click on manage budget
    Then user click by text "Create Budget"
    And user click by text "Create Budget"
    When user enter budget fund as "500000"
    And user click static text "Create Budget"
    And user click by text "Save & Continue"
    And user enter save and invest amount as "300000"
    And user click static text "Create Budget"
    And user click by text "Save & Continue"
    And user enter home rant amount as "10000"
    And user click static text "Create Budget"
    And user click by text "Save & Continue"
    And user enter for loan amount as "20000"
    And user click static text "Create Budget"
    And user click by text "Save & Continue"
    And user verify static text "Utility Bills & Recharge"
    And user enter utility bills as "1000"
    And user click static text "Create Budget"
    When user click on Add more
    And user click on select
    When user select spend category as "Household"
    Then user enter fund as "1000"
    And user click static text "Create Budget"
    And user click on Add more
    And user click on select
    When user select spend category as "Personal"
    Then user enter fund as "300"
    And user click static text "Create Budget"
    When user click by text "I am done"
    And user verify budget income card
    And user verify investment remaining budget card
    When user scroll to view Utility
    Then user verify household remaining
