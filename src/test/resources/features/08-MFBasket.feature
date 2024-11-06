@Regression @MFBasketRegression
Feature: MutualFund Basket

  Scenario: Verify UI Elements of MF Basket Landing Screen
    Given user login with user "6123980123 | 6123980123"
    And application launched successfully
    And user scroll to top mutual fund basket section
    And user select one of the basket from basket list
    And user close gold promotion pop up
    And user verify static text "Preferred Tenure"
    And user verify static text "Risk Category"
    And user verify static text "Min. SIP"
    And user verify static text "Portfolio Performance"
    And user wait for "5000" milli second
    When user scroll to view Disclaimer
    And user click first scheme from scheme allocation
    And user wait for "4000" milli second
    Then user verify static text "Fund Performance"

  Scenario: Calculation of Returns of MF Basket Investment
    Given application launched successfully
    And user scroll to top mutual fund basket section
    And user select one of the basket from basket list
    And user close gold promotion pop up
    When user click by text "Calculate My Returns"
    And user select One Time radio button
    And user enter investment amount as "10000"
    And user click by text "3Y"
    Then user verify static text "Investment of ₹10,000 could be: "
    When user select Monthly SIP radio button
    When user enter investment amount as "8000"
    And user click by text "1Y"
    And user click on close icon in Returns Calculator
    And user click by text "Calculate My Returns"
    When user click by text "Done"
    Then user verify static text "Schemes Allocation"

  @Validation @MFBasketValidation
  Scenario: Validate of Goal creation for Mutual Fund Basket Investment
#    Given user login with user "6123980123 | 6123980123"
    Given application launched successfully
    And user click goals on dashboard
    And user delete existing goal
    And user scroll to top mutual fund basket section
    And user select one of the basket from basket list
    And user close gold promotion pop up
    When user click by text "Invest Now"
    And user click by text "Retirement"
    When user click by text "Continue"
    Then verify validation error "Amount is required"
    And verify validation error "Name is required"
    And verify validation error Amount is required in personal financial goal screen
    And verify validation error "This field is required"
    And user enter goal name in name of my goal input box as "RetirementGoal*"
    And user enter target goal amount as "50000"
    And user enter existing savings for this goal as "50001"
    And user enter number of years to achieve this goal as "1"
    When user click by text "Continue"
    Then verify validation error "Goal amount must be greater than savings"
    And verify validation error "Invalid characters in the name"
    And verify validation error "Year must be between 2 and 50"
    And user enter number of years to achieve this goal as "51"
    When user click by text "Continue"
    Then verify validation error "Year must be between 2 and 50"
    And user enter goal name in name of my goal input box as "RetirementGoal"
    And user enter target goal amount as "500000"
    And user enter existing savings for this goal as "50000"
    And user enter number of years to achieve this goal as "2"
    When user click by text "Continue"
    And user verify static text "At an expected return of 11.52% per annum"
    Then user verify static text "Invest ₹18,044.32 /month"
    And user verify static text "Invest ₹16,153.43 /month"
    And user verify static text "Option-2, without considering inflation"
    When user close investment needed for this goal screen
    Then user click by text "Continue"
    When user click by text "Continue to Invest"
    And user wait for "5000" milli second
    Then user go back from "FundCase" screen
    And user click static text "Create a New Financial Goal"
    Then user verify static text "Select Goal Category"

  @Validation @MFBasketValidation
  Scenario: user tries to create a goal with a name that already exist
    Given application launched successfully
    And user click goals on dashboard
    And user create a goal category named as "Retirement" with the goal name "RetirementGoal"
    And user scroll to top mutual fund basket section
    And user select one of the basket from basket list
    And user close gold promotion pop up
    When user click by text "Invest Now"
    And user click static text "Create a New Financial Goal"
    And user click by text contains "Retirement"
    And user enter goal name in name of my goal input box as "RetirementGoal"
    And user enter target goal amount as "50000"
    And user enter existing savings for this goal as "5000"
    And user enter number of years to achieve this goal as "2"
    When user click by text "Continue"
    And user click by text "Continue to Invest"
    And user wait for "10000" milli second
    Then verify validation error "Goal is already created with this name"
    And user go back from "Create Financial Goal" screen
    And user click existing goal to invest
    And user click by text "One-time / Lumpsum"
    And user enter MF basket invest amount lower than minimum amount
    And user click static text "I / We have read the related Scheme Document of the selected fund before investing"
    And user click by text "Review Funds"
    Then verify validation error Amount must be greater than or equal to min amount
    When user enter MF basket invest amount higher than minimum amount
    And user click by text "Review Funds"
    Then verify validation error "Amount must be less than or equal to ₹100.00Cr"

  @Smoke @MFBasketSmoke
  Scenario: One Time Investment in MF Basket
