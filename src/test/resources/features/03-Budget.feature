@Regression @BudgetRegression
Feature: Create Budget Scenarios

  @Validation @BudgetValidation
  Scenario: Verify Validation in Create Budget Screen
    Given user clean up the app data for "9191787806 | 9191787806"
    And user login with user "9191787806 | 9191787806"
    And application launched successfully
    When user click on manage budget
    Then user click by text "Create Budget"
    And user verify static text "Create Budget"
    And user verify static text "Add budget essentials"
    And user verify static text "1 / 5"
    And user verify static text "How much will you earn this month?"
    And user verify static text "Budget category"
    And user verify static text "Income"
    When user enter budget fund as "0"
    Then verify validation error "Allowed limit is between 1 to 99,99,99,999"
    When user enter budget fund as "9999999999"
    Then verify validation error "Allowed limit is between 1 to 99,99,99,999"

  @Smoke @BudgetSmoke
  Scenario: Verify Add More Link is Functional
    Given user clean up the app data for "9191787806 | 9191787806"
#    And user login with user "9191787806 | 9191787806"
    And application launched successfully
    When user click on manage budget
    And user click by text "Create Budget"
    And user wait for "2000" milli second
    When user enter budget fund as "500000"
    And user click by text "Save & Continue"
    And user wait for "1000" milli second
    Then user verify partial static text "Available Funds: ₹5,00,000"
    When user enter budget amount as more than available funds
    Then verify validation error "Value should not be more than available funds"
    And user verify static text "Investment"
    And user enter save and invest amount as "10000"
    And user click by text "Save & Continue"
    And user verify static text "How much do you pay for home rent?"
    And user verify static text "Home Rent"
    And user enter home rant amount as "20000"
    And user click by text "Save & Continue"
    And user verify static text "How much do you pay for loans?"
    And user verify static text "Loan & EMI"
    And user enter for loan amount as "30000"
    And user click by text "Save & Continue"
    And user verify static text "How much do you pay for utility bills?"
    And user verify static text "Utility Bills & Recharge"
    And user enter utility bills as "40000"
    When user click on Add more
    And user verify static text "Available Funds: ₹4,00,000"
