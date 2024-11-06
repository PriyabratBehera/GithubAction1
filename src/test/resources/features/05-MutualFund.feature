@Regression @MutualFundRegression
Feature: Mutual Funds Scenarios

  @validation @MutualFundValidation
  Scenario: User cannot invest without completing KYC
    Given user login with user "9900123123 | 9900123124"
    And application launched successfully
    When user clicks on Mutual Funds
    And user click by text contains "Create MF"
    And user search for mutual fund "aditya infra"
    And user click Add to Cart for Aditya Birla
    When user clicks on complete KYC
    And user go back from "KYC" screen
    And user go back from "Mutual Fund Schemes" screen
    When user click by text "Invest One Time"
    And user click by text "Invest"
    When user clicks on complete KYC
    And user go back from "KYC" screen
    And user go back from "Mutual Fund Schemes" screen
    When user click by text "Start SIP"
    And user click by text "Select"
    Then user clicks on complete KYC

  Scenario: User filters mutual fund schemes
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "Invest One Time"
    When user click by text "Categories"
    When user search for scheme category as "mid"
    And user click by text "Mid Cap"
    And user click by text "Apply Filters"
    And user click by text "AMC"
    And user click by text "Aditya Birla Mutual Fund"
    And user click by text "Apply Filters"
    Then user verify static text "Mid Cap Fund"
    When user click by text "Categories"
    And user click by text "Clear"
    And user click by text "AMC"
    And user wait for "2000" milli second
    And user click by text "Clear"
    When user click by text "Categories"
    And user click by text "Debt"
    And user click by text "Low Duration"
    And user click by text "Apply Filters"
    Then user verify static text "Low Duration Fund"
    And user click by text "AMC"
    And user wait for "2000" milli second
    And user click by text "Aditya Birla Mutual Fund"
    And user click by text "Apply Filters"
    Then user verify static text "No Record Found"
    When user search for mutual fund "Hdfc large cap"
    Then user verify static text "Large Cap Fund"

  Scenario: User Verify UI of Fund Details Screen
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "Invest One Time"
    And user search for mutual fund "Aditya psu"
    When user click by text "Aditya Birla Sun Life PSU Equity Fund Regular-Growth"
    Then user verify static text "NAV"
    When user click bar graph button
    Then user not able to see category avg
    And user click line graph button
    And user verify static text "CAGR"
    And user click by text "1Y"
    When user click by text "View More"
    And user click by text "Sectors"
    Then user verify partial static text "Number"
    When user click by text "Stocks Holding"
    Then user verify static text "Large Cap"
    And user go back from "Scheme Portfolio" screen
    And user scroll to view basic information
    And user verify static text "One-time"
    And user verify static text "Systematic (SIP)"
    When user click on view more in fund details screen
    Then user verify static text "Fund Manager"
    And user verify static text "ISIN"
    And user go back from "Basic Information" screen
    When user scroll to data source
    Then user verify static text "Lock-in"
    And user verify static text "Expense Ratio"
    When user click by text "Calculate"
    Then user click by text "Done"
    When user click by text "Invest"
    Then user verify static text "Mode of Investment"

  @validation @MutualFundValidation
  Scenario: Verify Validation Error for Monthly Investment
    Given user login with user "8524282828 | 8524282828"
    And application launched successfully
    And user clicks on Mutual Funds
    And user click by text "Invest One Time"
    And user search for mutual fund "Aditya infra"
    And user wait for "4000" milli second
    And user click by text "Invest"
    And user click by text "Systematic Plan (SIP)"
    And user selects monthly SIP date as "2"
    And user enters SIP Duration as "10"
    And user enters invest amount for monthly SIP "540"
    And user scroll to view Calculate
    And user selects Goal "MF Goal 001"
    And user wait for "3000" milli second
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    And user click by text "Create SIP"
    And user scroll to SIP amount box
    Then verify validation error "Min duration should be 12"
    And verify validation error "Min SIP amount should be ₹1,000"
    And user enters SIP Duration as "241"
    And user enters invest amount for monthly SIP "1999999999"
    And user click by text "Create SIP"
    And verify validation error "Amount should not exceed ₹100.00Cr"

  @validation @MutualFundValidation
  Scenario: Verify Validation Error for One-Time Investment
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "Start SIP"
    And user search for mutual fund "Aditya infra"
    And user click Select Button on MutualFund scheme
    When user click by text "One-time / Lumpsum"
    And user enters invest amount for One Time "500"
    And user selects Financial Goal "MF Goal 001"
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    And user click by text "Pay Now"
    Then verify validation error "Min amount should be ₹1,000"
    And user enters invest amount for One Time "110000000"
    And user click by text "Pay Now"
    Then verify validation error "Amount should not exceed ₹10.00Cr"

  @Smoke @MutualFundSmoke
  Scenario: Invest One-Time in Mutual Funds schemes
