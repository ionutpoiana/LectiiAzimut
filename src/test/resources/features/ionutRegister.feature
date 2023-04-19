Feature: Test register page on Demo web-site

  Scenario: Test all fields in register page of demo site
    Given Open Demo website register page
    Then Fill First Name: "Teodor Ionut"
    Then Fill Last name: "Poiana"
    Then Fill Address: "Brasov, Jud. Brasov"
    Then Enter email: "ionut.teodor@gmail.com"
    Then Enter phone: "0767123456"
    Then Select gender
    Then Select Hobbies
    Then Select Languages
    Then Select Skills
    But Select Other Skill
    Then Select Country
    And Select country from list
    Then select year, month and day
    Then Enter password: "parola123"
    Then Confirm password: "parola123"
    Then Click Choose File
    And Click Submit
    And Click Refresh