
Feature: User should refer a product to a friend
  @emailAfriend
  Scenario: User Should Successfully refer a product to a friend
    Given User is on homepage
    And    User registered successfully
    When Click on any product from homepage
    Then  User should send email a friend Successfully
  @unregisterUser
  Scenario: user should not able to refer
    Given  user is on a homepage already
    When   click on product from homepage
    Then   unregister user should not able to refer a product

