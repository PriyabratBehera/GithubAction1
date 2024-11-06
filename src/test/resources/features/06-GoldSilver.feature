@Regression @GoldSilverRegression
Feature: Digital Gold Scenarios

  @Validation @GoldSilverValidation
  Scenario: Verify The User Can Not Buy Silver and Gold Using Without KYC Number
    Given user login with user "9585034203 | 9585034203"
    And application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "Invest One Time"
    And user click by text "Silver"
    Then user verify text "Buy Price"
    And user enter gold silver buy value "51"
    And user verify partial text "gm"
    And user click on Buy in grams
    And user click on Buy in Rupees
    And user enter gold silver buy value "51"
    When user click by text "Buy Now"
    Then user verify static text "Account Activation Pending"
    And user clicks on Cancel button
    Then user verify static text "Digital Gold"
    And user click by text "Buy Now"
    And user clicks on start now button
    Then user verify static text "Onboarding Process:"

  @Validation @GoldSilverValidation
  Scenario: Verify User Cannot Do SIP Using Without KYC User
    And application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "Start SIP"
    And user select SIP start date as "2"
    And user set SIP duration as "20"
    And user enters investment amount "500"
    And user select Financial for digital gold as "Wealth"
    And user wait for "2000" milli second
    And user click by text "Authorise & Save SIP"
    Then user verify static text "Account Activation Pending"

  @Smoke @GoldSilverSmoke
  Scenario: Verify that The User Can Buy Gold - KYC Completed
    Given user login with user "8071405089 | 8071405089"
    And application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "Invest One Time"
    And user click by text "Gold"
    And user verify text "Buy Price"
    And user click on Buy in grams
    And user enters weight "0.02"
    And user click by text "Buy Now"
    And user selects Financial Goal "Liquid FundsGoal 123"
    And user click by text contains "Purchased quantity has a lockin period of 5 business days. During this period I can’t sell, gift or order delivery"
    And user click by text contains "I confirm that, I am not using a third-party bank account to pay for this investment."
    And user click by text "Proceed to Pay"
    And user do payment for gold silver investment
    And user wait for gold silver purchase successful screen
    And user verify static text "Transaction Successful"
    When user click static text "View Transaction History"
    And user wait for "3000" milli second
    Then verify below transaction History
      | TransactionFor  | TransactionType |
      | Gold (0.0200gm) | Buy             |

  Scenario: User Can Buy silver - KYC Completed
    Given application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "Invest One Time"
    And user click by text "Silver"
    And user verify text "Buy Price"
    And user enter gold silver buy value "1"
    And user verify partial text "gm"
    And user click on Buy in grams
    And user enters weight "10"
    And user click by text "Buy Now"
    And user selects Financial Goal "Liquid FundsGoal 123"
    And user click by text contains "Purchased quantity has a lockin period of 5 business days. During this period I can’t sell, gift or order delivery"
    And user click by text contains "I confirm that, I am not using a third-party bank account to pay for this investment."
    And user click by text "Proceed to Pay"
    And user do payment for gold silver investment
    And user wait for gold silver purchase successful screen
    And user verify static text "Transaction Successful"
    And user click static text "View Transaction History"

  @Smoke @GoldSilverSmoke
  Scenario: user Invest via SIP for Gold Monthly
    Given application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "Start SIP"
    And user select SIP start date as "2"
    And user set SIP duration as "20"
    And user enters investment amount "500"
    And user select Financial for digital gold as "Liquid FundsGoal 123"
    And user click by text "Authorise & Save SIP"
    And user click by text "Net Banking"
    And user select bank for gold sip SIP
    And user click by text "Continue"
    And user wait for "8000" milli second
    And user click on simulate success
    And user wait for "5000" milli second
    Then user verify static text "SIP Created Successfully"
    And user verify partial static text "Your SIP will start on"
    When user click static text "View SIPs"
    Then user verify static text "₹500"
    And user verify static text "Month"
    And user verify static text "0/20"
    And user verify partial static text "2nd"
    And user verify static text "24K Gold"

  Scenario: User Invest via SIP for Silver Weekly
    Given application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "Start SIP"
    And user click by text "Silver"
    And user wait for "2000" milli second
    And user click weekly SIP
    And user select SIP start date as "2"
    And user set SIP duration as "21"
    And user click by text "₹1,000"
    And user select Financial for digital gold as "Liquid FundsGoal 123"
    And user click by text "Authorise & Save SIP"
    And user click by text "Net Banking"
    And user select bank for gold sip SIP
    And user click by text "Continue"
    And user wait for "8000" milli second
    And user click on simulate success
    And user wait for "3000" milli second
    And user verify static text "SIP Created Successfully"
    And user verify partial static text "Your SIP will start on"
    And user click static text "View SIPs"
    Then user verify static text "₹1,000"
    And user verify static text "Week"
    And user verify static text "0/21"
    And user verify partial static text "2nd"
    And user verify static text "24K Silver"

  @Smoke @GoldSilverSmoke
  Scenario: User Can Sell Gold
    Given application launched successfully
    And user change the interval for "8071405089 | 8071405089"
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "View Portfolio"
    And user wait gold silver portfolio screen
    And user click by text contains "Liquid FundsGoal 123"
    And user wait gold silver wealth screen
    And user clicks on ellipsis against "24K Gold"
    And user click by text "Sell"
    And user wait for "2000" milli second
    And user click on Sell in Grams
    And user enters weight "0.01"
    And user click by text "Sell"
    And user waite sell gold silver otp screen
    And user enters OTP for Sell Gold
    And user wait for gold silver sell successful screen
    And user verify static text "Transaction Successful"
    When user click static text "View Transaction History"
    And user wait for "3000" milli second
    Then verify below sell transaction History
      | TransactionFor  | TransactionType |
      | Gold (0.0100gm) | Sell            |

  Scenario: User Can Sell Silver
    Given application launched successfully
    And user change the interval for "8071405089 | 8071405089"
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "View Portfolio"
    And user wait gold silver portfolio screen
    And user click by text contains "Liquid FundsGoal 123"
    And user wait gold silver wealth screen
    And user clicks on ellipsis against "24K Silver"
    And user click by text "Sell"
    And user wait for "2000" milli second
    And user click on Sell in Grams
    And user enters weight "3"
    And user click by text "Sell"
    And user waite sell gold silver otp screen
    And user enters OTP for Sell silver
    And user wait for gold silver sell successful screen
    And user verify static text "Transaction Successful"
    And user click static text "View Transaction History"

  Scenario: User can send gift for Silver
    Given application launched successfully
    And user change the interval for "8071405089 | 8071405089"
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "View Portfolio"
    And user wait gold silver portfolio screen
    And user click by text contains "Liquid FundsGoal 123"
    And user wait gold silver wealth screen
    And user clicks on ellipsis against "24K Silver"
    And user click by text "Send Gift"
    And user wait for "3000" milli second
    When user click by text "Next"
    Then user verify static text "Send Gift (Silver)"
    And user click on Gift in Grams
    And user click by text "5 gm"
    And user click by text "Next"
    And user wait for "2000" milli second
    When user click by text "Next"
    Then user verify static text "Receiver Details"
    And user enters Full Name "Litan Behera"
    And user enters Mobile Number "9014672393"
    And user selects state "Andhra Pradesh"
    And user click by text contains "I confirm the receiver’s number is correct"
    And user click by text "Next"
    And user waite sell gold silver otp screen
    And user enters OTP for Sell Gold
    And user wait for gold silver gift successful screen
    And user verify static text "Transaction Successful"
    And user verify partial static text "You have gifted 5 gm of silver"
    And user click static text "View Transaction History"

  @Smoke @GoldSilverSmoke
  Scenario: Verify user can send gift for Gold
    Given application launched successfully
    And user change the interval for "8071405089 | 8071405089"
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text contains "Send Gift"
    And user enters Full Name "Litan Behera"
    And user enters Mobile Number "9014672393"
    And user store gold silver sender name and mobile number
    And user selects state "Andhra Pradesh"
    And user click by text contains "I confirm the receiver’s number is correct"
    And user click by text "Next"
    And user enters OTP for Sell Gold
    And user wait for "4000" milli second
    And user enter gold silver buy value "60"
    When user click by text "Gift Now"
    And user do payment for gold silver investment
    And user wait for gold silver gift successful screen
    And user verify static text "Transaction Successful"
    And user verify partial static text "You have gifted"
    And user click static text "View Transaction History"
    Then verify below transaction History for gift gold
      | TransactionAmount | TransactionType |
      | ₹60.00            | Gift Sent       |

  @Validation @GoldSilverValidation
  Scenario: Verify the validations in Gold-24K, Silver -24K tile card
