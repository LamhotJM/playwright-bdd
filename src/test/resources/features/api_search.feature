@googleSearch
Feature: Google Suggest API

  @googleSearch
  Scenario: Fetch suggestions for "playwright"
  Given the Google suggest API is available
  When I request suggestions for "playwright"
  Then the response status should be 200
  And the suggestions list should contain "playwright"
