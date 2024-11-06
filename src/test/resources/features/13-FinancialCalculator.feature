#@Regression @FinancialCalculatorRegression
Feature: Financial Planners Scenario

#  Income Tax Planner Calculator
  @Validation @FinancialCalculatorValidation
  Scenario: Verify Validation Form Inputs in the Income Section
    Given user login with user "9123123123 | 9123123123"
    And application launched successfully
    When user click income tax planner
    Then user verify partial static text "For FY 2023-2024"
    When user click by text "Plan My Income Tax"
    And user enter gross salary as "300000"
    And the user selects NO for the question Do you get rent from a residential property?
    When user click continue
    And user enter gross salary as "0"
    When user click continue
    Then user verify static text "Congratulations!"
    When user click on re calculator
    And user enter gross salary as "999999999"
    Then user verify value can not exceed then "9,99,99,999"
    And user enter gross salary as "100000"
    When user enter basic salary plus DA as "150000"
    Then verify validation error "Value cannot exceed gross salary"
    And user enter basic salary plus DA as "60000"
    And user click on information icon for salary
    And user verify static text " A gross salary is a gratuity and EPF (employee provident fund) subtracted from the cost to the company. Basic Salary, HRA, LTA and Special allowance are some of the most popular component of Gross Salary."
    And close gross salary screen
    And the user selects Yes for the question Do you get rent from a residential property?
    And the user selects Yes for the question Have you taken a home loan from this property?
    When  user enter rent received amount as "11000000"
    Then verify validation error "Value cannot exceed ₹1,00,00,000"
    And user enter property tax paid amount as "12000000"
    Then verify validation error "Value cannot exceed ₹10,00,000"
    And user scroll to any other income
    And user enter consulting income amount as "999999999"
    Then verify validation error "Value cannot exceed ₹9,99,99,999"
    And user enter any other income amount as "999999999"
    Then user verify partial static text "Value cannot exceed"

  @Validation @FinancialCalculatorValidation
  Scenario: Verify Validation Form Inputs in the HRA LTA Section
    Given application launched successfully
    When user click income tax planner
    And user click by text "Plan My Income Tax"
    And user enter gross salary as "7000000"
    And user enter basic salary plus DA as "3000000"
    And the user selects Yes for the question Do you get rent from a residential property?
    And the user selects Yes for the question Have you taken a home loan from this property?
    And user enter rent received amount as "500000"
    And user enter property tax paid amount as "200000"
    And user scroll to any other income
    And user enter consulting income amount as "200000"
    And user enter any other income amount as "100000"
    When user click continue
    And user click continue
    And the user selects Yes for the question Are you paying home rent?
    And the user selects Yes for the question Do you stay in a metro city?
    And user enter annual hra received amount as "10000000"
    And user verify partial text "Value cannot exceed gross salary"
    And user enter rent paid amount as "100000000"
    And user verify partial text "Value cannot exceed ₹1,00,00,000"
    And the user selects Yes for the question Are you claiming LTA?
    And user enter annual LTA received amount as "11111111"
    Then verify validation error "Value cannot exceed ₹17,50,000"
    And user enter travel coast amount as "11111111"

  @Validation @FinancialCalculatorValidation
  Scenario: Verify Validation Form Inputs in the Investments Section
    Given application launched successfully
    When user click income tax planner
    And user click by text "Plan My Income Tax"
    And user enter gross salary as "7000000"
    And user enter basic salary plus DA as "3000000"
    And the user selects NO for the question Do you get rent from a residential property?
    And user click continue
    And the user selects No for the question Are you paying home rent?
    And the user selects No for the question Do you stay in a metro city?
    And user click continue
    When user click continue
    Then user verify static text "Health Insurance for Family"
    And user go back from "Income Tax Planner" screen
    When user enter total PPf as "165000"
    Then user verify value can not exceed then "1,50,000"
    When user enter life insurance premium as "160000"
    Then user verify value can not exceed then "1,50,000"
    When user enter school tuition fees as "200000"
    When user enter self contribution to nps as "2000000"
    Then user verify value can not exceed then "2,00,000"
    When user enter corporate contribution to nps as "200000"
    Then user verify value can not exceed then "1,50,000"

  @Validation @FinancialCalculatorValidation
  Scenario: Verify Validation Form Inputs in the Medicals Section
    Given application launched successfully
    When user click income tax planner
    And user click by text "Plan My Income Tax"
    And user enter gross salary as "7000000"
    And user enter basic salary plus DA as "3000000"
    And the user selects NO for the question Do you get rent from a residential property?
    And user click continue
    And the user selects No for the question Are you paying home rent?
    And the user selects No for the question Do you stay in a metro city?
    And user click continue
    And  user click continue
    And the user selects Yes for the question Medical Insurance Premium for self & family
    And the user selects Yes for the question  Is any one of you aged above sixty years?
    And user enter Medical Insurance Premium for self and family as "900000"
    Then user verify validation for this amount "1,00,000"
    And the user selects Yes for the question Do you pay for medical insurance of parents?
    And the user selects Yes for the question Is any of the insured parent aged above sixty years?
    And user enter medical insurance premium for parents as "900000"
    Then user verify validation for this amount "1,00,000"

  @Validation @FinancialCalculatorValidation
  Scenario: Verify Validation Form Inputs in the Loans Section
    Given application launched successfully
    When user click income tax planner
    And user click by text "Plan My Income Tax"
    And user enter gross salary as "7000000"
    And user enter basic salary plus DA as "3000000"
    And the user selects NO for the question Do you get rent from a residential property?
    And user click continue
    And the user selects No for the question Are you paying home rent?
    And the user selects No for the question Do you stay in a metro city?
    And user click continue
    And  user click continue
    And the user selects No for the question Medical Insurance Premium for self & family
    And the user selects No for the question Do you pay for medical insurance of parents?
    And  user click continue
    And the user selects Yes for the question Do you have loan for self occupied home?
    And user enter annual interest for loan as "200001"
    And user enter annual principle on this loan as "155000"
    Then user verify validation for this amount "1,50,000"

  @Smoke @FinancialCalculatorSmoke
  Scenario: Verify User Calculate Income Tax
