@Regression @FinancialPlanRegression
Feature: Financial Planner Scenario

  @Smoke @FinancialPlanSmoke
  Scenario: Financial Planning for a New User Without Dependents
    Given user login with new user
    And user click by text "I invest, but have not done any financial planning"
    And user click by text "Continue"
    When user click by text "I am yet to do my tax planning for the year"
    And user click by text "Continue"
    Then user click by text "I do not have any term insurance"
    And user click by text "Continue"
    When user click by text "Continue"
    Then user click do it later for sms permission
    When user click on review financial plan
    And user click by text "Start Planning"
    When user select date of birth for financial planning
    And user wait for "4000" milli second
    And user store date of birth
    And user click by text "60"
    And user click by text "Next"
    When user enter monthly net income as "60000" for financial plan
    And user enter monthly saving as "25000" for financial plan
    And user click by text "Next"
    And user click by text "I am single"
    And user select no dependant
    When user click by text "Next"
    And user wait for "9000" milli second
    And user click om view plan
    Then user verify static text "Emergency Funds"
    And user verify static text "Health Insurance"
    And user verify static text "Life Insurance"
    And user scroll down towards retirement
    And user wait for "2000" milli second
    And user unable to see educational fund and wedding fund
    When user click by text "Retirement Fund"
    And user wait for "5000" milli second
    Then user verify current age with retirement age

  @Smoke @FinancialPlanSmoke
  Scenario: Financial Planning for the Same User with Dependents
    And application launched successfully
    When user click on review financial plan
    When user click by text "Re-Plan"
    When user select date of birth for financial planning
    And user wait for "4000" milli second
    And user store date of birth
    And user click by text "65"
    And user click by text "Next"
    When user enter monthly net income as "70000" for financial plan
    And user enter monthly saving as "40000" for financial plan
    And user click by text "Next"
    And user select yes dependant
    And user click by text "2"
    Then user click by text "Next"
    And user enter child name as "Akasha"
    And enter child age as "12"
    And user click by text "Yes"
    And user select course as "Medicals"
    Then user click by text "Next"
    And user enter child name as "Srabani"
    And enter child age as "28"
    And user click by text "No"
    And  user click by text "Next"
    And user wait for "9000" milli second
    And user click om view plan
    And user scroll down towards retirement
    When user click by text "Education Fund"
    Then user verify static text "₹22,867 /mo "
    And user verify static text "₹16,975 /mo "
    And user verify partial text "Annual growth of 12%"

  @Validation @FinancialPlanValidation
  Scenario: Verify Validation When User Enters Saving Amount Greater Than Income Amount
