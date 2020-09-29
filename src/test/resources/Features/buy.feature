Feature: User can add multiple items to cart

  Scenario: User can add women blouse
    Given The user is on Homepage
    Then the user clicks Women
    And user clicks Tops
    And User Clicks blouses
    And user clicks on add to cart
    Given the user clicks on continue shopping
    Then the user is returned to the homepage

  Scenario: user can add women evening dress
    Given The user is on Homepage
    Then the user clicks Women
    And user clicks Dresses
    And User Clicks evening dresses
    And user clicks on (Quick View) printed dress
    And user clicks on add to cart from Pop up
    Given the user clicks on continue shopping
    Then the user is returned to the homepage

  Scenario: user verifies shopping cart has 2 items in cart
    Given The user is on Homepage
    Then the user clicks Cart
    And user verifies the total 2 Products
    And User Clicks checkout
    Then user is taken to the AUTHENTICATION screen
