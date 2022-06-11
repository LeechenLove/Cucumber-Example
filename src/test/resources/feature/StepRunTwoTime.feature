Feature: Datables use map

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters Credentials to LogIn Use map
    | username | password|
    | testuser_1 | Test@153 |
    | testuser_2 | Test@188 |
    Then Message displayed Login Successfully