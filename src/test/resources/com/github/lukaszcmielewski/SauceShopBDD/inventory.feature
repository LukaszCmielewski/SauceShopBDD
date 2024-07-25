Feature: InvetoryPage in sauceShopDemo

  Scenario Outline: Check correct image on page
    Given User is on SauceShopDemo and enter "<userLogin>" and Password and clock loginButton
    Then User is in InvetoryPage
    And Check image and expecting "<result>"
    And Close browser
    Examples:
      | userLogin               | result |
      | error_user              | true   |
      | problem_user            | false  |
      | performance_glitch_user | true   |
      | visual_user             | false  |
      | standard_user           | true   |