#
  Scenario: Verify I am done Link is Functional
    Given user clean up the app data for "9191787806 | 9191787806"
    And application launched successfully
    When user click on manage budget
    And user click by text "Create Budget"
    When user enter budget fund as "500000"
    And user click by text "Save & Continue"
    Then user verify partial static text "Available Funds"
    And user enter save and invest amount as "10000"
    And user click static text "Create Budget"
    And user click by text "Save & Continue"
    And user enter home rant amount as "20000"
    And user click by text "Save & Continue"
    And user enter for loan amount as "30000"
    And user click by text "Save & Continue"
    And user enter utility bills as "40000"
    And user click static text "Create Budget"
    When user click on I am done
    And user wait for "3000" milli second
    Then user verify static text "My Budget"

  Scenario: Verify UI of My Budget Screen After Creating Budget
    Given application launched successfully
    When user click on manage budget
    And user check is there any existing budget
    And user verify Report
    Then user verify static text "Total Spending Budget"
    And user verify static text "Detailed Budget"
    And user verify partial text "Budgeted Income"
    And user verify partial text "Investment"
    And user scroll to view Utility
    And user verify partial text "Home"
    And user verify partial text "LoanRepayment"
    And user verify partial text "Utility"

  Scenario: Verify UI of Create Budget Screen After Creating Budget
    Given application launched successfully
    When user click on manage budget
    And user check is there any existing budget
    And user click by text "Create Budget"
    And user verify partial static text "Available Funds"
    And user verify static text "How much do you want to spend?"
    And user verify static text "Budget category"
    And user verify partial static text "Receive alert when"
    And user verify Select
    And user verify percent tab
    And user verify text "I am done"
    And user verify text "Add more"

  @Smoke @BudgetSmoke
  Scenario: Create an Another Category of Budget After Creating Budget
    Given application launched successfully
    When user click on manage budget
    And user check is there any existing budget
    And user click by text "Create Budget"
    And user click on select
    When user select spend category as "Home"
    Then user verify partial static text "You already have this category budget"
    And user close you already have this popup
    And user wait for "5000" milli second
    When user select spend category as "Medical"
    Then user verify medical category in create budget screen
    And user select seventy percentage tab
    And user select fifty percentage tab
    And user enter amount as "50000" for medical spend category
    And user click static text "Create Budget"
    And user click by text "I am done"
    And user wait for "3000" milli second
    And user verify static text "My Budget"

  Scenario: Verify Budgeted Income Card is Functional
    Given application launched successfully
    When user click on manage budget
    And user check is there any existing budget
    When user click by text contains "Budgeted Income"
    Then user verify static text "Review Budget"
    And user verify static text "Income"
    And user verify static text "Budget"
    And user verify static text "Actual"
    And user verify static text "₹5,00,000"
    And user verify static text "Yet to receive "
    And user verify static text "Till now you have received only 0% of your expected income"
    And user verify Edit

  Scenario: Verify Edit Budget is Functional After Creating a Budget
    Given application launched successfully
    When user click on manage budget
    And user check is there any existing budget
    And user wait for "2000" milli second
    When user scroll to view medical
    And user click on medical budget card
    Then user verify static text "Review Budget"
    And user verify static text "Medical"
    And user verify static text "Funds Remaining: "
    When user click on edit budget
    Then user verify static text "Edit Budget"
    And user verify partial static text "Receive alert when"
    When user click on information icon
    Then user verify partial static text "Amount available to create a budget"
    And user close the popup
    And user click delete icon in edit budget screen
    And user clicks on Cancel button
    And user click delete icon in edit budget screen
    And user click on yes button
    And user wait for "3000" milli second
    And user verify text "Create Budget"

  Scenario: Verify Report link is Functional in My Budget Screen
    Given application launched successfully
    When user click on manage budget
    When user click on report
    Then user verify static text "My Financial Report"
    And user verify static text "This Month"
    And user verify static text "My Earnings"
    And user verify static text "Investments"
    And user verify static text "Loan Payments"
    And user verify static text "Other Spendings"
    And user verify static text "My top spendings for this month-"
    And user verify static text "Investment"
    And user verify static text "Home"

  @Validation @BudgetValidation
  Scenario: Verify Validation when User Edit Total Budget Income
    Given user clean up the app data for "9191787806 | 9191787806"
    And user login with user "9191787806 | 9191787806"
    And application launched successfully
    When user click on manage budget
    And user click by text "Create Budget"
    And user wait for "1000" milli second
    When user enter budget fund as "500000"
    And user click static text "Create Budget"
    And user click by text "Save & Continue"
    Then user verify partial static text "Available Funds"
    When user enter save and invest amount as "15000"
    And user click static text "Create Budget"
    And user click by text "Save & Continue"
    And user enter home rant amount as "20000"
    And user click static text "Create Budget"
    And user click by text "Save & Continue"
    And user enter for loan amount as "30000"
    And user click static text "Create Budget"
    And user click by text "Save & Continue"
    And user enter utility bills as "40000"
    And user click static text "Create Budget"
    When user click on I am done
    When user click by text contains "Budgeted Income"
    And user click on edit budget
    And user enter amount as "50000" for edit budget
    And user enter amount as "5000000000" for edit budget
    And user close update amount validation pop up
    Then verify validation error "Allowed limit is between 1 to 99,99,99,999"

  Scenario: User Edit Total Budget Income
    Given application launched successfully
    When user click on manage budget
    When user click by text contains "Budgeted Income"
    And user click on edit budget
    When user click on information icon in edit budget screen
    And user close update amount validation pop up
    And user enter amount as "600000" for edit budget
    When user clicks on Save Budget button