@Regression @NPSRegression
Feature: NPS Scenario

  @Validation @NPSValidation
  Scenario: User Unable to Register NPS Account Without Completing KYC
    Given user login with user "9191787806 | 9191787806"
    And application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    And user wait for "2000" milli second
    When user click by text "PRAN Info"
    Then user verify static text "You do not have an active NPS account"
    And user wait for "3000" milli second
    And user click on open nps account
    And user go back from "KYC" screen
    And user click by text "Shift My PRAN"
    And user go back from "KYC" screen
    Then user verify text "History"

  Scenario: Verify Information in "More about NPS" Section
    Given application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    And user wait for "2000" milli second
    When user scroll to view more about NPS
    And user click by text "More About NPS"
    Then user verify static text "NPS Advantage"
    And user verify static text "How NPS works"
    And user verify static text "Accumulation Phase"
    And user verify static text "Government Sponsored & Regulated"
    And user verify static text "Wide Age Eligibility"
    And user verify static text "Flexibility"
    And user verify static text "Better Returns than Traditional Options"

  Scenario: Verify Functionality of NPS Account Types - Tier-1 and Tier-2
    Given application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    When user scroll to view more about NPS
    And user click by text "More About NPS"
    And user wait for "2000" milli second
    And user scroll to view auto choice of investment
    And user click by text "Tier - 2"
    Then user verify static text "Investment Account"
    And user verify static text "Available for only Tier-1 account holders"
    And user verify static text "Free to withdraw anytime, no exit load"
    And user verify static text "No minimum balance"
    And user verify static text "Can transfer fund from Tier-2 to Tier-1 account"
    When user click by text "Tier - 1"
    And user verify static text "Tax Saving Account"
    And user verify static text "Tier 1 account mandatory to join NPS"
    And user verify static text "Investment is locked-in until the age of 60."
    And user verify static text "Early withdrawals are conditional."
    And user verify static text "Tax benefits can be claimed."

  Scenario: Verify Functionality of Portfolio Link on NPS Screen
    Given application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    And user scroll to view more about NPS
    When user click by text "More About NPS"
    And user wait for "2000" milli second
    And user scroll to view active choice of investment
    Then user verify static text "Investment in pre-defined portfolio of NPS asset classes"
    And user verify static text "Portfolio risk (i.e. equity exposure) reduces with age"
    And user verify static text "Can choose portfolio based on risk appetite"
    And user verify static text "Portfolio options- Aggressive (LC-75), Moderate (LC-50) and Conservative (LC-25)"
    And user click by text "Portfolio"
    And user verify static text "Auto Investment Choice"
    And user verify static text "Allocation automatically gets adjusted with the age of the subscriber as shown in the chart below:"
    And user verify static text "Life Cycle Fund Type"
    And user verify static text "Age"
    And user verify static text "Equity"
    And user verify static text "Corp. Bonds"
    And user verify static text "Govt. bonds"
    And user verify static text "Upto 35y"
    And user verify static text "36 years"
    When user select life cycle fund type as moderate LC fifty
    Then user verify static text "50%"
    When user select life cycle fund type as conservative LC twentyFive
    Then user verify static text "25%"
    When user select life cycle fund type as moderate LC seventyFive
    And user verify static text "75%"
    When user close the auto choice investment screen
    Then user verify static text "Features"

  Scenario: Calculate Retirement Plan
    Given application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    And user click by text "Plan My Retirement"
    When user click by text "View Plan"
    Then user verify static text "₹7.09Cr"
    And user verify static text "₹1.26Cr"
    And user verify static text "₹30.65L"
    And user verify static text "₹10,197 /mo "
    And user verify static text "₹3,272 /mo "
    And user verify partial static text "Assumption:"
    And user verify partial static text "Annual growth of 11%"
    And user scroll to post-retirement wealth
    And user verify partial static text "Corpus is invested & it grows at 7% per annum"
    And user verify static text "On retirement, invest the corpus of ₹7.09Cr"
    And user verify static text "Corpus grows at 7% per annum"
    And user verify static text "In first year withdraw ₹30.65L as pension"
    When user go back from "Retirement Plan" screen
    When user enter monthly retirement income needed as "40"
    And enter current age as "28"
    And enter retirement age as "62"
    And user enter income till age of "87" after retirement
    And user invest at annual interest of "13" till retire
    And user invest at annual interest of "11" post retirement
    And user click by text "View Plan"
    Then user verify static text "With current age 28 and retirement age of 62 years"
    And user verify partial static text "I need at 62"
    And user verify partial static text "at age 87"
    And user verify partial static text "Annual growth of 13%"
    And user scroll to post-retirement wealth
    And user verify partial static text "Corpus is invested & it grows at 11% per annum"

  @Validation @NPSValidation
  Scenario: Validate Retirement Plan Calculation
    And application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    And user click by text "Plan My Retirement"
    When enter current age as "15"
    And enter retirement age as "77"
    And user click by text "View Plan"
    Then verify validation error "Current Age must be greater than 18"
    Then user verify Retirement Age must be smaller than seventyFive
    When enter current age as "50"
    And enter retirement age as "45"
    And user click by text "View Plan"
    And verify validation error "Retirement Age must be greater than 50"
    When enter current age as "53"
    And enter retirement age as "55"
    And user click by text "View Plan"
    And verify validation error "Retirement age should be 5 year more than current age"
    When enter current age as "66"
    And enter retirement age as "71"
    And user enter income till age of "74" after retirement
    And user invest at annual interest of "05" till retire
    And user invest at annual interest of "05" post retirement
    And user click by text "View Plan"
    Then verify Current Age must be smaller than sixtyFive
    And verify validation error "Life expectancy should be 5 year more than Retirement Age"
    And verify validation error "Pre-Retirement should be minimum of 6%"
    And verify validation error "Post-Retirement should be minimum of 6%"
    When enter current age as "40"
    And enter retirement age as "50"
    And user enter income till age of "54" after retirement
    And user click by text "View Plan"
    And verify validation error "Life Expectency Age must be greater than 55"

  Scenario: NPS Registration Without Initial contribution and Auto Investment Choice
    Given user login with user "9683386838 | 9683386838"
    And application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    And user click on open nps account
    And user wait for "2000" milli second
    And user click register corporate if display
    And user click on crop details
    When user select company name as "ABC Technologies" in company details screen
    And user click ABC Technologies (ABC Tek)
    And user enter employee number as "DE0024"
    And user enter company joining date as "2"
    And user click "I am signing up for the Corporate Sector NPS and understand how it operates, including the contribution process and applicable POP charges as outlined by the NPS Trust. I have read and agree to the details provided here" check box
    And user click by text "Continue"
    And user wait for "2000" milli second
    Then user not able to see invest tab
    And user not able to select investment fund manager
    And user verify text "Moderate (LC-50)"
    And user not able to select active choice
    And user not able to select portfolio option
    And user click by text "Continue"
    And user click by text "Continue"
    Then user verify text "Submit Application"

  Scenario: NPS Registration Without Initial contribution and Auto Select Active Investment Choice
    Given application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    And user click on open nps account
    When user click by text "Complete Pending Application"
    And user click on crop details
    When user select company name as "DEF Technologies" in company details screen
    And user click on DEF technologies
    And user enter employee number as "HR9987"
    And user enter company joining date as "2"
    And user click "I am signing up for the Corporate Sector NPS and understand how it operates, including the contribution process and applicable POP charges as outlined by the NPS Trust. I have read and agree to the details provided here" check box
    And user click by text "Continue"
    And user wait for "2000" milli second
    Then user verify invest tab
    And user verify text "HDFC PENSION FUND"
    And user not able to select investment fund manager
    And user verify static text "Choose Asset Allocation Total should be 100%"
    And user not able to select auto choice
    And user verify static text "Equity (E) - Upto 75%"
    And user click by text "Continue"
    And user click by text "Continue"
    And user click "Declaration under the Prevention of Money Laundering Act 2002" check box
    And user click by text "Continue"

  Scenario: Verify Error When Corporate Does Not Accept NPS Registration
    Given application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    And user click on open nps account
    When user click by text "Complete Pending Application"
    And user click on crop details
    When user select company name as "Original Valuefloat" in company details screen
    And user click on original value floatr
    Then user verify static text "Registration Closed"
    When user click by text "Register for Individual Sector NPS"
    Then user verify static text "Open NPS Account"

  @Validation @NPSValidation
  Scenario: Validate Nominee Addition Functionality on the Nominee Screen
