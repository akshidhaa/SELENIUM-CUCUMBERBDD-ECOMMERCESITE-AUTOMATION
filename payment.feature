Feature: Payment functionality

Background:
Given user is on login page
When user enters "standard_user" and "secret_sauce"
Then user should login successfully
And user adds a product to cart

Scenario: Card Payment
When user proceeds to checkout
And user enters checkout details
And user selects card payment
Then payment should be successful

Scenario: GPay Payment
When user proceeds to checkout
And user enters checkout details
And user selects gpay payment
Then payment should be successful
