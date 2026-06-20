Feature:Checkout Functionality
Background:Given user is on login page
When user enters "standard_user" and "secret_sauce"
Then user should login successfully
And user adds a product to cart

Scenario: Complete checkout flow
When user proceeds to checkout
And user enters checkout details
And user completed the order
Then order should be placed successfully
