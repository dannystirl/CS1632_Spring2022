Feature: incVal interface

As a user
I want to be able to incVal the Value
So that I can later getVal the Value to see how many times I inced.

  Background: 
    Given a Value

Rule: getVal returns a number equal to the number of times incVal was called.
 
  Scenario: if I call incVal 0 times, then getVal returns 0
    # TODO: Fill in!
    When I call incVal 0 times
    Then getVal returns 0

  Scenario: if I call incVal 1 time, then getVal returns 1
    # TODO: Fill in!
    When I call incVal 1 times
    Then getVal returns 1

  Scenario: if I call incVal 2 times, then getVal returns 2
    # TODO: Fill in!
    When I call incVal 2 times
    Then getVal returns 2
