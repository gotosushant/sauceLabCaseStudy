
Feature: Tests for sauce demo product page 

#Adding a scenario that would fail 
Scenario: Verify Product Page Elements
Given I am at the Product page as userName "standard_user" and password "secret_sauce"
Then Login page UI elements should be proper 




