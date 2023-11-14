@Elements
Feature: Elements

  @TextBox
  Scenario: Textbox Page Test Case
    Given user is on textbox page
    When user fill the fullname on textbox page
    When user fill the email on textbox page
    When user fill the current address on textbox page
    When user fill the permanent address on textbox page
    When user clicks to submit button on textbox page

  @CheckBox
  Scenario: CheckBox Page Test Cases
    Given user is on checkbox page
    When select the home folder on checkbox page
    When open the tree of home on checkbox page
    When unselect the office box on checkbox page
