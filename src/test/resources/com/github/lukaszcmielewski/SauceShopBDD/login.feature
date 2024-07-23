Feature: login in sauceShopDemo

  Scenario: Login page
    Given User is on SauceShopDemo
    And Insert login data
    When Click loginButton
    Then user is on InventoryPage
    And Close broswer

  Scenario Outline: Login as different user
    Given User is on SauceShopDemo
    And When I enter Username as "<userLogin>" and Password
    When Click loginButton
    Then user is on InventoryPage
    And Close broswer
    Examples:
      | userLogin               |
      | error_user              |
      | problem_user            |
      | performance_glitch_user |
      | visual_user             |