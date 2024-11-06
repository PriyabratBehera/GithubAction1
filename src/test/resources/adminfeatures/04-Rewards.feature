@ManageMembership @Regression
Feature: Reward Scenario

  Scenario: Add Membership
    Given page load successfully
    When user click on link "Rewards"
    And user click on link "Membership"
    Then user is in "Membership" page
    When user click on link Add membership
    Then user is in "Create-Membership" page
    When user enter membership name as "Digilocker"
    And enter points required for the level
    And user enter redemption limit
    And user enter redemption ratio
    And user enter minimum redemption
    And user enter maximum redemption
    And click on submit in  membership page

  Scenario: Edit Membership
    Given page load successfully
    When user click on link "Rewards"
    And user click on link "Membership"
    Then user is in "Membership" page
    When user click on edit "Digilocker" membership
    Then user is in "Edit-Membership" page
    When user enter membership name as "adityaBirla"
    And enter points required for the level
    And user enter redemption limit
    And user enter redemption ratio
    And user enter minimum redemption
    And user enter maximum redemption
    And click on submit in  membership page

  Scenario: Delete Membership
    Given page load successfully
    When user click on link "Rewards"
    And user click on link "Membership"
    Then user is in "Membership" page
    When user click on delete "adityaBirla" membership
    And user wait for "1000" milli second