#    Given user login with user "9708794658 | 9708794658"
    Given application launched successfully
    When user click on review financial plan
    When user click by text "Re-Plan"
    And user click by text "Next"
    When user enter monthly net income as "45000" for financial plan
    And user enter monthly saving as "9500" for financial plan
    And user click by text "Next"
    Then verify validation error "Amount has to be greater than 10,000"
    When user enter monthly net income as "55000" for financial plan
    And user enter monthly saving as "56000" for financial plan
    And user click by text "Next"
    Then user verify static text "Savings should be less than income"

  @Validation @FinancialPlanValidation
  Scenario: Verify Validation When User Enters Dependent's Date of Birth Over 28 Years
    Given application launched successfully
    When user click on review financial plan
    When user click by text "Re-Plan"
    And user click by text "Next"
    And user click by text "Next"
    And user select yes dependant
    And user click by text "1"
    And user click by text "Next"
    And user enter child name as "Akasha1"
    And enter child age as "29"
    And user click by text "Next"
    Then verify validation error "Invalid characters in the name"
    And user verify static text "Maximum age is 28"

  Scenario: User save emergency fund
    Given application launched successfully
    When user click on review financial plan
    And user click by text "View Plan"
    And user wait for "4000" milli second
    And user click by text "Emergency Funds"
    Then user click by text "Save this Goal"
    And user enter emergency fund goal name as "Emergency Fund"
    And user click by text "Save Now"
    Then user verify emergency goal has saved

  Scenario: User save retirement fund
    Given application launched successfully
    When user click on review financial plan
    And user click by text "View Plan"
    And user scroll down towards retirement
    And user click by text "Retirement Fund"
    And user wait for "3000" milli second
    Then user click by text "Save this Goal"
    And user enter retirement fund goal name as "Retirement Fund"
    And user click by text "Save Now"
    Then user verify retirement goal has save

  @Smoke @FinancialPlanSmoke
  Scenario: User save education fund
    Given application launched successfully
    When user click on review financial plan
    And user click by text "View Plan"
    And user scroll down towards retirement
    And user click by text "Education Fund"
    Then user click by text "Save this Goal"
    And user enter educational fund goal name as "Education Fund"
    And user click by text "Save Now"
    Then user verify educational goal has saved

  Scenario: User save wedding fund
    Given application launched successfully
    When user click on review financial plan
    And user click by text "View Plan"
    And user scroll down towards retirement
    And user scroll to weeding fund card
    And user click on weeding fund
    Then user click by text "Save this Goal"
    And user enter wedding fund goal name as "Wedding Fund"
    And user click by text "Save Now"
    Then user verify wedding goal has saved

  @Smoke @FinancialPlanSmoke
  Scenario: User update education goal
    Given application launched successfully
    When user click goals on dashboard
    And user change education goal amount
    And user go back from "Financial Goals" screen
    When user click on review financial plan
    And user click by text "View Plan"
    And user scroll down towards retirement
    And user store education fund amount
    And user click by text "Education Fund"
    Then user click by text "Save this Goal"
    And user click by text "Education Fund"
    When user click by text "Update Existing Goal"
    And user wait for "6000" milli second
    Then user go back from "Financial Planning" screen
    And user click goals on dashboard
    Then user verify education fund has update
    Then user verify static text "Education Fund"

  Scenario: User delete education goal and check in plan Summary screen
    Given application launched successfully
    When user click goals on dashboard
    And user delete educational fund goal
    And user go back from "Financial Goals" screen
    When user click on review financial plan
    And user click by text "View Plan"
    And user scroll down towards retirement
    Then user verify education fund has un saved

  Scenario: User create a new goal for wedding
    Given application launched successfully
    When user click on review financial plan
    And user click by text "View Plan"
    And user scroll down towards retirement
    And user click by text "Wedding Fund"
    Then user click by text "Save this Goal"
    And user click by text "Create a new Goal"
    And user enter a gaol name for save financial goal
    And user click by text "Save Now"
    And user wait for "6000" milli second
    Then user verify partial static text "For"

  @Smoke @FinancialPlanSmoke
  Scenario: Financial Planning for a KYC-Verified and Married User
    Given user login with user "9434534846 | 9434534846"
    And application launched successfully
    When user click on review financial plan
    And user click by text "Re-Plan"
    And user click by text "58"
    And  user click by text "Next"
    When user enter monthly net income as "80000" for financial plan
    And user enter monthly saving as "30000" for financial plan
    And user click by text "Next"
    And user enter spouse age as "25"
    And user select no dependant
    And user click by text "Next"
    And user wait for "9000" milli second
    And user click om view plan
    When user click by text "Life Insurance"
    Then user verify partial text "Life Insurance"
    And user go back from "Life Insurance" screen
    And user click by text "Re-Plan"
    And user click by text "Next"
    And user enter monthly net income as "90000" for financial plan
    And user enter monthly saving as "35000" for financial plan
    And user click by text "Next"
    And user enter spouse age as "25"
    And user select yes dependant
    And user click by text "1"
    Then user click by text "Next"
    And user enter child name as "Shrabani"
    And enter child age as "5"
    And user click by text "Yes"
    And user select course as "Engineering"
    Then user click by text "Next"
    And user wait for "9000" milli second
    And user click om view plan
    And user scroll down towards retirement
    When user click by text "Wedding Fund"
    Then user verify text "₹2,255 /mo "
    And user verify static text "₹1,125 /mo "
    And user verify partial static text "Annual growth of 14%"
