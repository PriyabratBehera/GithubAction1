#@Regression @PayUtilityBillRegression
Feature: Pay Utility Bill Scenario

  @Smoke @PayUtilityBillSmoke
  Scenario: User Performs a Postpaid Mobile Recharge
    Given user login with user "9504868668 | 9504868668"
    And application launched successfully
    When user click by text "Pay Utility Bill"
    And user wait for "2000" milli second
    And user click by text "Mobile"
    And user search biller as "Air"
    Then user click airtel postpaid
    And user verify text "Airtel Postpaid"
    And user enter mobile number as "7704049123" for mobile recharge
    And user click by text "Continue"
    And user enter bill amount as "500"
    When user click by text "Proceed to Pay"
    And user wait for "4000" milli second
    And user do recharge of "500.00" amount
    And user wait for "2000" milli second
    Then user enter OTP for mobile recharge
    And user click on SUCCESS
    And user click button text "Submit"
    And user see the time of transaction
    And user wait for "7000" milli second
    Then user verify static text "Payment Successful"
    And user verify static text "You Paid ₹500.00"
    And user verify static text "to Airtel Postpaid"
    When user click by text "View Receipt"
    Then user verify static text "Bill Paid"
    And user close the payment receipt pop up
    When user click by text "Home"
    Then user verify text "My Favourite Billers"
    And user scroll to view last five transaction
    And user verify recharge transaction of "₹500.00" in "Airtel Postpaid"
    When user click on view all for see transaction
    Then user verify transaction completed of "₹500.00" in "Airtel Postpaid"

  Scenario: User Link Another Number and do Recharge
    Given application launched successfully
    When user click by text "Pay Utility Bill"
    And user wait for "2000" milli second
    And user click my favourite billers slide drow
    And user click on drop down in review and pay screen
    And user click by text "Add New"
    And user search biller as "Jio"
    And user click jio postpaid
    And user enter mobile number as "7653889031" for mobile recharge
    And user click by text "Continue"
    And user wait for "2000" milli second
    And user enter bill amount as "666"
    When user click by text "Proceed to Pay"
    And user wait for "4000" milli second
    And user do recharge of "666.00" amount
    Then user enter OTP for mobile recharge
    And user click on SUCCESS
    And user click button text "Submit"
    And user see the time of transaction
    And user wait for "7000" milli second
    Then user verify static text "Payment Successful"
    And user verify static text "You Paid ₹666.00"
    When user click by text "Home"
    And user scroll to view last five transaction
    And user verify recharge transaction of "₹666.00" in "Jio Postpaid"
    When user click on view all for see transaction
    Then user verify transaction completed of "₹666.00" in "Jio Postpaid"

  @Smoke @PayUtilityBillSmoke
  Scenario: User Performs a Prepaid Mobile Recharge
    Given application launched successfully
    And user wait for "2000" milli second
    When user click by text "Pay Utility Bill"
    And user click mobile for prepaid
    And user enter mobile number as "7653889031" for mobile recharge
    And user click by text "Fetch Plans"
    And user wait for "4000" milli second
    And user search "179" recharge plan
    And user click by text "Pay Now"
    And user do recharge of "179.00" amount
    And user wait for "2000" milli second
    Then user enter OTP for mobile recharge
    And user click on SUCCESS
    And user click button text "Submit"
    And user see the time of transaction
    And user wait for "7000" milli second
    Then user verify static text "Payment Successful"
    And user verify static text "You Paid ₹179.00"
    And user verify static text "to RELIANCE JIO"
    When user click by text "View Receipt"
    Then user verify static text "Bill Paid"
    And user close the payment receipt pop up
    When user click by text "Home"
    And user scroll to view last five transaction
    And user verify recharge transaction of "₹179.00" in "RELIANCE JIO"
    When user click on view all for see transaction
    Then user verify transaction completed of "₹179.00" in "RELIANCE JIO"

  @Smoke @PayUtilityBillSmoke
  Scenario: User Booked a Cylinder
    Given application launched successfully
    When user click by text "Pay Utility Bill"
    And user wait for "2000" milli second
    Then user click by text "Book Cylinder"
    And user click bharat gas bpcl
    And user enter register contact number "9559866658"
    And user click by text "Fetch Price"
    And user wait for "4000" milli second
    When user click by text "Proceed to Pay"
    And user do payment for cylinder
    Then user enter OTP for mobile recharge
    And user click on SUCCESS
    And user click button text "Submit"
    And user see the time of transaction
    And user wait for "7000" milli second
    Then user verify static text "Payment Successful"
    And user verify static text "to Bharat Gas (BPCL)"
    When user click by text "View Receipt"
    Then user verify static text "Bill Paid"
    And user close the payment receipt pop up
    When user click by text "Home"
    And user scroll to view last five transaction
    And user verify recharge transaction of "₹873.50" in "Bharat Gas (BPCL)"
    When user click on view all for see transaction
    Then user verify transaction completed of "₹873.50" in "Bharat Gas (BPCL)"

#@rechargeStatusPending,FailNotHappning
#  Scenario: Filtering the all transaction