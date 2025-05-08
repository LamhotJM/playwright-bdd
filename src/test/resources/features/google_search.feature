Feature: Google Search

Scenario: Search for Playwright on Google
  Given I am on Google home page
  When I search for "Playwright"
  Then I see results stats containing "results"
