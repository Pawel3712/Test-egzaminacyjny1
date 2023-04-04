Feature: TestCase004
  Scenario: Ron Weasley checks his rupee account and withdraw X funds.
    Given I open the bank's home page.
    When I choose customer login.
    And I choose Ron Weasley from the list.
    And I click Login.
    And I check if I have selected a rupee account.
    And I check account balance.
    And I choose to withdraw.
    And Withdraw amount X from your account.
    And Click withdraw.
    And I confirm the withdrawal of funds.
    Then I check account balance after transaction.
    Then Close the browser.