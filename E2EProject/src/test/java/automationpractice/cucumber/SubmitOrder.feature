#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Verify I am able to add items to cart and Submit order.
  I want to use this template for testing the Submit order functionality

Background: I land on the hompeage of the application

  @tag1
  Scenario: I want to add items to cart and place an order 
    Given I want to add "Cucumber" to cart
    And I click on Cart button
    And Click on Proceed to Checkout button
    And Click on the Place order button
    And Select "India" from the Country dropdown
    And check the checkbox
    When Click on Proceed button
    Then "Thank you, your order has been placed successfully" message is displayed 

 
