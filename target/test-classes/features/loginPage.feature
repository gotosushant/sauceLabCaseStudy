
Feature: Tests for sauce demo login page 

Scenario: Verify Login Page Elements
Given I navigate to the login page
Then Login page UI elements should be proper 


Scenario: Verify that user is able to login successfully to the application
Given I navigate to the login page
When I enter the username "standard_user" and password "secret_sauce"
Then I should be able to login successfully


