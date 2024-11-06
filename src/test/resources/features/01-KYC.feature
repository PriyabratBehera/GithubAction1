#@Regression @KYCRegression
Feature: KYC Scenario

  Scenario: Verify UI Elements in KYC Screen
    Given user login with user "9912276543 | 9912276543"
    When application launched successfully
    Then user click on hamburger menu
    And user wait for "3000" milli second
    And user click by text "KYC"
    And user verify static text "Investor Onboarding"
    And user verify text "After onboarding is approved, you can invest in Mutual Funds and setup your NPS Account"
    And user verify static text "Onboarding Process:"
    And user verify static text "The onboarding is done through Aadhaar based KYC using your Digilocker."
    And user verify static text "Aadhaar number and mobile linked to Aadhaar is needed for OTP verification & eSign"
    And user click on start new application

  Scenario: Verify Validation in Investor Onboarding Screen
    Given application launched successfully
    When user click on hamburger menu
    Then user wait for "4000" milli second
    And user click by text "KYC"
    And user click on start new application
    And user verify static text "Contact Detail"
    And user verify static text "Investor Onboarding"
    When user click by text "Get OTP"
    Then verify validation error "Mobile number is required"
    And verify validation error "Email is required"
    When user enter mobile number as "919178780" for complete KYC
    Then verify validation error "Invalid mobile number"
    And verify validation error "Email is required"
    And user enter email id as "mahesh@gmailcom" for complete KYC
    Then verify validation error "Invalid email address"
    Then verify validation error "Invalid mobile number"
    When user go back from "Investor Onboarding" screen
    Then user verify text "Start Onboarding"

  Scenario: Verify Validation in Contact Verification Screen
    Given application launched successfully
    And user click on hamburger menu
    And user wait for "3000" milli second
    And user click by text "KYC"
    And user click on start new application
    When user enter mobile number as "9912276543" for complete KYC
    Then user enter email id as "mahesh@gmail.com" for complete KYC
    And user click by text "Get OTP"
    And user wait for "5000" milli second
    And user verify static text "Mobile Number Verification"
    And user verify static text "OTP received on 9912276543"
    And user verify static text "Email Verification"
    And user verify static text "OTP received on mahesh@gmail.com"
    When user enter invalid OTP for verifying mobile number for KYC
    Then user enter valid OTP for verifying email id for KYC
    And user click by text "Continue"
    Then verify validation error "Invalid mobile OTP"
    When user enter valid OTP for verifying mobile number for KYC
    Then user enter invalid OTP for verifying email address for KYC
    And user click by text "Continue"
    When user click static text "Resend OTP"
    Then user verify static text "OTP has been sent to mobile."
    When user click resend otp for email
    Then user verify static text "OTP has been sent to email."
    And user wait for "2000" milli second
    When user click resend otp for email
