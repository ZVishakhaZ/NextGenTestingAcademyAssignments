Feature: Shopping cart functionality

Background:
Given user is logged in successfully

@smoke 
Scenario: User adds a product to the cart
When user adds a product to the cart
And user navigates to the cart page
Then cart should contain 1 product

@sanity
Scenario: User adds multiple products to the cart
When user adds multiple products to the cart
And user navigates to the cart page
Then cart should contain multiple products

@sanity
Scenario: User proceeds to checkout from cart
When user clicks on checkout button
Then user should be navigated to checkout page
