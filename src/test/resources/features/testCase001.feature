Feature: TestCase001
  Scenario: Add product to a basket
    Given I open shop website
    When I open first category
    And I choose second product
    And I click Add to basket button
    And I click check a basket
    And I see my product in basket
    And Go to payment
    And Enter your first and last name
    And Check Selected Country
    And Complete the address fields
    And Add phone number
    And Add email
    And Click buy and pay
    Then Confirm the order placed