#    Then user verify partial text "Please wait for"
    When user enter invalid OTP for verifying mobile number for KYC
    And user enter invalid OTP for verifying email address for KYC
    And user click by text "Continue"
    Then verify validation error "Invalid mobile and email OTP"

  Scenario: Verify UI Elements in DigiLocker Screen
    Given application launched successfully
    When user click on hamburger menu
    Then user wait for "3000" milli second
    And user click by text "KYC"
    And user click on start new application
    When user enter mobile number as "9912276543" for complete KYC
    Then user enter email id as "mahesh@gmail.com" for complete KYC
    And user click on Get OTP
    And user wait for "3000" milli second
    And user enter valid OTP for verifying mobile number for KYC
    And user click by text "Continue"
    And user enter valid OTP for verifying email id for KYC
    And user click by text "Continue"
    And user verify static text "Aadhaar Based KYC"
    And user verify static text "How Digilocker works"
    And user verify static text "Your KYC related documents are auto-verified using the digilocker & approved instantly"
    And user verify static text "You will be redirected to the digilocker page wherein you need to provide consent for sharing documents / information with CRA"
    And user click by text "Proceed to Aadhaar KYC"
    And user wait for "5000" milli second
    And user verify static text "DigiLocker"
    And user verify static text "Signzy"

  Scenario: Verify Validation in Personal Detail Screen
    Given user login with user "8541414141 | 8541414141"
    And application launched successfully
    And user click on hamburger menu
    And user wait for "3000" milli second
    And user click by text "KYC"
    When user click by text " Complete Pending Application"
    And user wait for "3000" milli second
    And user click on "About Me" tab
    And user verify static text "PAN"
    And user click by text "Smt"
    When user keep father's name as empty
    And user keep mother's name as empty
    And user keep place of birth as empty
    And user scroll to marital status
    And user click by text "Married"
    And user click by text "Continue"
    And user scroll to spouse name
    Then verify validation error "Name cannot be empty"
    And user verify spouse name can not be empty
    And user enter father's name as "Akshya"
    And user enter mother's name as "Shrusti"
    And user enter place of birth as "Odisha"
    And user click by text "Single"
    When user click by text "Continue"
    And user wait for "8000" milli second
    Then user verify static text "Declaration & Other Detail"

  Scenario: Verify Validation in Declaration & Other Detail Screen
    Given application launched successfully
    When user click on hamburger menu
    Then user wait for "3000" milli second
    And user click by text "KYC"
    When user click by text " Complete Pending Application"
    Then user wait for "3000" milli second
    And user click on "Occupation" tab
    When user enters all required field in declaration and other detail screen
    And user click by text "Continue"
    And user give location
    And user wait for "8000" milli second
    Then user verify static text "Bank Account"

  Scenario: Verify Validation in Bank Account Screen
    Given application launched successfully
    When user click on hamburger menu
    Then user wait for "3000" milli second
    And user click by text "KYC"
    When user click by text " Complete Pending Application"
    And user wait for "3000" milli second
    And user click on "Bank" tab
    And user click static text "Add New Bank Account"
    And user click by text "Continue"
    Then verify validation error "Account number is required."
    And verify validation error "IFSC code is required"
    And verify validation error "Bank name cannot be empty"
    When user enter account number in bank as "198765476" account screen
    And user enter ifsc code as "UC2354"
    And user Select bank name as "Axis Bank"
    Then user verify text "Axis Bank"
    When user click by text "Continue"
    Then verify validation error "Account number should have at least 10 digits."
    And verify validation error "Invalid IFSC code"
    When user enter ifsc code as "98709123432"
    Then verify validation error "Invalid IFSC code"
    When user enter ifsc code as "UCBAQWERTYU"
    Then verify validation error "Invalid IFSC code"

  Scenario: User Add a Bank Account for KYC
    Given application launched successfully
    When user delete bank account as "123456123456"
    Then user click on hamburger menu
    And user wait for "3000" milli second
    And user click by text "KYC"
    When user click by text " Complete Pending Application"
    And user wait for "3000" milli second
    And user click on "Bank" tab
    And user click static text "Add New Bank Account"
    When user enter account number in bank as "123456123456" account screen
    And user enter ifsc code as "UCBA00011340"
    And user Select bank name as "Axis Bank"
    And user click static text "Your name in bank should match with Aadhaar or PAN"
    And user click by text "Continue"
    And user wait for "2000" milli second
    Then user verify static text "Nomination"

  Scenario: Verify Validation in Nomination Screen
    Given application launched successfully
    When user click on hamburger menu
    Then user wait for "3000" milli second
    And user click by text "KYC"
    When user click by text " Complete Pending Application"
    And user wait for "3000" milli second
    And user click on "Nomination" tab
    And user click by text "Suresh, BROTHER"
    When user click static text "Add New Nominee"
    And user click by text "Continue"
    Then verify validation error "Relationship cannot be empty "
    And verify validation error "Name cannot be empty"
    And verify validation error "Dob cannot be empty"
    When user select relation with nominee
    And enter nominee name as "Hari123"
    And user select nomination DOB  as "1"
    Then verify validation error "Invalid characters in name"
    When enter nominee name as "Priyabrat"
    Then verify validation error "Matching with Investor Name"
    When enter nominee name as "Ni"
    Then verify validation error "Name should be at least 3 characters long"
    And user select relation with guardians
    And user scroll to view guardians DOB
    When user enter guardians name as "Ram12"
    And user enter guardian DOB greater than eighteen
    Then verify validation error "Invalid characters in name"
    And verify validation error "Invalid characters in name"
    When enter nominee name as "Manas"
    And user select nomination DOB  as "1"
    And user select relation with guardians
    And user scroll to view guardians DOB
    And user enter guardians name as "Prakash"
    And user enter guardian DOB below eighteen
    Then verify validation error "Guardian age must be greater than 18"

  Scenario: Add Nominee for KYC
    Given application launched successfully
    When user click on hamburger menu
    Then user wait for "3000" milli second
    And user click by text "KYC"
    When user click by text " Complete Pending Application"
    And user wait for "3000" milli second
    And user click on "Nomination" tab
    And user click static text "Add New Nominee"
    And user select relation with nominee as father
    When enter nominee name as "Tahaliprasad"
    And user select nomination DOB
    And user click by text "Continue"
    And user wait for "3000" milli second
    Then user verify Tahaliprasad as nominee name

  Scenario: Verify UI of Photo & Signature Screen
    Given application launched successfully
    When user click on hamburger menu
    Then user wait for "3000" milli second
    And user click by text "KYC"
    When user click by text " Complete Pending Application"
    And user wait for "3000" milli second
    And user verify partial static text "Upload PAN: "
    When user click on Upload PAN (jpeg or png)
    And user wait for "2000" milli second
    And user take pan photo
    And user wait for "2000" milli second
    Then user verify partial static text "Upload PAN:"
    And user click static text "Selfie Photo"
    And user click on Upload Photo (jpeg or png)
    And user take selfie photo
    And user wait for "2000" milli second
    And user verify static text "Signature"
    And user scroll to a sample image of signature
    When user click static text "A Sample Image of signature"
    And user close sign sample popup
    And user click on Upload Signature (jpeg or png)
    And user take signature
    And user verify partial static text "Signature should in blue or black colour"