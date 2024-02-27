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
Feature: Test the webelements in the forst row

Scenario: Initialize test
  Given I want to launch the browser and open the homepage of the application

  @tag1
  Scenario: Select Radiobutton2

    When I click on Radiobutton2
    Then Radiobutton2 is selected
    
   Scenario: Close browser
  Given I want to close browser
