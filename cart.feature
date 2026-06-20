Feature: Cart Functionality
Background:
Given user is on login page 
When user enters "standard_user" and "secret_sauce"
Then user should login successfully
And user adds a producct to cart

Scenario: View cart items
When user goes to cart page
Then user should see items in cart

Scenario: Remove cart items
When user gos to cart page
And user removes an item
Then cart should be updated
