Feature: TestCase003
  Scenario: Harry Potter checks the pound account balance and deposit X funds.
    Given I open the bank's home page.
    When I choose customer login.
    And I choose Harry Potter from the list.
    And I click Login.
    And I check if I'm on a pound account, if not, I change to it.
    And I check account balance.
    And I choose to deposit.
    And I pay amount X.
    And Click deposit.
    And I confirm the payment of the amount.
    Then I check account balance after transaction.
    Then Close the browser.