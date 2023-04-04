Feature: TestCase002
  Scenario: Hermione Granger checks the dollar account balance and withdraw all funds.
    Given I open the bank's home page.
    When I choose customer login.
    And I choose Hermione Granger from the list.
    And I click Login.
    And I check if I have selected a dollar account.
    And I check account balance.
    And I choose to withdraw.
    And Enters the total amount of the account.
    And Click withdraw.
    And I confirm the payment of the amount.
    Then I check account balance after transaction.
    Then Close the browser.