#    Given user login with user "6123980123 | 6123980123"
    Given application launched successfully
    And user click goals on dashboard
    And user create a goal category named as "Retirement" with the goal name "RetirementGoal"
    And user scroll to top mutual fund basket section
    And user select one of the basket from basket list
    And user close gold promotion pop up
    When user click by text "Invest Now"
    Then user click existing goal to invest
    And user click by text "One-time / Lumpsum"
    And user select amount from suggest amount tab
    And user click static text "I / We have read the related Scheme Document of the selected fund before investing"
    When user click by text "Review Funds"
    And user click by text "Pay Now"
    And user wait for "4000" milli second
    And user enter otp for purchase MF Scheme
    And user click by text "Confirm Order"
    And user do payment for MF basket
    And user wait for basket investment successful screen
    Then user verify static text "Order Submitted"
    And user verify partial static text "Units for this purchase will be allotted at"
    When user click static text "View Transaction History"
    Then user verify static text "History"

  @Validation @MFBasketValidation
  Scenario: Validate when the user enters investment details for a monthly SIP basket
    Given application launched successfully
    And user click goals on dashboard
    And user delete existing goal
    And user scroll to top mutual fund basket section
    And user select one of the basket from basket list
    And user close gold promotion pop up
    When user click by text "Invest Now"
    And user click by text "Retirement"
    And user enter goal name in name of my goal input box as "RetirementGoal"
    And user enter target goal amount as "1000000"
    And user enter existing savings for this goal as "60000"
    And user enter number of years to achieve this goal as "10"
    And user click by text "Continue"
    Then user click by text "Continue to Invest"
    And user wait for "2000" milli second
    And user click by text "Systematic Plan (SIP)"
    And user enter monthly MF basket investment amount lower than minimum amount
    When user click by text "Review Funds"
    Then verify validation error Amount must be greater than or equal to min amount
    And verify validation error "Date cannot be empty"
    And user verify partial static text "Minimum SIP duration is"
    And user verify static text "This field is required"
    And user enter monthly MF basket investment amount higher than minimum amount
    And user click by text "Review Funds"
    Then user verify static text "Amount must be less than or equal to ₹100.00Cr"

  @Validation @MFBasketValidation
  Scenario: Validation when the user enters investment details to invest using an existing goal
    Given application launched successfully
    And user scroll to top mutual fund basket section
    And user select one of the basket from basket list
    And user close gold promotion pop up
    When user click by text "Invest Now"
    And user click existing goal to invest
    And user click by text "Systematic Plan (SIP)"
    And user enter monthly MF basket investment amount lower than minimum amount
    And user click by text "Enter any other duration"
    And user enter investment duration as "1"
    And user click by text "Review Funds"
    Then verify validation error Amount must be greater than or equal to min amount
    And verify validation error "Date cannot be empty"
    And verify validation error "This field is required"
    And user enter monthly MF basket investment amount higher than minimum amount
    And user enter investment duration as "51"
    And user click by text "Review Funds"
    Then verify validation error "Amount must be less than or equal to ₹100.00Cr"
    Then verify validation error "Maximum year cannot exceed 20"

  @Smoke @MFBasketSmoke
  Scenario: Monthly Investment in MF Basket
    Given application launched successfully
    And user scroll to top mutual fund basket section
    And user select one of the basket from basket list
    And user close gold promotion pop up
    When user click by text "Invest Now"
    And user click existing goal to invest
    And user click by text "Systematic Plan (SIP)"
    And user select amount from suggest amount tab
    And user select first investment date
    And user select investment duration
    And user click static text "I / We have read the related Scheme Document of the selected fund before investing"
    And user click by text "Review Funds"
    And user click by text "Authorise Auto-Debit"
    And user enter otp for MF investment
    And user click by text "Confirm Order"
    And user do payment for MF basket
    And user wait for "3000" milli second
    Then user verify static text "SIP Created Successfully"

  @Validation @MFBasketValidation
  Scenario: Verify OTP Validation during Mutual Fund Basket Investment
    Given application launched successfully
    And user scroll to top mutual fund basket section
    And user select one of the basket from basket list
    And user close gold promotion pop up
    When user click by text "Invest Now"
    And user click existing goal to invest
    And user click by text "One-time / Lumpsum"
    And user select amount from suggest amount tab
    And user click static text "I / We have read the related Scheme Document of the selected fund before investing"
    And user click by text "Review Funds"
    And user click by text "Pay Now"
    When user enters invalid otp for purchase MF Scheme
    And user click by text "Confirm Order"
    Then user verify text "Invalid otp"
    And user wait for "4000" milli second
    When user click by text "Resend OTP"
    And user wait for "180000" milli second
    When user click by text "Resend OTP"
    And user wait for "500" milli second
    And user verify text "OTP has been sent to mobile and email."
    And user wait for "180000" milli second
    And user enter otp for purchase MF Scheme
    And user click by text "Confirm Order"
    Then user verify text "OTP is expired. Please click on resend OTP"

  Scenario: User Verify portfolio X-Ray of Basket
    And user scroll to top mutual fund basket section
    And user select one of the basket from basket list
    And user close gold promotion pop up
    When user click by text "Portfolio X-Ray"
    When user click by text "Debt Allocation"
    And user expand security allocation
    Then user verify static text "Security Allocation"
    When user click by text "Equity Allocation"
    And user expand sector allocation
    Then user verify static text "Sector Allocation"