#    Given user login with user "8071405089 | 8071405089"
    Given application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "Invest One Time"
    And user click by text "Buy Now"
    Then verify validation error "Enter Amount"
    And user enter gold silver buy value "10"
    And user click by text "Buy Now"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.5,00,000"
    And user enter gold silver buy value "500001"
    And user click by text "Buy Now"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.5,00,000"
    And user click on Buy in grams
    And user enters weight "251"
    And user click by text "Buy Now"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.5,00,000"
    And user enters weight "500001"
    And user click by text "Buy Now"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.5,00,000"
    And user click by text "Silver"
    And user click on Buy in Rupees
    And user enter gold silver buy value "10"
    And user click by text "Buy Now"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.5,00,000"
    And user enter gold silver buy value "500001"
    And user click by text "Buy Now"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.5,00,000"
    And user click on Buy in grams
    And user enters weight "21000"
    And user click by text "Buy Now"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.5,00,000"
    And user click by text "Gold"

  Scenario: Verify UI of order physical gold screen
    Given application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text contains "Order"
    Then user verify static text "Product Catalogue"
    And user verify partial text "0.10 gm Gold coin"
    And user verify partial text "24K, 99.99% Purity"
    And user verify partial text "Making & Delivery"
    And user verify partial text "₹200.00"
    When user click by text "Silver"
    And user verify partial text "1.00 gm Silver bar"
    And user verify partial text "24K, 99.99% Purity"
    And user verify partial text "Making & Delivery"
    And user verify partial text "₹100.00"

  @Validation @GoldSilverValidation
  Scenario: Verify validations on Sell Gold/Silver screen
    Given application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "View Portfolio"
    And user click by text contains "Liquid FundsGoal 123"
    And user clicks on ellipsis against "24K Gold"
    And user click by text "Sell"
    And user wait for "4000" milli second
    And user enter amount as "50" for sell gold
    And user click by text "Sell"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.10,00,000"
    And user enter amount as "1100000" for sell gold
    And user click by text "Sell"
    Then verify validation error "You do not have sufficient quantity to Sell"
    And user click on Sell in Grams
    And user enter amount as "0.0001" for sell gold
    And user click by text "Sell"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.10,00,000"
    And user enters weight "100"
    And user click by text "Sell"
    Then verify validation error "You do not have sufficient quantity to Sell"

  @Validation @GoldSilverValidation
  Scenario: Verify validation error for send gift for silver
    Given application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text contains "View Portfolio"
    And user click by text contains "Liquid FundsGoal 123"
    And user clicks on ellipsis against "24K Silver"
    And user click by text "Send Gift"
    And user wait for "4000" milli second
    And user enter amount as "50" for sell gold
    And user click by text "Next"
    And user wait for "5000" milli second
    Then verify validation error "Minimum Rs.51 and Maximum Rs.10,00,000"
    And user enter amount as "1100000" for sell gold
    And user click by text "Next"
    Then verify validation error "You do not have sufficient quantity to Gift"
    And user click on Gift in Grams
    And user enters weight "0.00001"
    And user click by text "Next"
    Then verify validation error "After decimal 4 digit numeric values are allowed"
    And user verify static text "Available Quantity"
    And user verify static text "Buy Price"
    And user verify static text "Digital Gold"
    And user click on Gift in RS

  @Validation @GoldSilverValidation
  Scenario: Verify validations for send gift for gold
    Given application launched successfully
    And user change the interval for "8071405089 | 8071405089"
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text contains "View Portfolio"
    And user click by text contains "Liquid FundsGoal 123"
    And user clicks on ellipsis against "24K Gold"
    And user click by text "Send Gift"
    And user wait for "4000" milli second
    And user enter amount as "50" for sell gold
    And user click by text "Next"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.10,00,000"
    And user enter amount as "1100000" for sell gold
    And user click by text "Next"
    Then verify validation error "You do not have sufficient quantity to Gift"
    And user click on Gift in Grams
    And user enters weight "0.00001"
    And user click by text "Next"
    Then verify validation error "After decimal 4 digit numeric values are allowed"
    And user verify static text "Available Quantity"
    And user verify static text "Buy Price"
    And user enters weight "0.01"
    And user click by text "Next"
    And user wait for gold silver receiver details screen
    And user enters Full Name "L"
    And user enters Mobile Number "90146"
    And user selects state "Andhra Pradesh"
    And user click by text contains "I confirm the receiver’s number is correct"
    And user click by text "Next"
    Then user verify static text "Name should contain minimum 2 characters"
    And user verify static text "Enter valid mobile number"

  Scenario: Verify functionality of Portfolio Transaction History
    Given application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text contains "View Portfolio"
    And user click by text contains "Liquid FundsGoal 123"
    And user clicks on ellipsis against "24K Gold"
    And user click by text "Transaction History"
    Then user verify static text "Transaction History"

  Scenario: Verify that when the timer ends, navigate to the Digital Gold screen
    Given application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "Invest One Time"
    And user click on Buy in grams
    And user enters weight "0.02"
    And user click by text "Buy Now"
    And user wait for "242000" milli second
    And user wait for "5000" milli second
    Then user verify text "Buy Price"

  Scenario: Verify functionality of Order Physical Gold
    Given application launched successfully
    And user change the interval for "8071405089 | 8071405089"
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text contains "View Portfolio"
    And user click by text contains "Liquid FundsGoal 123"
    When user click by text contains "24K Gold"
    Then user verify partial static text "Current"
    And user verify partial static text "Invested"
    And user verify partial static text "Quantity"
    And user clicks on ellipsis against "24K Gold"
    And user click by text "Order Coins"
    And user click by text contains "1.00 gm Gold coin"
    And user click by text "Buy Now"
    And user wait for "3000" milli second
    And user verify text "Cart Summary"
    And user remove coin from add to cart

  @Smoke @GoldSilverSmoke
  Scenario: Verify that order Gold is functional
    Given application launched successfully
    And user change the interval for "8071405089 | 8071405089"
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "Order Coins"
    And user wait for "3000" milli second
    And user click by text contains "0.10 gm Gold coin"
    And user verify partial static text "Metal Purity"
    And user verify partial static text "Price"
    And user verify partial static text "Making & Delivery"
    And user verify partial static text "Total"
    And user click by text "Add to Cart"
    And user click by text "Go to Cart"
    And user remove coin from add to cart
    And user wait for "3000" milli second
    And user click by text contains "0.10 gm Gold coin"
    And user click by text "Add to Cart"
    And user click by text "Go to Cart"
    And user verify partial static text "gm Gold coin"
    And user verify partial text "gm Gold coin"
    And user verify static text "Estimated Delivery: In 7 to 15 days."
    And user verify static text "Actually delivery date may vary based on the shipping location"
    And user select Financial Goal to Debit as "Liquid FundsGoal 123"
    And user click by text "Checkout"
    And user select shipping address for gold silver order
    And user click by text "Proceed to Pay"
    And user do payment for gold silver investment
    And user wait for gold silver order successful screen
    And user click static text "View Transaction History"
    Then verify below in Gold Delivery History
      | TransactionFor | TransactionType | TransactionStatus |
      | Coins / Bars   | Delivery        | In process        |

  Scenario: Verify that order Silver is functional
    Given application launched successfully
    And user change the interval for "8071405089 | 8071405089"
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "Order Coins"
    And user click by text "Silver"
    And user click by text contains "1.00 gm Silver bar"
    And user click by text "Buy Now"
    And user remove coin from add to cart
    And user click by text contains "1.00 gm Silver bar"
    And user click by text "Buy Now"
    And user select Financial Goal to Debit as "Liquid FundsGoal 123"
    And user click by text "Checkout"
    And user select shipping address for gold silver order
    And user click by text "Proceed to Pay"
    And user do payment for gold silver investment
    And user wait for gold silver order successful screen
    And user click by text "Home"

  Scenario: Edit Shipping Address for Gold Order
    Given application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "Order Coins"
    And user click by text contains "0.10 gm Gold coin"
    And user click by text "Buy Now"
    And user go back from "Cart Summary" screen
    And user click by text contains "0.10 gm Gold coin"
    And user click by text "Buy Now"
    And user remove coin from add to cart
    And user click by text contains "0.10 gm Gold coin"
    And user click by text "Buy Now"
    And user select Financial Goal to Debit as "Liquid FundsGoal 123"
    And user click by text "Checkout"
    When user click static text "Add New"
    Then user verify static text "New Address"
    And user verify static text "Shipping Address"
    When user go back from "Address" screen
    Then user edit shipping address
    When user click by text "Save Address"
    Then user verify static text "Anantapur: 943476"
    And user reedit shipping address

  Scenario: Verify manage sip link is functional in gold dashboard
    Given application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    When user click by text "Manage SIP"
    Then user verify text "Gold / Silver"

  Scenario: Verify User Buy more gold after buying initially
    Given application launched successfully
    And user change the interval for "8071405089 | 8071405089"
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user wait for "2000" milli second
    And user click by text contains "View Portfolio"
    And user click by text contains "Liquid FundsGoal 123"
    And user clicks on ellipsis against "24K Gold"
    And user click by text "Buy"
    And user click on Buy in grams
    And user enters weight "0.01"
    And user click by text "Buy Now"
    And user wait for "5000" milli second
    And user selects Financial Goal "Liquid FundsGoal 123"
    And user click by text contains "Purchased quantity has a lockin period of 5 business days. During this period I can’t sell, gift or order delivery"
    And user click by text contains "I confirm that, I am not using a third-party bank account to pay for this investment."
    And user click by text "Proceed to Pay"
    And user do payment for gold silver investment
    And user wait for gold silver purchase successful screen
    And user verify static text "Transaction Successful"

  Scenario: Verify detailed transaction for Buy
    Given application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "History"
    And user wait for "3000" milli second
    And user selects Goal Type as "Liquid FundsGoal 123"
    And user selects Transaction Type as "Buy"
    And user click on View details transaction
    And user verify partial text "Weight"
    And user verify partial text "Transaction ID"
    And user verify partial text "Price"
    And user verify partial text "Total Amount"
    And user click by text "View Invoice"

  Scenario: Verify detailed transaction for Sell
    Given application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text contains "View Portfolio"
    And user click by text contains "Liquid FundsGoal 123"
    And user clicks on ellipsis against "24K Gold"
    And user click by text contains "Transaction History"
    And user wait for "3000" milli second
    And user selects Goal Type as "Liquid FundsGoal 123"
    And user selects Transaction Type as "Sell"
    And user click on View details transaction
    And user verify partial text "Weight"
    And user verify partial text "Metal Purity"
    And user verify partial text "Transaction ID"
    And user verify partial text "Date & Time"
    And user verify partial text "Price"
    And user verify partial text "Total Amount"
    When user click by text "Payout Detail"

  Scenario: Verify detailed transaction for Gift
    Given application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "History"
    And user wait for "3000" milli second
    And user selects Goal Type as "Liquid FundsGoal 123"
    And user selects Transaction Type as "Gift"
    And user click on View details transaction
    Then user verify partial text "Gift History"
    And user verify partial text "Date & Time"
    And user verify partial text "Gifted To"
    And user verify partial text "Mobile Number"
    And user verify partial text "Litan"
    And user verify partial text "9014672393"

  Scenario: Verify detailed transaction for Delivery
    Given application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "History"
    And user wait for "3000" milli second
    And user selects Transaction Type as "Delivery"
    And user click on View details transaction
    And user verify partial text "Order Placed"
    And user verify partial text "Date"
    And user verify partial text "Transaction ID"
    And user verify partial text "Weight"
    And user verify partial text "Total Amount"
    And user verify partial text "Buyer Details"
    And user verify Buyer name
    And user verify partial text "Delivery Status"
    And user verify partial text "In process"
    And user verify partial text "View Invoice"

  Scenario: Verify detailed transaction for SIP
    Given application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "History"
    And user wait for "3000" milli second
    And user selects Goal Type as "Liquid FundsGoal 123"
    And user selects Transaction Type as "SIP"
    Then user verify static text " No Transaction History found"

  @Validation @GoldSilverValidation
  Scenario: Verify validation error  while invest via SIP for monthly/weekly
    Given application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text "Start SIP"
    And user select SIP start date as "1"
    And user set SIP duration as "0"
    And user enters investment amount "400"
    And user select Financial for digital gold as "Liquid FundsGoal 123"
    And user click by text "Authorise & Save SIP"
    And verify validation error "Min duration is 12 months"
    And verify validation error "Minimum sip amount is 500"
    And user select SIP start date as "12"
    And user set SIP duration as "123"
    And user enters investment amount "51000"
    And user click by text "Authorise & Save SIP"
    And verify validation error "Max is 120 months"
    And verify validation error "Maximum sip amount is 50,000"
    And user click weekly SIP
    And user select SIP start date as "1"
    And user set SIP duration as "0"
    And user enters investment amount "400"
    And user click by text "Authorise & Save SIP"
    And verify validation error "Min duration is 12 weeks"
    And verify validation error "Minimum sip amount is 500"
    And user set SIP duration as "134"
    And user enters investment amount "500000"
    And user click by text "Authorise & Save SIP"
    And verify validation error "Max is 120 weeks"
    And verify validation error "Maximum sip amount is 50,000"

  Scenario: Verify that Move to Another Goal link is functional
    And application launched successfully
    When user clicks on Digital Gold
    And user close gold promotion pop up
    And user click by text contains "View Portfolio"
    And user click by text contains "Liquid FundsGoal 123"
    And user clicks on ellipsis against "24K Gold"
    And user click by text contains "Move to Another Goal"
    And user move to goal "Wealth"
    And user click by text "Confirm"
    And user wait for "2000" milli second
    And user go back from "Wealth" screen
    And user wait for "2000" milli second
    And user click on Wealth goal
    And user wait for "3000" milli second
    And user clicks on ellipsis against "24K Gold"
    And user click by text contains "Move to Another Goal"
    And user move to goal "Liquid FundsGoal 123"
    And user click by text "Confirm"