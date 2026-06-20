Feature: Login and Signup Functionality

Background:
Given user is on login page

@smoke
Scenario: Valid login
When user enters "standard_user" and "secret_sauce"
Then user should login successfully

@regression
Scenario: Invalid Login
When user enters "wronguser" and "wrongpass"
Then error message should be displayed
