Feature: user purchase a product

  @registeruserbuyproduct
  Scenario: As a register I should be able to purchase product successfully
    Given user register successfully
    And   user choose a product Add product To Add to Cart
    And   user is on checkoutpage
    When  user enters all shipping address details
    And   successfully complete checkout
    Then  user should place an order successfully

    @Guestuserbuyproduct
  Scenario: As a Guest I should be able to purchase product successfully
    Given user choose a product Add product To Add to Cart
    And   user is on checkout as guest page
    When  user enters all shipping address details
    And   successfully complete checkout
    Then  user should place an order successfully


