Feature: Login test

  Scenario: OrangeHRM login test scenario
    Given User is on the login page
    When User enters username
    Then User enters password
    Then Clicks on login button