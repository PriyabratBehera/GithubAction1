#@Regression @HamburgerMenuRegression
Feature: HamburgerMenu Scenarios

#  @Smoke @HamburgerMenuSmoke
  Scenario: Change Profile Name
    Given user login with user "6888888888 | 6888888888"
    And application launched successfully
    And user click on hamburger menu
    When user click on my avatar icon
    And user verify static text "Mobile Number "
    When user click static text "Change Display Name"
    Then user verify static text "Update Display Name"
    When user edit profile name as one character
    Then verify validation error "Atleast 2 characters required"
    When user click on close icon in update display name screen
    Then user verify static text "My Profile"
    When user click static text "Change Display Name"
    When user rename profile name
    When user go back from "My Profile" screen
    Then user verify partial static text "Hello"

  Scenario: User try to delete account
    Given application launched successfully
    And user click on hamburger menu
    When user click on my avatar icon
    When user click by text "Delete Account"
    Then user verify static text "Why do you want to delete the account?"
    And user verify static text "We are sad to see you go. Please let us know why you decided to leave us."
    When user choose other options in delete account screen
    And user write some reason
    And user click static text "Once I delete my account, all my account related data with Floatr will be deleted completely and it can’t be restored. I consent to delete my account.  "
    When user click by text "Cancel"
    Then user verify static text "Mobile Number "

#  @Smoke @HamburgerMenuSmoke
  Scenario: KYC tab is functional in hamburger menu
    Given application launched successfully
    And user click on hamburger menu
    When user click by text "KYC"
    Then user verify partial static text "Investor Onboarding"
    When user go back from "KYC" screen
    Then user verify partial static text "Hello"

  Scenario: Import Investments tab is functional in hamburger menu
    Given application launched successfully
    And user click on hamburger menu
    When user click by text "Import Investments"
    Then user verify partial static text "Once folios are imported"
    When user go back from "Import Portfolio" screen
    Then user verify partial static text "Hello"

  Scenario: Manage Systematic Plans tab is functional
    Given application launched successfully
    And user click on hamburger menu
    When user click by text "Manage Systematic Plans"
    Then user verify static text "MF SIP"
    And user verify text "MF STP"
    And user verify text "MF SWP"
    And user verify text "Gold SIP"
    And user go back from "My SIPs" screen
    Then user verify partial static text "Hello"

  Scenario: Verify NPS KFIN Services tab is functional
    Given application launched successfully
    And user click on hamburger menu
    And user wait for "2000" milli second
    When user click by text "NPS KFIN Services"
    And user wait for "4000" milli second

  @IdentificationIssue
  Scenario: Verify Faq tab is functional
    Given application launched successfully
    And user click on hamburger menu
    When user click by text "FAQ"

  Scenario: Rewards is functional
    Given application launched successfully
    And user click on hamburger menu
    When user click by text "Rewards"
    Then user verify static text "Total Floatr coins earned till date"
    And user verify static text "BRONZE MEMBER"
    And user verify static text "Rewards Ledger"
    When user click by text "Gold Rewards"
    Then user verify static text "hgiuu"
    And user verify static text "08 Dec, 2023 06:54 PM"
    And user verify static text "₹20.00"
    And user verify static text "0.0030 gm Gold"
    When user click by text "Floatr Coins"
    Then user verify static text "regretttt"
    And user verify static text "08 Dec, 2023 07:02 PM"
    And user verify static text "45 Coins"
    When user go back from "My Rewards" screen
    Then user verify partial static text "Hello"

#  @Smoke @HamburgerMenuSmoke
  Scenario: Support link is functional
    Given application launched successfully
    And user click on hamburger menu
    And user click by text "Support"
    And user select complaint category as "Transaction related"
    And user click by text "NPS"
    And user click by text contains "Tier 1"
    And user enter concern as "Unable to download tier 1 account statement"
#    And user click by text "Select image"
    And user upload screenshot
    When user click by text "Submit"
    Then user verify static text "Complaint History"
    When user click by text "Filters"
    And user click static text "All"
    When user search compl history as "NPS"
    Then user verify static text "NPS"

#  @IdentificationIssue @Smoke @HamburgerMenuSmoke
  Scenario: Feedback tab is functional
    Given application launched successfully
    And user click on hamburger menu
    And user click by text "Feedback"
    And user verify static text "Enjoying our services ?"
    And user click on five star
    When user click by text "Submit"
    And user wait for "4000" milli second
    Then user verify partial static text "Hello"

#  @Smoke @HamburgerMenuSmoke
  Scenario: Verify refer via message in english is functional
    Given application launched successfully
    And user click on hamburger menu
    And user click by text "Refer"
    And user verify partial static text "My Referral Code :"
    And user verify partial static text "Refer your friend to Floatr App"
    When user click by text "Message"
    And user close the select language slider
    And user click by text "Message"
    When user click static text "English"
    And user wait for "5000" milli second
    Then user verify message screen

  Scenario: Verify refer via message in hindi is functional
    Given application launched successfully
    And user click on hamburger menu
    And user click by text "Refer"
    When user click by text "Message"
    When user click static text "Hindi"
    And user wait for "5000" milli second
    Then user verify message screen

  Scenario: Verify private policy is functional
    Given application launched successfully
    And user click on hamburger menu
    And user click by text "Privacy Policy"
    And user verify static text "Updated On 23 Nov, 2022"
    And user verify partial static text " Floatr (ValueFloat Technologies Private Limited) (“we” or “us” or “our” or the “Company”) respects the privacy of its members"
    And user scroll to Address for Privacy Related Questions
    And user verify static text "13. Notifications of Changes"
    And user verify partial static text "1. We may update this Privacy Policy at any time, with or without advance notice."
    When user go back from "Privacy Policy" screen
    Then user verify partial static text "Hello"

  @IdentificationIssue
  Scenario: Verify terms of use is functional
    Given application launched successfully
    And user click on hamburger menu
    When user click by text "Terms of use"
    Then user verify static text "TERMS AND CONDITIONS"
    When user scroll to validity section
    Then user verify static text "XIV. ANNEXURES"
    When user go back from "Terms Of Use" screen
    Then user verify partial static text "Hello"

  Scenario: Verify logout is functional
    Given application launched successfully
    And user click on hamburger menu
    And user click by text "Logout"
    When user click by text "No"
    Then user verify partial static text "Hello"
    When user click on notification icon in dashboard
    When user go back from "Notifications" screen
    Then user verify partial static text "Hello"