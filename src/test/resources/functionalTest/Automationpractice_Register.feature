Feature: automationpractice.com automtion
  Covers Register, Sign-in in http://automationpractice.com/
  Validation criteria : User should be logged in to check out the product

  Background:
#    If any background is required, as common steps

  @invalid_emailAddress @NegativeScenario
  Scenario Outline: Registering with invalid credential
    Given Load test data for "<TestCase>"
    And user is on Home Page
    When User navigates to SignIn Page
    And User enters "<Email_Type>" Email Address
    And click on create an account
    Then validate for "<Error_Text>" error message

    Examples:
      | TestCase | Email_Type   | Error_Text             |
      | TC_0     | invalid      | Invalid email address. |
      | TC_1     | Already_Used | An account using this email address has already been registered. Please enter a valid password or request a new one. |


  @valid_emailAddress @valid_registration @PositiveScenario
  Scenario Outline: Register with valid credential
    Given Load test data for "<TestCase>"
    And user is on Home Page
    When User navigates to SignIn Page
    And User enters "valid" Email Address
    And click on create an account
    And Enter personal information
    And click on Register
    Then Account created successfully

    Examples:
      | TestCase |
      | TC_2     |
      | TC_3     |