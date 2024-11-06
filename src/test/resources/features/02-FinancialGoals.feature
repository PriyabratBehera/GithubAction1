#@Regression @FinancialGoalRegression
Feature: Set Goals Scenarios

  @Validation @FinancialValidation
  Scenario: Verify Validation Error During Goal Creation
    Given user clean up the app data for "9191787806 | 9191787806"
    And user login with user "9191787806 | 9191787806"
    When application launched successfully
    Then user click on set your financial goal
    When user click by text "Retirement"
    And user click by text "Yes"
    And user enter "02" year to achieve goal
    And user enter "5" as rate of return
    When user click by text "Show the Plan"
    Then verify validation error "Field is required."
    When user enter goal amount as "200000"
    And user enter "0" year to achieve goal
    And user click existing fund as No
    And user click by text "Show the Plan"
    Then verify validation error "Years must be greater than 0"
    When user enter goal amount as "200000"
    And user enter "03" year to achieve goal
    And user enter "1" as rate of return
    And user click by text "Show the Plan"
    Then verify validation error "Returns must be greater than 2.5%"
    When user go back from "Set Financial Goals" screen
    And user click by text "Retirement"
    And user enter goal amount as "500000"
    And user enter "02" year to achieve goal
    And user enter "35" as rate of return
    And user click existing fund as Yes
    And user enter existing goal amount as "600000"
    When user click by text "Show the Plan"
    Then verify validation error "Rate of Return cannot be more than 30%"
    And verify validation error "Goal must be greater than savings."

  Scenario: Verify Suggested Investment Plan while Creating a Goal
    Given application launched successfully
    When user click on set your financial goal
    And user click by text "Car"
    Then user enter goal amount as "500000"
    And user click by text "Yes"
    And user enter "02" year to achieve goal
    And user enter "10" as rate of return
    And user click existing fund as Yes
    And user enter existing goal amount as "10000"
    And user click by text "Show the Plan"
    Then user verify static text "₹5,51,250"
    And user verify static text "(Inflation adjusted at 5% per annum)"
    Then user verify static text "2 years"
    And user verify static text "10.00%"
    And user verify static text "₹10,000"
    And user verify static text "Start a monthly SIP of ₹20,217 for 2 years"
    And user verify static text "Start a monthly SIP of ₹19,301 and increase this by 10% every year"
    And user verify static text "Invest ₹4,45,578 today and remain invested for 2 years"

  @Validation @FinancialValidation
  Scenario: Verify Validation While Create a Name for a Goal
    Given application launched successfully
    When user click on set your financial goal
    And user click by text "Property"
    And user enter goal amount as "500000"
    And user click by text "Yes"
    And user enter "02" year to achieve goal
    And user enter "10" as rate of return
    And user click existing fund as No
    And user click by text "Show the Plan"
    And user click by text "Save this Goal"
    When user enter goal name as "Re"
    Then verify validation error "Goal Name must be greater than 3 characters"
    When user enter goal name as "liquid*"
    Then user verify static text "Goal Name should not have special characters"

  @Smoke @FinancialSmoke
  Scenario: Create a Financial Goal
    Given user clean up the app data for "9191787806 | 9191787806"
