Feature: Validate Login Page functionality

As a registered user
I want to log in to the application
So that I can access the inventory page

Background:
Given user is on login page

@smoke
Scenario: User logs in with valid credentials
When user enters username "standard_user"
And user enters password "secret_sauce"
And user clicks on login button
Then user should be redirected to inventory page

@sanity
Scenario Outline: User tries to login with invalid credentials
When user enters username "<username>"
And user enters password "<password>"
And user clicks on login button
Then error message should be displayed

Examples:
|username|password|
|invalid_user|secret_sauce|

