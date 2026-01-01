Feature: Checkout functionality

Background:
Given user has items in the cart and is on checkout information page

@smoke 
Scenario: User completes checkout with valid details
When user enters checkout information
And user continues to checkout overview
Then checkout overview should display selected items
When user confirms the order
Then order should be placed successfully

@sanity 
Scenario: Validate order completion page
When user enters checkout information
And user continues to checkout overview
And user confirms the order
Then thank you message should be displayed
