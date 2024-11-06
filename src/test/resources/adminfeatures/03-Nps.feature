@NPS @Regression
Feature: NPS Scenario

  Scenario: User Add Corporates
    Given page load successfully
    When user click on link "NPS"
    And user click on link "Corporates"
    Then user is in "Corporates" page
    When user click on link "Add Corporates"
    Then user is in "Add-Corporates" page
    When user enter company name as "floatr"
    And user enter brand name as "financial"
    And user select CRA
    And user select state in add corporates page
    And user enter city as "Hyderabad" in add corporates page
    And user enter pin as "500084" in add corporates page
    And user enter CHO as "1984109"
    And user enter CBO online as "1082398"
    And user enter CBO offline as "8709876"
    And user select subscriber fees
    And user select contribution fees
    And user select fees and initial investment
    And user select activation date
    And user wait for "20000" milli second
    And user enter company email id as "xyz@gmail.com"
    And user enter retirement age as "60"
    And user select retirement date
    And user select corporate is co contributor
    And user select investment preference





