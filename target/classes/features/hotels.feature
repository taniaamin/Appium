@regression @hotels
Feature: Hotels login feature

  Background:
    Given I am on hotel app home page


  @hotels-TA9
  Scenario: Verify user receives error message for invalid login username and password

    When I scroll down on page
    And I tap on Sign In button
    And I fill out invalid username and password
    Then I verify invalid error message



  @hotels-TA10
  Scenario: Verify user receives error message for invalid login username and password

    When I scroll down on page
    And I tap on Create Account button
    And I fill out required fields
    And I tap on Submit button
    Then I verify successful creation of a home page
