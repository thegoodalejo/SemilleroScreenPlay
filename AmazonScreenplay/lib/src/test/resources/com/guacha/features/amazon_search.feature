#Author: julian.espitaleta@sophossolutions.com
Feature: Searching products on Amazon.com
  I wish to automate the searching of specific products in amazon.com

  Scenario Outline: Automate getting search results in Amazon.com
    Given I have a product I want to search in Amazon.com
    When I search for <product>
    Then I should see search results with prices

    Examples: 
      | product    |
      | joycon     |
      | laptop     |
      | tablet     |
      | headphones |
