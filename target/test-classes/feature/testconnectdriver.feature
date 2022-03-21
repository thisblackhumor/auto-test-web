@testBing
Feature: test connect driver

  Scenario Outline:
    Given navigate to search page by "<link>"
    When I input "<text>" in search box and click search button
    Then The search results is display
    When I skip to the second page
    Then Print the title and link of the result
    When I scroll to Top and research "SC"
    Then The search results is display
    When I skip to the second page
    Then Print the title and link of the result

    Examples:
      | link | text |
      | https://www.ianzhang.cn/bing/   | Bing  | 