#    Given user login with user "9683386838 | 9683386838"
    Given application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    And user click on open nps account
    And user wait for "2000" milli second
    And user click register corporate if display
    When user select company name as "Hombale Films (KGF 3)" in company details screen
    And user click on hombale technologies
    And user enter employee number as "FSR12D4"
    And user enter company joining date as "2"
    And user click "I am signing up for the Corporate Sector NPS and understand how it operates, including the contribution process and applicable POP charges as outlined by the NPS Trust. I have read and agree to the details provided here" check box
    And user click by text "Continue"
    And user wait for "2000" milli second
    And user click by text "Continue"
    And user click nominee select box
    When user click by text "Add New Nominee"
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
    When user go back from "Nomination" screen
    And user go back from "Nomination" screen
    Then user verify static text "Review Personal Detail"

  @Validation @NPSValidation
  Scenario: Validate Bank Account Details Submission on the Bank Account Screen
    Given application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    When user click on open nps account
    And user wait for "2000" milli second
    And user click by text "Complete Pending Application"
    When user click partial static text "A/C"
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
    When user go back from "Bank Account" screen
    And user go back from "Bank Account" screen
    Then user verify static text "Nomination"

  @Validation @NPSValidation
  Scenario: Validate Investment Selection Functionality on the Investment Choice Screen
    Given application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    And user click on open nps account
    And user click register corporate if display
    When user select company name as "Hombale Films (KGF 3)" in company details screen
    And user click on hombale technologies
    And user enter employee number as "FSR12D4"
    And user enter company joining date as "2"
    And user click "I am signing up for the Corporate Sector NPS and understand how it operates, including the contribution process and applicable POP charges as outlined by the NPS Trust. I have read and agree to the details provided here" check box
    And user click by text "Continue"
    And user click on pension fund manager drop down
    Then user click by text "SBI PENSION FUND"
    And user wait for "2000" milli second
    And user enter alternative fund (A) as "15"
    And user click by text "Continue"
    When user scroll down
    Then verify validation error "Enter value upto 5 % "
    And user enter alternative fund (A) as "4"
    When user click by text "Continue"
    Then verify validation error "Total Allocation must be 100%"
    When user enter alternative fund (A) as "0"
    And user enter equity (E) as "80"
    And user click by text "Continue"
    Then verify validation error "Enter value upto 75 % "
    When user enter equity (E) as "75"
    And user enter govt security as "20"
    And user click by text "Continue"
    Then verify validation error "Total Allocation must be 100%"
    When user enter govt security as "200"
    And user click by text "Continue"
    Then verify validation error "Total Allocation must be 100%"
    When user enter govt security as "10"
    And user enter corporate bond as "20"
    And user click by text "Continue"
    Then verify validation error "Total Allocation must be 100%"
    When user enter corporate bond as "200"
    And user click by text "Continue"
    Then verify validation error "Total Allocation must be 100%"
    When user go back from "Investment Choices" screen
    Then user verify static text "Employer Detail"

  Scenario: Verify UI Of Initial Contribution Screen
    Given application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    When user click on open nps account
    And user click by text "Complete Pending Application"
    And user click by text "Continue"
    And user enter contribution amount as "501"
    When user click by text "Continue"
    Then user verify static text "Contribution Fees"
    And user verify static text "GST on contribution Fees, @18%"
    And user verify static text "Subscriber Registration Fees"
    And user verify partial static text "Amount"
    And user verify static text "GST @18%"
    And user verify static text "₹30.00"
    And user verify static text "₹5.40"
    And user verify static text "₹400.00"
    And user verify static text "₹72.00"
    And user verify static text "Total Payable"
    And user verify partial static text "₹1,008."
    When user enter contribution amount as "400"
    And user click "Declaration under the Prevention of Money Laundering Act 2002" check box
    And user click by text "Continue"
    Then user verify partial static text "Amount should not be less than 600"

  @Validation @NPSValidation
  Scenario: Validate in Company Details Screen
    Given user login with user "8528528522 | 8528528522"
    And application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    When user click on open nps account
    And user wait for "2000" milli second
    And user click by text " Register for Corporate NPS"
    And user click by text "Continue"
    Then verify validation error "Company Name cannot be empty"
    And verify validation error "Employee Number cannot be empty"
    And verify validation error "Dob cannot be empty"
    When user enter employee number as "FRe$%^"
    Then verify validation error "Invalid characters in field"

  @Validation @NPSValidation
  Scenario: Limit on Adding More than Three Banks
    Given user login with user "9498098098 | 9498098098"
    And user delete bank account as "123456789124"
    And application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    And user click on open nps account
    And user wait for "2000" milli second
    When user click static text "Start New Application"
    Then user verify static text "Re-start NPS Application"
    And user verify static text "Select Subscriber Category"
    And user verify static text "Once you start new application, the partially filled application will be discarded"
    When user close restart nps application screen
    Then user click static text "Start New Application"
    When user select corporate subscriber
    And user click by text "Continue"
    And user wait for "2000" milli second
    When user click by text "Continue"
    Then verify validation error "Company Name cannot be empty"
    And verify validation error "Employee Number cannot be empty"
    And user verify static text "Dob cannot be empty"
    And user select company name as "Hombale Films (KGF 3)" in company details screen
    And user click on hombale technologies
    And user enter employee number as "FRS163"
    And user enter company joining date as "2"
    And user click "I am signing up for the Corporate Sector NPS and understand how it operates, including the contribution process and applicable POP charges as outlined by the NPS Trust. I have read and agree to the details provided here" check box
    And user click by text "Continue"
    And user wait for "3000" milli second
    And user click by text "Continue"
    And user click nominee select box
    And user select one nominee
    Then user verify 100 percent
    When user select two nominee
    Then user verify 50 percent
    And user click by text "Continue"
    And user click partial static text "A/C"
    When user click static text "Add New Bank Account"
    When user enter account number in bank as "123456789124" account screen
    And user enter ifsc code as "UCBA00011234"
    And user Select bank name as "Axis Bank"
    And user click static text "Your name in bank should match with Aadhaar or PAN"
    When user click by text "Continue"
    Then user verify partial static text "Net Banking is not active for this bank, you"
    When user click by text "Yes"
    Then user verify static text "Account Number (Must be Savings Account)"
    When user click by text "Continue"
    And user click by text "No"
    And user wait for "3000" milli second
    And user click partial static text "A/C"
    When user click static text "Add New Bank Account"
    Then user verify validation maximum three banks are allowed
    When user close adding bank popup
    Then user verify static text "Add New Bank Account"

  Scenario: User Adding Nominee to NPS Account
    And application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    And user click on open nps account
    When user click static text "Start New Application"
    Then user select corporate subscriber
    And user select individual subscriber
    And user click by text "Continue"
    And user wait for "3000" milli second
    And user select pension fund manager as "KOTAK MAHINDRA PENSION FUND"
    And user click by text "Auto Choice"
    And user select Portfolio option as "Moderate (LC-50)"
    And user click by text "Continue"
    And user click nominee select box
    And user click static text "Add New Nominee"
    And user select relation with nominee
    When enter nominee name as "Tahaliprasad"
    And user select nomination DOB
    And user click by text "Continue"
    Then user verify text "Tahaliprasad, BROTHER"

  @Smoke @NPSSmoke
  Scenario: Registration as Corporate NPS Account
    Given user delete nps account "8199995555 | 8199995555"
    And user login with user "8199995555 | 8199995555"
    And application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    And user click on open nps account
    And user click by text " Register for Corporate NPS"
    When user select company name as "ABC Technologies" in company details screen
    And user click by text "ABC Technologies (ABC Tek)"
    And user enter employee number as "FR12G34"
    And user enter company joining date as "2"
    And user enter corporate email as "test@gmail.com"
    And user click "I am signing up for the Corporate Sector NPS and understand how it operates, including the contribution process and applicable POP charges as outlined by the NPS Trust. I have read and agree to the details provided here" check box
    And user click by text "Continue"
    And user wait for "2000" milli second
    And user click by text "Continue"
    And user wait for "2000" milli second
    And user click by text "Continue"
    And user enter OTP for in NPS screen
    And user click on submit application
    Then user verify static text "NPS Application Successful"
    And user verify static text "Your PRAN is generated successfully"
    And user verify partial static text "Once your employer verified your account, your PRAN"
    And user verify partial static text "You will be able to do further contribution after your"
    And user scroll to view corporate name
    And user verify bellow corporate nps application status
      | Subscriber Name  | PRAN Status                 | Corporate Name   |
      | PRIYABRAT BEHERA | Awaiting Corporate Approval | ABC Technologies |
    When user click on home button
    And user verify static text "Current Value"
    And user verify static text "Growth"
    When user click by text "PRAN Info"
    Then user verify bellow PRAN information after corporate registration
      | Subscriber Name  | PRAN Status | NPS Sector | CRA  | CHO Name         | CBO Name                  | POP Name                                                 | POP Code |
      | PRIYABRAT BEHERA | Active      | Corporate  | KFIN | ABC Technologies | ABC Technologies - Online | ICICI Prudential Pension Fund Management Private Limited | 1010578  |
    And user verify static text "PRAN"
    And user verify static text "4000 4005 6779"
    And user go back from "PRAN Information" screen
    When user click by text "History"
    Then user verify static text " No Transaction History found"

  @Validation @NPSValidation
  Scenario: Validate When User Shift a PRAN Already Mapped to an Existing PRAN
    Given user delete nps account "8199995555 | 8199995555"