#    Given user login with user "9123123123 | 9123123123"
    Given application launched successfully
    When user click income tax planner
    And user click by text "Plan My Income Tax"
    And user enter gross salary as "3500000"
    And user enter basic salary plus DA as "1200000"
    And the user selects Yes for the question Do you get rent from a residential property?
    And the user selects Yes for the question Have you taken a home loan from this property?
    And user enter rent received amount as "2400000"
    And user enter property tax paid amount as "500000"
    And user click continue
    And the user selects Yes for the question Are you paying home rent?
    And the user selects Yes for the question Do you stay in a metro city?
    And user enter annual hra received amount as "1000000"
    And user enter rent paid amount as "800000"
    And the user selects Yes for the question Are you claiming LTA?
    And user enter annual LTA received amount as "600000"
    And user enter travel coast amount as "500000"
    And user click continue
    When user enter total PPf as "80000"
    When user enter life insurance premium as "100000"
    When user enter school tuition fees as "150000"
    When user enter self contribution to nps as "0"
    When user enter corporate contribution to nps as "200000"
    And user click continue
    And the user selects Yes for the question Medical Insurance Premium for self & family
    And the user selects Yes for the question  Is any one of you aged above sixty years?
    And user enter Medical Insurance Premium for self and family as "100000"
    And the user selects Yes for the question Do you pay for medical insurance of parents?
    And the user selects Yes for the question Is any of the insured parent aged above sixty years?
    And user enter medical insurance premium for parents as "100000"
    And user click continue
    And the user selects Yes for the question Do you have loan for self occupied home?
    And user enter annual interest for loan as "150000"
    And user enter annual principle on this loan as "100000"
    And user enter annual rented out as "1200000"
    And user click continue
    Then user verify static text " Old Regime Vs New Regime"
    When user click by text "View Detail"
    And the user click on tax payable
    Then user verify static text "Total Tax Payable"
    And user verify static text "₹3,69,720"
    And user verify static text "Income Tax"
    And user verify static text "₹3,55,500"
    And user verify static text "Education & Health Cess"
    And user verify static text "₹14,220"
    And user close income tax break up pop up
    When user click by text "New Regime"
    Then user verify text "Tax Payable : ₹6,93,784"
    And user scroll down to see exemption details
    And user click on exemption drop down
    Then user verify static text "Corporate NPS u/s 80CCD(2)"
    And user verify static text "₹1,20,000"
    And user verify static text "₹33,30,000"
    And user verify static text "₹13,50,000"
    When user click by text "Save Tax Now"
    Then user verify static text "Income Tax Planning"

