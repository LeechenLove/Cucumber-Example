Feature: Login Action

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
#    And User enters username and password
    And User enters "test" and "test123456"
    Then Message displayed Login Successfully

  Scenario: Successful LogOut
    When User LogOut from the Application
    Then Message displayed LogOut Successfully