#    And user login with user "8199995555 | 8199995555"
    And application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    And user click on open nps account
    And user click by text " Register for Corporate NPS"
    When user select company name as "ABC Technologies" in company details screen
    And user click by text "ABC Technologies (ABC Tek)"
    And user enter employee number as "FR12G34"
    And user enter company joining date as "2"
    And user enter corporate email as "test@gmail.com"
    And user click "I am signing up for the Corporate Sector NPS and understand how it operates, including the contribution process and applicable POP charges as outlined by the NPS Trust. I have read and agree to the details provided here" check box
    And user click by text "Continue"
    And user wait for "2000" milli second
    And user click by text "Continue"
    And user wait for "2000" milli second
    And user click by text "Continue"
    And user enter OTP for in NPS screen
    And user click on submit application
    And user click by text "Home"
    And user click by text "Shift My PRAN"
    When user search company name as "ABC Technologies" in company name screen
    And user click by text "ABC Technologies (ABC Tek)"
    And user enter employee number as "EF0024"
    And user enter company joining date as "2"
    And user click "I am signing up for the Corporate Sector NPS and understand how it operates, including the contribution process and applicable POP charges as outlined by the NPS Trust. I have read and agree to the details provided here" check box
    And user click by text "Continue"
    Then user verify static text "You are already mapped with this company"

  @Smoke @NPSSmoke
  Scenario: Floatr POP PRAN Shifting From Corporate to Corporate
    Given application launched successfully
    And  user click on NPS Investment
    And user close gold promotion pop up
    When user click by text "Shift My PRAN"
    And user check is there already have NPS account in floatr
    Then user search company name as "Hombale Films (KGF 3)" in company name screen
    And user click on hombale technologies
    And user enter employee number as "FS0032"
    And user enter company joining date as "2"
    And user click "I am signing up for the Corporate Sector NPS and understand how it operates, including the contribution process and applicable POP charges as outlined by the NPS Trust. I have read and agree to the details provided here" check box
    And user click by text "Continue"
    And user enter pran shifting otp
    When user click by text "Submit Application"
    Then user verify static text "Shifting Request Submitted"
    When user click by text "Home"
    And user click by text "PRAN Info"
    And user wait for "5000" milli second
    And user scroll to view shifting acknowledgement
    And user verify static text "Shift to Corporate"
    And user verify static text "In Process"
    And user verify static text "KFIN"
    And user verify static text "Corporate to Corporate"
    And user verify static text "Hombale Films"
    When NPS shifting will be done with this "8199995555 | 8199995555"
    And user go back from "PRAN Information" screen
    And user click by text "PRAN Info"
    Then user verify bellow PRAN information after shifting floatr POP individual to corporate
      | Subscriber Name  | PRAN Status | NPS Sector | CRA  | POP Name                                                 | POP Code | CBO Name               | CBO Code |
      | PRIYABRAT BEHERA | Active      | Corporate  | KFIN | ICICI Prudential Pension Fund Management Private Limited | 1010578  | Hombale Films - Online | 7766885  |

  Scenario: Unsuccessful Registration as Individual NPS Account
    Given user delete nps account "8199995555 | 8199995555"
    And application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    And user click on open nps account
    And user click by text "Register for Individual NPS"
    And user select pension fund manager as "KOTAK MAHINDRA PENSION FUND"
    When user enter equity (E) as "70"
    And user enter govt security as "15"
    And user enter corporate bond as "10"
    And user enter alternative fund (A) as "5"
    And user click by text "Continue"
    And user wait for "2000" milli second
    And user click by text "Continue"
    And user click by text "Continue"
    And user enter contribution amount as "650"
    And user click static text "Declaration under the Prevention of Money Laundering Act 2002"
    And user click by text "Continue"
    And user enter OTP for in NPS screen
    And user click on submit application
    When user do payment fail for nps contribution
    And user wait for NPS registration failed screen
    Then user verify static text "Registration Failed"
    When user click static text "Know More"
    Then user verify static text "Reasons of Failure"
    And user verify static text "payment_processing_error"
    When user close reason of failure screen
    And user click on home button
    When user click on open nps account
    Then user click by text "Complete Pending Application"

  @Smoke @NPSSmoke
  Scenario: Registration as Individual NPS Account
    Given user delete nps account "8199995555 | 8199995555"
    And application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    And user click on open nps account
    And user click by text "Register for Individual NPS"
    And user wait for "3000" milli second
    And user select pension fund manager as "KOTAK MAHINDRA PENSION FUND"
    And user click by text "Active Choice"
    When user enter equity (E) as "70"
    And user enter govt security as "15"
    And user enter corporate bond as "10"
    And user enter alternative fund (A) as "5"
    And user click by text "Continue"
    And user wait for "3000" milli second
    And user click by text "Continue"
    And user click by text "Continue"
    And user verify increasing registration amount
    And user enter contribution amount as "650"
    And user click static text "Declaration under the Prevention of Money Laundering Act 2002"
    And user click by text "Continue"
    And user enter OTP for in NPS screen
    And user click on submit application
    And user do payment for nps contribution
    And user wait for NPS registration successful screen
    Then user verify static text "NPS Application Successful"
    And user verify static text "Your PRAN is generated successfully"
    And user verify partial static text "Initial Contribution"
    And user verify partial static text "Initial investment usually takes upto 3 to 5 working days"
    And user verify bellow individual nps registration status
      | Subscriber Name  | PRAN Status |
      | PRIYABRAT BEHERA | Active      |
    When user click on home button
    And user wait for "2000" milli second
    When user click by text "PRAN Info"
    Then user verify bellow PRAN information after individual registration
      | Subscriber Name  | PRAN Status | NPS Sector | CRA  | POP Name                                                 | POP Code | POP-SP Name                                      | POP-SP Code |
      | PRIYABRAT BEHERA | Active      | Individual | KFIN | ICICI Prudential Pension Fund Management Private Limited | 1010578  | Valuefloat Technologies Private Limited (Floatr) | 1407295     |
    And user go back from "PRAN Information" screen
    When user click by text "History"
    Then user verify successful nps registration transaction as "₹1,157.4"

  @Smoke @NPSSmoke
  Scenario: User makes a contribution to ABC Technologies
    Given application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    When user click by text "Invest in NPS"
    And user check has he NPS account
    And user click by text "Tier-2 Account"
    Then verify validation error "You do not have an active Tier-2 account"
    And user click by text "Tier-1 Account"
    And user enter amount as "499" in  NPS Contribution screen
    And user click by text "Pay Now"
    And user enter amount as "10000" in  NPS Contribution screen
    And user verify static text "Minimum ₹500"
    And user verify static text "Contribution Fees"
    And user verify static text "GST @18%"
    And user verify static text "₹50.00"
    And user verify static text "₹9.00"
    And user verify static text "Total Payable"
    And user verify static text "₹10,059.00"
    And user click by text "Pay Now"
    And user do payment for nps contribution
    And user wait for successful contribution screen
    Then user verify static text "Payment Successful"
    And user verify partial static text "Contribution of ₹10,059.00 is submitted"
    When user click on home button
    And user wait for "2000" milli second
    Then user verify text "Invest in NPS"
    And user wait for "2000" milli second
    When user click by text "History"
    Then user verify successful nps contribution transaction as "₹10,059.00"

  Scenario: User Fail the Invest in Nps
    Given application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    When user click by text "Invest in NPS"
    And user check has he NPS account
    And user enter amount as "5543" in  NPS Contribution screen
    And user click by text "Pay Now"
    And user do payment fail for nps contribution
    And user wait for failed contribution screen
    Then user verify static text "Contribution Failed"
    When user click static text "Know More"
    Then user verify static text "Reasons of Failure"
    And user verify static text "payment_processing_error"
    When user close reason of failure screen
    And user click on home button
    And user click by text "History"
    When user click by text "Sort By"
    When user click by text "Tier 2"
    Then user verify text " No Transaction History found"

  Scenario: Reviewing Contribution Transaction History
    Given application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    And user wait for "2000" milli second
    When user click by text "View Portfolio "
    And user click by text "Tier 2"
    And user verify static text "Schemes"
    And user verify static text "| Tier-2 Holding"
    And user verify static text "Current Value"
    And user verify static text "Investment"
    And user verify static text "P&L"
    And user verify static text "HDFC Pension Management Company Limited Scheme E - Tier II"
    And user verify partial static text "Allocation"
    And user verify partial static text "Invested ₹"
    And user verify partial static text "Current"
    And user verify partial static text "Returns"
    And user verify partial static text "Units"
    And user verify partial static text "NAV ₹"
    And user click by text "Tier 1"
    And user verify static text "| Tier-1 Holding"
    And user verify static text "HDFC Pension Management Company Limited Scheme E - Tier I"

  @Smoke @NPSSmoke
  Scenario: Floatr POP PRAN Shifting from Individual to Corporate
    Given application launched successfully
    And user click on NPS Investment
    And user close gold promotion pop up
    When user click by text "Shift My PRAN"
    And user check has he NPS account
    Then user search company name as "Cha" in company name screen
    And user click by text "Chambadia ()"
    And user enter employee number as "FS0032"
    And user enter company joining date as "2"
    And user select corporate contribution amount
    And user click "My choice of corporate contribution will be shared with my company" check box
    And user click "I am signing up for the Corporate Sector NPS and understand how it operates, including the contribution process and applicable POP charges as outlined by the NPS Trust. I have read and agree to the details provided here" check box
    And user click by text "Continue"
    And user enter pran shifting otp
    When user click by text "Submit Application"
    Then user verify static text "Shifting Request Submitted"
    When user click by text "Home"
    And user click by text "PRAN Info"
    And user wait for "5000" milli second
    And user scroll to view shifting acknowledgement
    Then user verify static text "Shift to Corporate"
    And user verify static text "In Process"
    And user verify static text "This shifting requires HR approval. Companies usually process it in bulk so it may take time. Once HR approves, it may take up to 3 days for shifting.  No action is needed from your side."
    And user verify static text "KFIN"
    And user verify static text "Individual to Corporate"
    And user verify static text "Chambadia"
    When NPS shifting will be done with this "8199995555 | 8199995555"
    And user go back from "PRAN Information" screen
    And user click by text "PRAN Info"
    Then user verify bellow PRAN information after shifting floatr POP individual to corporate
      | Subscriber Name  | PRAN Status | NPS Sector | CRA  | POP Name                                                 | POP Code | CBO Name           | CBO Code |
      | PRIYABRAT BEHERA | Active      | Corporate  | KFIN | ICICI Prudential Pension Fund Management Private Limited | 1010578  | Chambadia - Online | 786945   |
    When user click by text "Login to KFIN"
    Then user verify static text "NPS Services"

  @Validation @NPSValidation
  Scenario: Validate in Existing PRAN Detail Screen
    Given user delete nps account "8199995555 | 8199995555"
    And application launched successfully
    Then user click on NPS Investment
    And user close gold promotion pop up
    And user click by text "Shift My PRAN"
    Then user click by text "Apply for Shifting"
    And user click by text "Continue"
    Then user verify static text "This field is required"
    When user enter pran number as "12345"
    And user enter name in pran cars as "Ramesh&rahul"
    And user click by text "Continue"
    Then user verify static text "PRAN number should be 12 digits long"
    And user verify static text "Please enter valid name"
    When user enter pran number as "223498765675"
    And user enter name in pran cars as "Ramesh-Behera"
    And user click by text "I have POP-SP Code"
    And user enter pop-sp code as "1234"
    And user click by text "Continue"
    Then verify validation error "Enter a valid PRAN Number"
    And verify validation error "Please enter valid name"
    And verify validation error "POP-SP contain only 7 digit"

  @Validation @NPSValidation
  Scenario: Validate in Where to Shift Screen
    Given user delete nps account "8199995555 | 8199995555"
    Given application launched successfully
    And user click on NPS Investment
    And user close gold promotion pop up
    When user click by text "Shift My PRAN"
    And user click by text "Apply for Shifting"
    And user enter pran number as "981234532178"
    And user enter name in pran cars as "Priyabrat Behera"
    And user click by text "I have CBO Code"
    And user enter cbo code as "9876543"
    And user click by text "Continue"
    And user click by text "NSDL"
    Then user click by text "Yes, Continue"
    And user wait for "3000" milli second
    And user click by text "Join Corporate NPS"
    When user search company name as "ABC Technologies" in company name screen
    And user click by text "ABC Technologies (ABC Tek)"
    And user enter employee number as "GF yt 99"
    When user click by text "Continue"
    Then verify validation error "no special character allowed"
    And verify validation error "This field is required"
    When user search company name as "Original Valuefloat" in company name screen
    And user click on original value floatr
    And user wait for "2000" milli second
    When user click by text "Shift PRAN to Individual Sector"
    Then user verify text "Where to Shift?"

  @Validation @NPSValidation
  Scenario: Validate in Validation on OTP Screen
    Given user delete nps account "8199995555 | 8199995555"
    Given application launched successfully
    And user click on NPS Investment
    And user close gold promotion pop up
    When user click by text "Shift My PRAN"
    And user click by text "Apply for Shifting"
    And user enter pran number as "981234532178"
    And user enter name in pran cars as "Priyabrat Behera"
    And user click by text "I have CBO Code"
    And user enter cbo code as "9876543"
    And user click by text "Continue"
    And user click by text "NSDL"
    Then user click by text "Yes, Continue"
    And user wait for "3000" milli second
    And user click by text "Join Individual Sector"
    And user click by text "Continue"
    When user enter invalid pran shifting otp
    And user click by text "Submit Application"
    Then user verify static text "Invalid mobile OTP"
    And user wait for "3000" milli second
    When user click by text "Resend OTP"
    Then user verify static text "OTP is sent successfully"

  @Smoke @NPSSmoke
  Scenario: PRAN Shifting individual to Corporate (Existing PRAN: KFIN)
    Given user delete nps account "8199995555 | 8199995555"
    Given application launched successfully
    And user click on NPS Investment
    And user close gold promotion pop up
    When user click by text "Shift My PRAN"
    And user click by text "Apply for Shifting"
    And user enter pran number as "981234532178"
    And user enter name in pran cars as "Priyabrat Behera"
    And user click by text "I have POP-SP Code"
    And user enter pop-sp code as "9876543"
    And user click by text "Continue"
    And user click by text "KFIN"
    Then user click by text "Yes, Continue"
    And user wait for "3000" milli second
    When user search company name as "ABC Technologies" in company name screen
    And user click by text "ABC Technologies (ABC Tek)"
    And user enter employee number as "GR0098"
    And user enter company joining date as "2"
    And user click "I am signing up for the Corporate Sector NPS and understand how it operates, including the contribution process and applicable POP charges as outlined by the NPS Trust. I have read and agree to the details provided here" check box
    And user click by text "Continue"
    When user enter pran shifting otp
    And user click by text "Submit Application"
    When user click by text "Home"
    And user click by text "PRAN Info"
    And user wait for "5000" milli second
    And user scroll to view shifting acknowledgement
    Then user verify static text "Shift to Corporate"
    And user verify static text "In Process"
    And user verify static text "KFIN"
    And user verify static text "Individual to Corporate"
    And user verify static text "ABC Technologies"
    When NPS shifting will be done with this "8199995555 | 8199995555"
    And user go back from "PRAN Information" screen
    And user click by text "PRAN Info"
    Then user verify bellow PRAN information after shifting floatr POP individual to corporate
      | Subscriber Name  | PRAN Status | NPS Sector | CRA  | POP Name                                                 | POP Code | CBO Name                  | CBO Code |
      | PRIYABRAT BEHERA | Active      | Corporate  | KFIN | ICICI Prudential Pension Fund Management Private Limited | 1010578  | ABC Technologies - Online | 8090111  |

  @Smoke @NPSSmoke
  Scenario: PRAN Shifting Individual to Corporate (Existing PRAN: NSDL)
    Given user delete nps account "8199995555 | 8199995555"
    Given application launched successfully
    And user click on NPS Investment
    And user close gold promotion pop up
    When user click by text "Shift My PRAN"
    And user click by text "Apply for Shifting"
    And user enter pran number as "981234532178"
    And user enter name in pran cars as "Priyabrat Behera"
    And user click by text "I have POP-SP Code"
    And user enter pop-sp code as "9876543"
    And user click by text "Continue"
    And user click by text "NSDL"
    Then user click by text "Yes, Continue"
    And user wait for "3000" milli second
    And user click by text "Join Corporate NPS"
    When user search company name as "ABC Technologies" in company name screen
    And user click by text "ABC Technologies (ABC Tek)"
    And user enter employee number as "GR0098"
    And user enter company joining date as "2"
    And user click "I am signing up for the Corporate Sector NPS and understand how it operates, including the contribution process and applicable POP charges as outlined by the NPS Trust. I have read and agree to the details provided here" check box
    And user click by text "Continue"
    When user enter pran shifting otp
    And user click by text "Submit Application"
    When user click by text "Home"
    And user wait for "4000" milli second
    And user click by text "PRAN Info"
    And user wait for "5000" milli second
    And user scroll to view shifting acknowledgement
    Then user verify static text "CRA Shifting to KFIN"
    And user verify static text "Completed"
    And user verify static text "Shift to Corporate"
    And user verify static text "In Process"
    And user verify static text "NSDL"
    And user verify static text "Individual to Corporate"
    And user verify static text "ABC Technologies"
    When NPS shifting will be done with this "8199995555 | 8199995555"
    And user go back from "PRAN Information" screen
    And user click by text "PRAN Info"
    Then user verify bellow PRAN information after shifting floatr POP individual to corporate
      | Subscriber Name  | PRAN Status | NPS Sector | CRA  | POP Name                                                 | POP Code | CBO Name                  | CBO Code |
      | PRIYABRAT BEHERA | Active      | Corporate  | KFIN | ICICI Prudential Pension Fund Management Private Limited | 1010578  | ABC Technologies - Online | 8090111  |
    And user verify static text "CHO Name"
    And user verify static text "CHO Code"
    And user verify static text "ABC Technologies"

  @Smoke @NPSSmoke
  Scenario: PRAN Shifting Corporate to Individual (Existing PRAN: NSDL)
    Given user delete nps account "8199995555 | 8199995555"
    Given application launched successfully
    And user click on NPS Investment
    And user close gold promotion pop up
    When user click by text "Shift My PRAN"
    And user click by text "Apply for Shifting"
    And user enter pran number as "981234532178"
    And user enter name in pran cars as "Priyabrat Behera"
    And user click by text "I have CBO Code"
    And user enter cbo code as "9876543"
    And user click by text "Continue"
    And user click by text "NSDL"
    Then user click by text "Yes, Continue"
    And user wait for "3000" milli second
    And user click by text "Join Individual Sector"
    And user click by text "Continue"
    And user enter pran shifting otp
    And user click by text "Submit Application"
    When user click by text "Home"
    And user wait for "4000" milli second
    And user click by text "PRAN Info"
    And user wait for "5000" milli second
    Then user verify static text "NSDL to KFIN"
    And user verify static text "In Process"
    And user verify static text "PRAN shifting process"
    And user verify static text "NSDl"
    And user verify static text "Corporate to Individual"