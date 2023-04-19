Feature:
  Test login page
  Background: Preconditions
    Given Open Azimut "Index" page

  Scenario: Test email field and arrow button
    Then I enter email "toto@gmail.com"
    And I click arrow button

  Scenario: Test Sign In button
    And I click Sign In button

  Scenario: Test Skip Sign In button
    And I click Skip Sign In button
