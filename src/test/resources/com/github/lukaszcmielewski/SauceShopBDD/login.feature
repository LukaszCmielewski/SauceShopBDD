Feature: login in sauceShopDemo
  Scenario: Login page
    Given User is on SauceShopDemo
    And Insert login data
    When Click loginButton
    Then user is on InventoryPage
    And Close broswer