#    Given user login with user "8524282828 | 8524282828"
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "Invest One Time"
    And user search for mutual fund "Aditya infra"
    And user click by text "Invest"
    And user enters invest amount for One Time "5010"
    And user selects Financial Goal "MF Goal 001"
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    And user click by text "Pay Now"
    And user select bank for MF buy or sip
    And user enter otp for purchase MF Scheme
    And user click by text "Confirm Order"
    And user do payment for mutualFund investment
    And user wait for MF purchase successful page
    And user verify static text "Order Submitted"
    And user verify partial static text "Units for this purchase will be allotted at"
    And user verify static text "If purchase is rejected by AMC, refund will be processed in your source account by the AMC"
    When user click static text "View Transaction History"
    And user verify "Buy" transaction history
    Then user verify partial text "₹5,010.00"

  Scenario: Make a Payment failed for invest in Mutual Fund schemes
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "Invest One Time"
    And user search for mutual fund "Aditya infra"
    And user click by text "Invest"
    And user enters invest amount for One Time "10001"
    And user selects Financial Goal "MF Goal 001"
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    And user click by text "Pay Now"
    And user select bank for MF buy or sip
    And user enter otp for purchase MF Scheme
    And user click by text "Confirm Order"
    And user do payment fail for mutualFund investment
    And user wait for MF purchase failed screen
    And user verify static text "Transaction Failed"
    And user verify partial static text "If amount has been debited from your"
    Then user click by text "Home"
    And user verify static text "Mutual Funds"

  @Validation @MutualFundValidation
  Scenario: Verify User Cannot Select Scheme Not Allowed for One-Time Purchase and SIP
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "Invest One Time"
    And user search for mutual fund "Hdfc defence"
    And user click by text "Invest"
    Then user verify partial static text "Purchase in this scheme"
    And user close purchase not allow pop uo
    And user click by text "Systematic Plan (SIP)"
    When user click by text "Create SIP"
    Then verify validation error "Field is required"
    And user go back from "Invest in Mutual Fund" screen
    And user go back from "Mutual Fund Schemes" screen
    And user click by text contains "Create MF"
    And user search for mutual fund "Hdfc defence"
    And user click by text "Add to Cart"
    And user click Add to Cart icon in Mutual Fund schemes screen
    Then verify validation error "One-Time not allowed. Kindly remove this scheme"
    And user remove all Schemes from One Click Invest screen

  @Validation @MutualFundValidation
  Scenario: Verify Validation Error for OTP during Investment
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "Invest One Time"
    And user search for mutual fund "Aditya infra"
    And user click by text "Invest"
    And user enter investment amount "5000"
    And user selects Goal "MF Goal 001"
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    And user click by text "Pay Now"
    And user click by text contains "FDRL"
    When user enters invalid otp for purchase MF Scheme
    And user click by text "Confirm Order"
    Then user verify text "Invalid otp"
    When user click by text "Resend OTP"
    And user wait for "180000" milli second
    When user click by text "Resend OTP"
    And user verify text "OTP has been sent to mobile and email."
    And user wait for "180000" milli second
    And user enter otp for purchase MF Scheme
    And user click by text "Confirm Order"
    Then user verify text "OTP is expired. Please click on resend OTP"

  @Smoke @MutualFundSmoke
  Scenario: User Invests in Mutual Fund via SIP
    Given application launched successfully
    And user clicks on Mutual Funds
    And  user click by text "Start SIP"
    And user search for mutual fund "Aditya infra"
    And user click Select Button on MutualFund scheme
    And user selects monthly SIP date as "3"
    And user enters SIP Duration as "15"
    And user select SIP Duration as "3 years" from Recommended Duration Box
    And user enters invest amount for monthly SIP "33000"
    And user scroll to view Calculate
    And user selects Goal "MF Goal 001"
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    And user click by text "Create SIP"
    And user select bank for MF buy or sip
    And user wait for "2000" milli second
    And user enter otp for purchase MF Scheme
    When user click by text "Confirm Order"
    And user do payment for mutualFund investment
    And user wait for MF SIP successful page
    Then user verify static text "SIP Created Successfully"
    And user verify partial static text "Your SIP will start"
    When user click static text "View SIPs"
    And user wait for "4000" milli second
    Then user verify SIP transaction amount as "₹33,000"
    And user verify frequency as "Monthly"

  @Validation @MutualFundValidation
  Scenario: verify user can't add more than four Mutual Fund schemes in a basket
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text contains "Create MF"
    And user search for mutual fund "Aditya"
    When user click Add to Cart for Aditya Birla
    And user close the fund card in one click invest screen
    And user go back from "Mutual Fund Schemes" screen
    And user click by text contains "Create MF"
    And user click Add to Cart for different schemes
    Then user verify partial static text "You can add only 4 schemes"
    And user verify static text "Continue to invest in selected schemes"
    Then user clicks on Cancel button
    And user verify static text "Mutual Fund Schemes"
    And user click Add to Cart
    And user clicks on continue button
    And user verify static text "One-Click Invest"
    And user go back from "One-Click Invest" screen
    And user click by text "Review & Confirm Investment"
    And user verify static text "One-Click Invest"
    And user remove all Schemes from One Click Invest screen

  Scenario: Create MF Baskets Link is Functional for One Time and SIP
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text contains "Create MF"
    And user click Add to Cart icon in Mutual Fund schemes screen
    And user remove all Schemes from One Click Invest screen
    And user search for mutual fund "Aditya infra"
    When user click Add to Cart
    And user click Add to Cart icon in Mutual Fund schemes screen
    And user enter monthly sip amount as "500" for Aditya Birla Sun Life Forntline Equity Fund
    And user click by text "Continue"
    Then verify validation error "Min Initial Investment ₹1,000"
    And user remove all Schemes from One Click Invest screen
    When user click Add to Cart
    And user click by text "Review & Confirm Investment"
    And user select "Choose minimum amount for all schemes" check box
    And user click by text "Continue"
    And user selects Financial Goal "MF Goal 001"
    And user click by text contains "I / We have read the related Scheme Document"
    When user click by text "Pay Now"
    And user click by text contains "FDRL"
    And user wait for "3000" milli second
    And user go back from "OTP Verification" screen
    And user go back from "One-Click Invest" screen
    And user click by text "Systematic Plan (SIP)"
    And user enter monthly sip amount as "500" for Aditya Birla Sun Life Forntline Equity Fund
    When user click by text "Continue"
    Then verify validation error "Min SIP Amount ₹1,000"
    And user select "Choose minimum amount for all schemes" check box
    And user verify static text "Total SIP Amount"
    And user click by text "Continue"
    And user selects monthly SIP date as "1"
    And user enters SIP Duration as "12"
    And user selects Financial Goal "MF Goal 001"
    And user click by text contains "I / We have read the related Scheme Document"

  Scenario:Verify Functionality of "View All" Link in Mutual Funds Screen
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View All"
    And user verify static text "Market Capitalization"
    And user click by text contains "Large Cap"
    And user wait for "3000" milli second
    And user verify static text "Large Cap"
    And user verify static text "Funds that invest primarily in the top 100 companies which are more stable"
    And user go back from "Investment Ideas" screen
    And user scroll to value oriented
    And user verify static text "Focused"
    And user click by text "Debt"
    And user click by text contains "Banking & PSU"
    And user verify static text "Banking & PSU"
    And user verify static text "Invests in debt instruments of banks, PSU and public financial institutions"
    And user go back from "Investment Ideas" screen
    And user scroll to others
    And user verify static text "Floater"
    And user click by text "Hybrid"
    And user verify static text "Diversified Asset Class"
    And user click by text contains "Dynamic Asset Allocation"
    And user verify static text "Dynamic Asset Allocation"
    And user verify static text "Allocation between debt and stocks can vary as per market conditions"
    And user go back from "Investment Ideas" screen
    And user click by text "Other"
    And user verify static text "Other Funds"
    And user click by text contains "Index Funds"
    And user verify static text "Index Funds"
    And user verify static text "Portfolio mimics a given index so the expected returns are similar to index"

  Scenario:verify funds categories in mutual fund schemes
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text contains "Large"
    And user verify static text "Large Cap"
    And user verify static text "Funds that invest primarily in the top 100 companies which are more stable"
    And user go back from "Investment Ideas" screen
    And user click by text contains "Mid"
    And user verify static text "Mid Cap"
    And user verify static text "Funds that invest in the mid-sized companies with potential for high growth"
    And user go back from "Investment Ideas" screen
    And user click by text contains "Small"
    And user verify static text "Small Cap"
    And user verify static text "Suitable for long term, 7+ years. Carries high risk with potential for high return"
    And user go back from "Investment Ideas" screen
    And user click by text contains "Flexi"
    And user verify static text "Flexi Cap"
    And user verify static text "Invests in any company regardless of size, flexible investment strategy"
    And user go back from "Investment Ideas" screen
    And user click by text contains "Equity"
    And user verify static text "Market Capitalization"
    And user click by text contains "Debt"
    And user verify partial static text "Better than FD"
    And user click by text contains "Hybrid"
    And user verify static text "Diversified Asset Class"
    And user go back from "Investment Ideas" screen
    And user click by text contains "Tax Saver"
    And user verify static text "Tax Saver"

  Scenario: Verify "History" link is functional
    Given application launched successfully
    And user clicks on Mutual Funds
    When user click by text "History"
    And user click by text "Filter By"
    And user click by text "In Process"
    And user click by text "Type"
    And user click by text "switch_in"
    And user click by text "AMC"
    And user click by text "Aditya Birla"
    And user click by text "Apply Filters"
    And user click on in Process transaction view
    Then user verify partial text "Switch In"
    And user verify static text "Transaction under process"
    And user click by text "Filter By"
    And user click by text "Successful"
    And user click by text "Type"
    And user click by text "switch_out"
    And user click by text "Goals"
    And user click by text "MF Goal 001"
    And user click by text "Folio"
    And user click by text "Aditya JWI0ZY77ETN07"
    And user click by text "Apply Filters"
    Then user verify partial text "Switch Out"
    Then user verify partial text "Folio"
    And user click by text "Filter By"
    And user wait for "2000" milli second
    And user click by text "Clear"
    And user click by text "Filter By"
    And user click by text "Failed"
    And user click by text "Type"
    And user click by text "SWP"
    And user click by text "Apply Filters"
    Then user verify static text " No Transaction History found"

  Scenario: verify Manage SIP is functional
    Given application launched successfully
    And user clicks on Mutual Funds
    When user click by text "Manage SIP"
    And user verify partial static text "SIP Amount"
    When user click three dot icon in My SIP Screen
    When user click by text "Transaction History"
    And user verify static text "Goal"
    And user verify static text "Created on"
    And user verify partial static text "Successful"
    And user verify partial static text "Failed / Skipped"
    And user go back from "SIP Transaction History" screen
    And user wait for "2000" milli second
    And user click three dot icon in My SIP Screen
    When user verify text "Skip Next Installment"
    And user click by text "Stop SIP"
    And user click by text "Short of funds"
    And user click by text "Submit"
    And user click by text "I agree that this SIP will be permanently stopped and I can’t undo this action"
    And user click by text "Submit"
