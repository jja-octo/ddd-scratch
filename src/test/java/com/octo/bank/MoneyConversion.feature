Feature: Money conversion

  Scenario: Convert one currency to another
    Given the "USD" to "EUR" exchange rate is 0.8
    When the bank converts 3 "USD" to "EUR"
    Then the bank answers 2.4 "EUR"