Feature: Product Functionality

Background:
Given user is on login page
When user enters "standard_user" and "secret_sauce"
Then user should login successfully

Scenario: Verify Products displayed
Then user should see products list

Scenario: Add products to cart
When user adds a product to cart
Then product should be added successfully
