Feature: login in sauceShopDemo

  Scenario: Login page
    Given User is on SauceShopDemo
    And Insert login data
    When Click loginButton
    Then user is on InventoryPage
    And Close browser

  Scenario Outline: Login as different user
    Given User is on SauceShopDemo
    And When I enter Username as "<userLogin>" and Password
    When Click loginButton
    Then user is on InventoryPage
    And Close browser
    Examples:
      | userLogin               |
      | error_user              |
      | problem_user            |
      | performance_glitch_user |
      | visual_user             |

  Scenario Outline:  Login as locked user
    Given User is on SauceShopDemo
    And When I enter "<loginProblem>" and "<password>"
    When Click login button
    Then Check messege "<errorMessage>"
    And Close browser
    Examples:
      | loginProblem    | password     | errorMessage                                        |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out. |
      | locked_out_user |              | Epic sadface: Password is required                  |
      |                 |              | Epic sadface: Username is required                  |