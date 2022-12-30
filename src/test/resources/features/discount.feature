# language: en

Feature: Receive discount coupon
  Me as a user from qazando
  I want to receive a discount coupon
  To buy a course with reduced price

  @coupon
  Scenario: See coupon code
    Given that Im on qazando website
    When I fill email field
    And click on ganhar cupom button
    Then I see the discount code