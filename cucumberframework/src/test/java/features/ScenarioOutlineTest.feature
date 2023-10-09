#Author: freeautomationlearning@gmail.com
Feature: Google Search

  @SearchText
  Scenario Outline: Validate Search feature
    Given I open a browser
    When I navigate to google page
    And I enter "<input>" in search keyword
    Then I submitted the details

    Examples: 
      | searchText |
      | input details   |
     
      