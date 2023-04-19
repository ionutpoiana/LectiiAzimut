Feature: Test SwitchTo Menu from Automation Demo Site

  Background: Preconditions
    Given Open Demo website register page
    And Click "SwitchTo" button from header

  Scenario: Test "SwitchTo" Menu and it's buttons
    Then Click "Alerts" button
    Then Click the "Windows" button
    And Select "Frames" button

  Scenario: Test buttons from "Alerts with Ok" section of SwitchTo menu
    Then Click "Alerts" button
    Then Click "Alert with OK" button
    Then Click "click the button to display an  alert box:" button
    And In new alert window click OK

  Scenario: Test buttons from "Alerts with Ok & Cancel" section of SwitchTo menu
    Then Click "Alerts" button
    Then Click "Alert with OK & Cancel" button
    Then Click "click the button to display a confirm box" button
    And In new confirm box click Cancel
    But Open confirm box again and click OK

  Scenario: Test buttons from "Alerts with Textbox" section of SwitchTo menu
    Then Click "Alerts" button
    Then Click "Alert with Textbox" button
    Then Click "click the button to demonstrate the prompt box" button
    And In new prompt box click Cancel
    But Open prompt box again and click OK after writing "Ionut"

  Scenario: Test "New Tabbed Windows" section of Windows page
    Then Click the "Windows" button
    Then Select section "Tabbed"
    And Click blue button "click"

  Scenario: Test " New Separate Windows" section of Windows page
    Then Click the "Windows" button
    Then Select section "Seperate"
    And Click the blue button "click"

  Scenario: Test "Separate Multiple Windows" section of Windows page
    Then Click the "Windows" button
    Then Select section "Multiple"
    And Click the button "click"

  Scenario: Test Single frame of Frames page
    Then Select "Frames" button
    Then Select single frame
    And Select text box from frame and write "This is a simple iFrame"

  Scenario: Test iFrame within an iFrame button of Frames page
    Then Select "Frames" button
    Then Select Iframe within an Iframe
    And Navigate within iframes to write "This is an iframe-ception!"

