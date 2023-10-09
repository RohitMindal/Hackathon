#Author: freeautomationlearning@gmail.com
Feature: Test Background Keyword

  Background: 
    Given I open a browser
    When I navigate to google page

  Scenario: Validate google search text field
    Then I validate the username text field
	@SmokeTest @All
  Scenario: insert value in the form 
    Then insert value in the form 

  Scenario: submitted the form 
    Then  submitted the form 
