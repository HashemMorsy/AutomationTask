@smoke
  Feature: users could use login functionality to use their accounts
Scenario: user could login with valid email and password
Given user go to login page
When user login with "valid" "test@example.com" and "P@ssw0rd"
And user press on login button
Then user login to the system successfully

Scenario: user could login with invalid email and password
Given user go to login page
When user login with "invalid" "wrong@example.com" and "P@ssw0rd"
And user press on login button
Then user could not login to the system


  Scenario: user could log out from home page
    Given user go to login page
    When user login with "valid" "test@example.com" and "P@ssw0rd"
    And user press on login button
    And user clicks on logout button
    Then user log out successfully
