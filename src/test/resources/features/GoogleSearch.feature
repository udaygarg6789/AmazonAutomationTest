Feature: feature to test Google search functionality
  Scenario: Validate Google search page is working
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And hits enter


