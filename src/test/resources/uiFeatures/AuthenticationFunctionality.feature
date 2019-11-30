@TECH-1010
Feature:Authentication functionality

  Scenario: User Creates an account verify it is created by signing in
    Given User goes to the web page
    When User clicks on sign in button
    And User provides an email to create an account
    And User provides necessary information
    Then User verifies that the account created