#    Insurance Planner Calculator
  @Validation @FinancialCalculatorValidation
  Scenario: Verify Validation During Calculation Insurance Plan By Expense Method
    Given application launched successfully
    When user click insurance planner
    And user click by text "Expense Method"
    And user enter dependents current age as "25"
    And enter till "60" age to need financial support
    And user enter "30000" as a family's current annual expenses
    And user enter "22" to increase annual expenses
    When user click by text "Calculate"
    Then verify validation error "Enter 1L to 99Cr"
    Then verify validation error "Enter 5% to 20%"
    And user enter dependents current age as "70"
    And user enter "300000" as a family's current annual expenses
    And user enter "10" to increase annual expenses
    And user click by text "Calculate"
    Then user verify text "Expense Method"

  @Validation @FinancialCalculatorValidation
  Scenario: Verify user Calculate Insurance Plan By Expense Method
    Given application launched successfully
    When user click insurance planner
    And user click by text "Expense Method"
    And user enter dependents current age as "25"
    And enter till "80" age to need financial support
    And user enter "500000" as a family's current annual expenses
    And user enter "10" to increase annual expenses
    When user click by text "Calculate"
    Then user verify partial static text "You need Life Insurance with sum assured of"
    When user click by text "Illustration for income replacement"
    And user scroll down towards dependants age list
    When user click by text "Check Premium"
    Then user verify static text "Account Activation Pending"

  @Validation @FinancialCalculatorValidation
  Scenario: Verify Validation During Calculation Insurance Plan By Income Method
    Given application launched successfully
    When user click insurance planner
    And user wait for "2000" milli second
    And user enter my current age as "15"
    And user enter retirement age as "60" in life insurance planner screen
    And user enter "500000" as present annual income
    And user enter "25" as expected annual hike
    When user click by text "Calculate"
    Then verify validation error "Enter 18y to 70y"
    And verify validation error "Enter 5% to 20%"
    And user enter my current age as "70"
    And user enter retirement age as "69" in life insurance planner screen
    And user enter "50000" as present annual income
    And user enter "2" as expected annual hike
    When user click by text "Calculate"
    Then verify validation error "Retirement Age must be greater than Current Age"
    And verify validation error "Enter 5% to 20%"

  @Validation @FinancialCalculatorValidation
  Scenario: Verify Validation During Calculation Insurance Plan By Income Method
    Given user login with user "6978455386 | 6978455386"
    And application launched successfully
    When user click insurance planner
    And user wait for "2000" milli second
    And user enter my current age as "25"
    And user enter retirement age as "60" in life insurance planner screen
    And user enter "1000000" as present annual income
    And user enter "15" as expected annual hike
    When user click by text "Calculate"
    When user click by text "Check Premium"
    And user wait for "3000" milli second
    Then user verify static text "Term Insurance"

#    RD & SIP Maturity Calculator
  @Validation @FinancialCalculatorValidation
  Scenario: Verify Validation During Calculate SIP & RD Maturity
    Given application launched successfully
    When scroll to insurance planner
    And user click on RD and SIP maturity
    And user wait for "2000" milli second
    And user enter "500" as monthly SIP amount
    And user enter "1" as investment period
    And user enter "0" as annual rate of return for FD
    And user click by text "Yes"
    And user click by text "Calculate"
    Then verify validation error "Returns must be greater than 0."
    And verify validation error "Field is required."
    When  user enter annual step-up rate as "0"
    And user click by text "Calculate"
    Then verify validation error "Step-up must be greater than 0."

  @Smoke @FinancialCalculatorSmoke
  Scenario: Verify User Calculate SIP & RD Maturity
    Given application launched successfully
    When scroll to insurance planner
    And user click on RD and SIP maturity
    And user wait for "2000" milli second
    And user enter "2000" as monthly SIP amount
    And user enter "10" as investment period
    And user enter "12" as annual rate of return for FD
    And user click by text "Yes"
    When  user enter annual step-up rate as "10"
    And  user click by text "Calculate"
    Then user verify static text "Investment"
    And user verify static text "₹6,00,000"
    And user verify static text "₹10,87,163.13"

