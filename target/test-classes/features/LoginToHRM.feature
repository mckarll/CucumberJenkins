@Login
Feature: Login Functionality

  @smoke
  Scenario: Valid Login
    #Given I navigated to the HRM website
    When I enter a valid username
    And I enter a valid password
    And I click on the login button
    Then I validate that I am logged in

  #And I will quit the browser
  @regression @smoke
  Scenario: Invalid Password
    #Given I navigated to the HRM website
    When I enter a valid username
    And I enter an invalid password
    And I click on the login button
    Then I validate that Invalid Credentials is displayed
