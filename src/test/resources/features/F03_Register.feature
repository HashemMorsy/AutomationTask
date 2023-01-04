@smoke
Feature: users could register with new accounts
  Description: The purpose of the feature is to read data from json file

  Scenario Outline: guest user could register with valid data successfully
    Given user go to register page
    When he enters "<customer>" personal details on register page
    And  user clicks on register button
    Then success message is displayed
    Examples:
      | customer |
      | Lakshay  |