#    And user login with user "9191787806 | 9191787806"
    When application launched successfully
    When user click on set your financial goal
    And user click by text "Education"
    And user enter goal amount as "1000000"
    And user click by text "Yes"
    And user enter "02" year to achieve goal
    And user enter "10" as rate of return
    And user click existing fund as No
    And user click by text "Show the Plan"
    And user click by text "Save this Goal"
    When user enter goal name as "Education Goal 1"
    Then user click by text "Save Now"
    And user verify static text "Congratulations!"
    And user verify static text "Education Goal 1 Education"
    And user verify static text "for ₹10,00,000 in 2 years"
    When user click by text "Suggested Investments"
    Then user verify static text "FundCase"

  @Smoke @FinancialSmoke
  Scenario: User Change the Goal Type and Goal Amount
    Given application launched successfully
    When user click goals on dashboard
    And user create a goal category named as "Education" with the goal name "Education Goal 1"
    And user click goals on dashboard
    Then user click by text contains "Education Goal 1"
    And user click on edit icon
    And user click by text "Re-Plan"
    And user enter goal amount as "2500000"
    And user enter "03" year to achieve goal
    And user enter "10" as rate of return
    And user click existing fund as No
    And user click by text "Edit"
    And user click by text "Save this Goal"
    And user click on goals category in while edit goal
    When user click by text "Property"
    Then user enter goal name as "Dream House"
    And user click by text "Save Now"
    Then user verify static text "Dream House Property"
    And user verify static text "for ₹25,00,000 in 3 years"
    When user click static text "View My Goals"
    Then user verify partial text "Dream House"

  @Validation @FinancialValidation
  Scenario: Verify User Start Investment Using Without KYC User
    Given application launched successfully
    When user click goals on dashboard
    Then user click by text "Add New Goal"
    And user click by text "Education"
    And user enter goal amount as "1000000"
    And user click by text "Yes"
    And user enter "02" year to achieve goal
    And user enter "10" as rate of return
    And user click existing fund as No
    And user click by text "Show the Plan"
    And user click by text "Save this Goal"
    When user enter goal name as "Vacation G"
    Then user click by text "Save Now"
    And user click static text "View My Goals"
    And user click by text contains "Vacation G"
    When user click by text "Start Investment Now"
    Then user verify static text "Investor KYC"
    And user verify static text "Complete your account setup before start investing"
    When user clicks on Cancel button
    Then user verify text "Start Investment Now"
    When user click by text "Start Investment Now"
    And user clicks on continue button
    Then user verify static text "KYC"
    And user verify static text "Onboarding Process:"

  @Smoke @FinancialSmoke
  Scenario: Verify Start Investment Now Link is Functional with Completed KYC User
    Given user login with user "6978455386 | 6978455386"
    When application launched successfully
    Then user click goals on dashboard
    And user create a goal category named as "Bike" with the goal name "Bike Goal"
    And user click goals on dashboard
    And user click by text contains "Bike Goal"
    When user click on Start Investment Now
    Then user verify text "Choose what you want to do"
    When user click by text "Mutual Funds"
    Then user verify static text "Mutual Funds"
    And user go back from "Mutual Funds" screen
    And user wait for "2000" milli second
    And user click goals on dashboard
    And user click by text contains "Bike Goal"
    When user click on Start Investment Now
    When user click by text "Gold & Silver"
    And user close gold promotion pop up
    Then user verify static text "Digital Gold & Silver"
    And user go back from "Digital Gold" screen
    And user wait for "2000" milli second
    And user click goals on dashboard
    And user click by text contains "Bike Goal"
    When user click on Start Investment Now
    When user click by text "NPS"
    Then user verify static text "Tax Benefits on NPS"

  Scenario: Verify the Goal Which is Invested in Digital Gold
    Given application launched successfully
    And user click goals on dashboard
    And user click by text contains "Aquafina"
    And user click by text "Gold"
    Then user verify partial static text "24K Gold"
    And user verify partial static text "Current"
    And user verify partial static text "Invested"
    When user clicks on ellipsis against "24K Gold • 0 SIP"
    Then user verify static text "24K Digital Gold"

  Scenario: Verify the Goal which is Invested in Mutual Fund
    Given application launched successfully
    And user click goals on dashboard
    And user click by text contains "Property Goal"
    Then user verify static text "Aditya Birla Sun Life Infrastructure Fund Regular-Growth"
    And user verify partial static text "Current"
    And user verify partial static text "Invested"

  Scenario: Verify the UI of the Completed tab in Financial Goal Screen
    Given application launched successfully
    And user click goals on dashboard
    When user click by text contains "Completed"
    Then user verify congratulations banner
    And user verify partial text "Mobile g"
    When user click by text "Add New Goal"
    Then user verify static text "Select Goal Category"

  @Validation @FinancialValidation
  Scenario:Verify Validation When User Create a Goal Which is Already Exists
    Given application launched successfully
    Then user click goals on dashboard
    And user create a goal category named as "Bike" with the goal name "Bike Goal"
    Then user click on set your financial goal
    Then user click by text contains "Bike"
    And user enter goal amount as "500000"
    And user click by text "Yes"
    And user enter "02" year to achieve goal
    And user enter "10" as rate of return
    When user click existing fund as No
    Then user click by text "Show the Plan"
    And user click by text "Save this Goal"
    When user enter goal name as "Bike Goal"
    And user click by text "Save Now"
    Then user verify static text "Goal is already created with this name"

  Scenario: User Delete an Exciting Financial Goal
    Given application launched successfully
    When user click goals on dashboard
    And user create a goal category named as "Bike" with the goal name "Bike Goal"
    When user click goals on dashboard
    Then user check there is any goal which name as other goal
    And user click by text "Add New Goal"
    And user click by text "Education"
    And user enter goal amount as "1000000"
    And user click by text "Yes"
    And user enter "02" year to achieve goal
    And user enter "10" as rate of return
    When user click existing fund as No
    Then user click by text "Show the Plan"
    And user click by text "Save this Goal"
    When user enter goal name as "Other Goal"
    Then user click by text "Save Now"
    When user click static text "View My Goals"
    Then user click by text contains "Other Goal"
    And user click on edit icon
    When user click on delete icon
    Then user click on yes button
    And user wait for "2000" milli second
    Then user verify static text "Financial Goals"
