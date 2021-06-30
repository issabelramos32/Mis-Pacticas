Feature: Register new user

  As a web user
  I want to register in demo qa
  To be able to register

  @smokeTest
  Scenario: Register Successful
    Given that a web user wants to register in advantage shopping online
    When he fills all the requested fields
    Then he should see him username in the homepage