#    FD & Lumpsum Calculator
  @Validation @FinancialCalculatorValidation
  Scenario: Verify Validation During Calculate FD & Lumpsum
    Given application launched successfully
    When scroll to insurance planner
    And user click on maturity amount
    And user wait for "2000" milli second
    And user enter "500" as invested amount
    And user enter "0" as investment period
    And user enter "2" as annual rate of return
    And user click by text "Calculate"
    Then verify validation error "Period must be greater than 0"
    Then verify validation error "Returns must be greater than 2.5%"
    And user enter "10000" as invested amount
    And user enter "0" as investment period
    And user enter "30" as annual rate of return
    And user click by text "Calculate"
    Then verify validation error "Rate of Return cannot be more than 25%"
    Then verify validation error "Period must be greater than 0"

  @Smoke @FinancialCalculatorSmoke
  Scenario: Verify User Calculate FD & Lumpsum
    Given application launched successfully
    When scroll to insurance planner
    And user click on maturity amount
    And user wait for "2000" milli second
    And user enter "12000" as invested amount
    And user enter "05" as investment period
    And user enter "12" as annual rate of return
    And  user click by text "Calculate"
    Then user verify static text "Growth"
    And user verify static text "₹12,000"
    And user verify static text "₹9,148"

  @Validation @FinancialCalculatorValidation
#  Present Value Calculator
  Scenario: Verify Validation During Calculate Present Value
    Given application launched successfully
    When scroll to insurance planner
    And user click on present value
    And user wait for "2000" milli second
    And user enter "0" as future value
    And user enter "11" as time period
    And user enter "25" as annual rate of interest
    And user click by text "Calculate"
    Then verify validation error "Field is required."
    And user enter "500000" as future value
    And user enter "02" as time period
    And user enter "36" as annual rate of interest
    And user click by text "Calculate"
    Then verify validation error "Interest cannot be more than 30%"
    And user enter "500000" as future value
    And user enter "0" as time period
    And user enter "25" as annual rate of interest
    And user click by text "Calculate"
    Then verify validation error "Time Period must be greater than 0"
    When user enter "2.4" as annual rate of interest
    And user click by text "Calculate"
    Then verify validation error "Interest must be greater than 2.5%"

  @Smoke @FinancialCalculatorSmoke
  Scenario: Verify User Calculate Present Value
    Given application launched successfully
    When scroll to insurance planner
    And user click on present value
    And user wait for "2000" milli second
    And user enter "5000000" as future value
    And user enter "04" as time period
    And user enter "12" as annual rate of interest
    And  user click by text "Calculate"
    Then user verify static text "Interest"
    And user verify static text "Present Value"
    And user verify static text "₹18,22,410"
    And user verify static text "₹31,77,590"
#    And user verify static text "₹21,148"

  @Validation @FinancialCalculatorValidation
#  Future Value Calculator
  Scenario: Verify Validation During Calculate Future Value
    Given application launched successfully
    When scroll to insurance planner
    And user click on future value
    And user wait for "2000" milli second
    And user enter "0" as current value
    And user enter "11" as time period
    And user enter "25" as annual rate of inflation
    And user click by text "Calculate"
    Then verify validation error "Field is required."
    And user enter "500000" as current value
    And user enter "02" as time period
    And user enter "36" as annual rate of inflation
    And user click by text "Calculate"
    Then verify validation error "Rate of Inflation cannot be more than 25%"
    And user enter "500000" as current value
    And user enter "0" as time period
    And user enter "25" as annual rate of inflation
    And user click by text "Calculate"
    Then verify validation error "Period must be greater than 0"
    And user enter "2.4" as annual rate of inflation
    And user click by text "Calculate"
    Then verify validation error "Rate of Inflation must be greater than 2.5%"

  @Smoke @FinancialCalculatorSmoke
  Scenario: Verify User Calculate Present Value
    Given application launched successfully
    When scroll to insurance planner
    And user click on future value
    And user wait for "2000" milli second
    And user enter "5000000" as current value
    And user enter "04" as time period
    And user enter "12" as annual rate of inflation
    And  user click by text "Calculate"
    Then user verify static text "Inflation Impact"
    And user verify static text "₹50,00,000"
    And user verify static text "₹28,67,597"