#    Then user verify static text "your SIP has been Stopped"

  @Smoke @MutualFundSmoke
  Scenario: User sell partial funds
    And application launched successfully
    When user clicks on Mutual Funds
    Then user click by text "View Portfolio"
    And user click by text contains "MF Goal 001"
    And user click on three dot icon in wealth screen
    And user click by text "Sell"
    And user click by text "Partial Funds"
    And user wait for "3000" milli second
    When user enter partial funds amount as "50"
    And user click by text "Continue to OTP Confirmation"
    And user wait for "2000" milli second
    And user enter otp for redeem partial funds
    And user click by text "Confirm Order"
    Then user verify static text "Order Submitted"
    When user click by text "View Transaction History"
    Then user verify "Sell" transaction history
    And user verify static text "₹50.00"

  Scenario: Verify Functionality of "Transaction History" in MF wealth Screen
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Portfolio"
    And user click by text contains "MF Goal 001"
    And user click on three dot icon in wealth screen
    When user click by text "Transaction History"
    Then user verify static text "Goal"
    And user verify partial static text "Folio"
    And user verify static text "Amount"

  @Smoke @MutualFundSmoke
  Scenario: Additional Investment Functionality
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Portfolio"
    And user click by text contains "MF Goal 001"
    And user click on three dot icon in wealth screen
    And user click by text contains "Invest More"
    And user select amount from suggest amount tab
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    And user click by text "Pay Now"
    And user select bank for MF buy or sip
    And user wait for "3000" milli second
    And user enter otp for purchase MF Scheme
    And user click by text "Confirm Order"
    And user do payment for mutualFund investment
    And user wait for MF purchase successful page
    And user verify static text "Order Submitted"

  @Smoke @MutualFundSmoke
  Scenario: Additional SIP Functionality
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Portfolio"
    And user click by text contains "MF Goal 001"
    And user click on three dot icon in wealth screen
    When user click by text "Systematic Investment Plan"
    And user selects monthly SIP date as "3"
    And user select SIP Duration as "3 years" from Recommended Duration Box
    And user select investment amount as "₹1,000" from Suggested Amount box
    And user scroll to I we have read the related schemes
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    And user click by text "Create SIP"
    And user select bank for MF buy or sip
    And user wait for "2000" milli second
    And user enter otp for purchase MF Scheme
    When user click by text "Confirm Order"
    And user do payment for mutualFund investment
    And user wait for MF SIP successful page
    Then user verify static text "SIP Created Successfully"
    And user verify partial static text "Your SIP will start"

  Scenario: verify Functionality of Scheme Details Link
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Portfolio"
    And user click by text contains "MF Goal 001"
    And user click on three dot icon in wealth screen
    When user click by text "Scheme Details"
    And user verify static text "Fund Detail"
    And user verify static text "Fund Performance"

  @Validation @MutualFundValidation
  Scenario: Verify validation when Switching MF scheme
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Portfolio"
    And user click by text contains "MF Goal 001"
    And user click on three dot icon in wealth screen
    And user click by text "Switch"
    And user verify partial static text "NAV"
    And user verify partial static text "Units"
    And user verify partial static text "Fund Value"
    And user verify partial static text "P&L"
    And user verify static text " Target Scheme"
    When user click by text " Please Select Target Scheme"
    Then user search for mutual fund "infrastructure"
    And user select button of "ADITYA BIRLA SUN LIFE INFRASTRUCTURE FUND - GROWTH" schemes
    When user remove "Aditya Birla Sun Life Infrastructure Fund Regular-Growth" schemes from swith screen
    Then user click by text " Please Select Target Scheme"
    Then user search for mutual fund "infrastructure"
    And user select button of "ADITYA BIRLA SUN LIFE INFRASTRUCTURE FUND - GROWTH" schemes
    And user click by text "Partial Fund"
    When user enter partial funds amount as "900"
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    And user click by text "Continue to OTP Confirmation"
    Then user verify partial static text "Minimum Amount is ₹"
    When user enter amount more than fund value
    And user click by text "Continue to OTP Confirmation"
    Then user verify partial static text "Amount must be less than fund value"
    And user click by text "Partial Unit"
    And user click by text "Continue to OTP Confirmation"
    Then user verify partial static text "Unit must be greater than"
    When user enter partial units as "1000000"
    And user click by text "Continue to OTP Confirmation"
    Then user verify partial static text "Unit must be less than MF Units"

  Scenario: Switching partial MF Schemes
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Portfolio"
    And user click by text contains "MF Goal 001"
    And user wait for "3000" milli second
    And user click on three dot icon in wealth screen
    And user click by text "Switch"
    When user click by text " Please Select Target Scheme"
    Then user search for mutual fund "infrastructure"
    And user select button of "ADITYA BIRLA SUN LIFE INFRASTRUCTURE FUND - GROWTH" schemes
    And user click by text "Partial Fund"
    When user enter partial funds amount as "1000"
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    And user click by text "Continue to OTP Confirmation"
    And user enter otp for purchase MF Scheme
    And user click by text "Confirm Order"
    And user wait for "5000" milli second
    Then user verify static text "Switch Order Successful"
    Then user verify bellow switch schemes status
      | Source Scheme                                              | Target Scheme                                            | Amount |
      | Aditya Birla Sun Life Equity Advantage Fund Regular-Growth | Aditya Birla Sun Life Infrastructure Fund Regular-Growth | ₹1,000 |
    When user click static text "View Transaction History"
    Then user verify partial text "Switch In"
    And user verify partial text "Switch Out"

  @Validation @MutualFundValidation
  Scenario: Validation while doing systematic transfer plan
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Portfolio"
    And user click by text contains "MF Goal 001"
    And user click on three dot icon in wealth screen
    And user click by text "Systematic Transfer Plan"
    When user click by text " Please Select Target Scheme"
    Then user search for mutual fund "infrastructure"
    And user select button of "ADITYA BIRLA SUN LIFE INFRASTRUCTURE FUND - GROWTH" schemes
    And user select Monthly STP radio button
    When user click by text "Continue to OTP Confirmation"
    Then verify validation error "This field is required"
    And verify validation error "Amount is required"
    And user enter number of transfer as "2"
    And user enter amount as "400" for stp
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    When user click by text "Continue to OTP Confirmation"
    Then verify validation error "Min Duration is 6"
    And verify validation error "Minimum Amount is ₹500"
    And user enter amount as "9999999999" for stp
    And user click by text "Continue to OTP Confirmation"
    Then user verify partial static text "Amount must be less than fund value"
    When user click by text "Transfer till there is balance (Perpetual)"
    Then number of transfer input box is disappear

  @Smoke @MutualFundSmoke
  Scenario: Monthly systematic transfer plan
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Portfolio"
    And user click by text contains "MF Goal 001"
    And user click on three dot icon in wealth screen
    And user click by text "Systematic Transfer Plan"
    When user click by text " Please Select Target Scheme"
    Then user search for mutual fund "infrastructure"
    And user select button of "ADITYA BIRLA SUN LIFE INFRASTRUCTURE FUND - GROWTH" schemes
    And user select Monthly STP radio button
    And user scroll to I we have read in stp screen
    When user select stp start date as "10"
    And user enter number of transfer as "13"
    And user click by text "₹500"
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    And user click by text "Continue to OTP Confirmation"
    And user wait for "5000" milli second
    And user enter otp for purchase MF Scheme
    And user click by text "Confirm Order"
    And user wait for "5000" milli second
    Then user verify static text "STP Created Successfully"
    And user verify bellow STP status
      | Source Scheme                                              | Target Scheme                                            | Amount | Frequency |
      | Aditya Birla Sun Life Equity Advantage Fund Regular-Growth | Aditya Birla Sun Life Infrastructure Fund Regular-Growth | ₹500   | Monthly   |
    When user click static text "View STPs"
    And user wait for "3000" milli second
    Then user verify STP transaction amount as "₹500"
    And user verify STP frequency as " Monthly"

  @Validation @MutualFundValidation
  Scenario: Validation Weekly systematic withdrawal plan
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Portfolio"
    And user click by text contains "MF Goal 001"
    And user click on three dot icon in wealth screen
    And user click by text "Systematic Withdrawal Plan"
    And user select weekly swp radio button
    When user click by text "Continue to OTP Confirmation"
    Then verify validation error "This field is required"
    And verify validation error "Amount is required"
    When user select stp start date as "10"
    And user enter swp duration as "2"
    And user enter amount as "59" for swp
    And user click by text "Continue to OTP Confirmation"
    Then verify validation error "Min Duration is 6"
    And verify validation error "Minimum Amount is ₹100"
    And user enter amount as "999999" for swp
    And user click by text "Continue to OTP Confirmation"
    Then user verify partial static text "Amount must be less than fund value"

  @Smoke @MutualFundSmoke
  Scenario: Weekly systematic withdrawal plan
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Portfolio"
    And user click by text contains "MF Goal 001"
    And user click on three dot icon in wealth screen
    And user click by text "Systematic Withdrawal Plan"
    And user select weekly swp radio button
    When user select swp start day as "10"
    And user enter swp duration as "8"
    And user enter amount as "550" for swp
    And user click by text "Continue to OTP Confirmation"
    And user enter otp for purchase MF Scheme
    And user click by text "Confirm Order"
    And user wait for "5000" milli second
    Then user verify static text "SWP Created Successfully"
    And user verify bellow SWP status
      | Scheme                                                     | Amount | Frequency |
      | Aditya Birla Sun Life Equity Advantage Fund Regular-Growth | ₹550   | Weekly    |
    When user click static text "View SWPs"
    And user wait for "5000" milli second
    Then user verify SWP transaction amount as "₹550"
    And user verify SWP frequency as "Weekly"

  Scenario: Weekly systematic withdrawal plan with perputal
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Portfolio"
    And user click by text contains "MF Goal 001"
    And user click on three dot icon in wealth screen
    And user click by text "Systematic Withdrawal Plan"
    And user select weekly swp radio button
    When user select swp start day as "10"
    And user click static text "Withdraw till there is balance (Perpetual)"
    And user enter amount as "600" for swp
    And user click by text "Continue to OTP Confirmation"
    And user enter otp for purchase MF Scheme
    And user click by text "Confirm Order"
    And user wait for "4000" milli second
    Then user verify static text "SWP Created Successfully"
    When user click static text "View SWPs"
    And user wait for "4000" milli second
    Then user verify static text "SWP Amount "
    Then user verify static text "₹600"
    And user verify static text "0/Perpetual"

  Scenario: User stop STP
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Portfolio"
    And user click by text contains "MF Goal 001"
    And user click on three dot icon in wealth screen
    And user click by text "Systematic Transfer Plan"
    When user click by text " Please Select Target Scheme"
    Then user search for mutual fund "infrastructure"
    And user select button of "ADITYA BIRLA SUN LIFE INFRASTRUCTURE FUND - GROWTH" schemes
    And user select weekly STP button
    And user scroll to I we have read in stp screen
    When user select stp start date as "15"
    And user click by text "Transfer till there is balance (Perpetual)"
    And user enter amount as "580" for stp
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    And user click by text "Continue to OTP Confirmation"
    And user wait for "4000" milli second
    And user enter otp for purchase MF Scheme
    And user click by text "Confirm Order"
    And user wait for "4000" milli second
    When user click static text "View STPs"
    And user wait for "3000" milli second
    And user check stp to stop
    And user stop the stp
    Then user assert that stp has disappear from manage sip screen

  Scenario: User stop SWP
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Portfolio"
    And user click by text contains "MF Goal 001"
    And user click on three dot icon in wealth screen
    And user click by text "Systematic Withdrawal Plan"
    And user select weekly swp radio button
    When user select swp start day as "16"
    And user click static text "Withdraw till there is balance (Perpetual)"
    And user enter amount as "580" for swp
    And user click by text "Continue to OTP Confirmation"
    And user wait for "3000" milli second
    And user enter otp for purchase MF Scheme
    And user click by text "Confirm Order"
    And user wait for "3000" milli second
    When user click static text "View SWPs"
    And user wait for "3000" milli second
    And user check swp to stop
    And user stop the swp
    Then user assert that swp has disappear from manage sip screen


#   Manual Testing
#  Import External MF
#  NFO testing
#
