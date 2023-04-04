Feature: TestCase005

  Scenario: The Bank Manager creates a new user X and opens a dollar account for him. User X then deposits amount X and checks the list of transactions.
    Given I open the bank's home page.
    When Click login bank manager.
    And Select customer options.
    And Enter a random First name.
    And Enter a random Last Name.
    And Enter a random Post Code.
    And Click add customer.
    And Confirm the alert.
    And Go to open an account.
    And Select a new user from the list.
    And Select the dollar currency from the list.
    And Click Process
    And Confirm the alert2.
    And Click the HOME button.
    And Click customer login.
    And Select a new user.
    And I click Login.
    And Confirm the dollar currency.
    And Select deposit.
    And Enter X amount.
    And Click d deposit.
    And Check account balance after transaction.
    And Select transactions.
    Then Confirm payment list.
    Then Close the browser.